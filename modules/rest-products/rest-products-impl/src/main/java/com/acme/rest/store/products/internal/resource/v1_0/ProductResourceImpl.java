package com.acme.rest.store.products.internal.resource.v1_0;

import com.acme.rest.store.products.dto.v1_0.Product;
import com.acme.rest.store.products.resource.v1_0.ProductResource;

import com.acme.store.products.constants.ProductCategoryConstants;
import com.acme.store.products.model.ProductEntity;
import com.acme.store.products.service.ProductEntityLocalService;
import com.acme.store.products.service.ProductEntityService;
import com.liferay.headless.common.spi.service.context.ServiceContextRequestUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.search.Field;
import com.liferay.portal.kernel.search.Sort;
import com.liferay.portal.kernel.search.filter.Filter;
import com.liferay.portal.kernel.security.auth.PrincipalThreadLocal;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.Portal;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.vulcan.pagination.Page;
import com.liferay.portal.vulcan.pagination.Pagination;
import com.liferay.portal.vulcan.util.SearchUtil;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ServiceScope;

/**
 * @author c02y33mljgh6
 */
@Component(
		properties = "OSGI-INF/liferay/rest/v1_0/product.properties",
		scope = ServiceScope.PROTOTYPE, service = ProductResource.class
)
public class ProductResourceImpl extends BaseProductResourceImpl {

	@Override
	public void deleteProduct(Long productId) throws Exception {

		try {

			_productEntityService.deleteProductEntity(productId);

		} catch (PortalException portalException) {

			// log error

			portalException.printStackTrace();

			// rethrow error

			throw portalException;
		}
	}

	@Override
	public Product getProduct(Long productId) throws Exception {

		try {

			ProductEntity entity = _productEntityService.getProductEntity(productId);

			return _toProduct(entity);

		} catch (PortalException portalException) {

			portalException.printStackTrace();

			throw portalException;

		}

	}

	@Override
	public Page<Product> getProductsPage(String search, Filter filter, Pagination pagination, Sort[] sorts) throws Exception {

		if (sorts == null) {
			sorts = new Sort[] {
					new Sort("category", Sort.STRING_TYPE, false),
					new Sort(Field.NAME, Sort.STRING_TYPE, false)
			};
		}

		try {
			return SearchUtil.search(
					null,
					booleanQuery -> {
					},
					filter, ProductEntity.class.getName(), search, pagination,
					queryConfig -> queryConfig.setSelectedFieldNames(
							Field.ENTRY_CLASS_PK),
					searchContext -> {
						searchContext.setCompanyId(contextCompany.getCompanyId());
					},
					sorts,
					document -> _toProduct(
							_productEntityService.getProductEntity(
									GetterUtil.getLong(document.get(Field.ENTRY_CLASS_PK)))));
		} catch (Exception exception) {

			exception.printStackTrace();

			throw exception;
		}
	}

	@Override
	public Product patchProduct(Long productId, Product product) throws Exception {

		try {
			Product.Category category = Validator.isNull(product.getCategory()) ? Product.Category.OTHER : product.getCategory();
			ProductEntity entity = _productEntityService.patchProductEntity(
					productId,
					_toCategoryCode(category),
					product.getName(),
					product.getPrice(),
					product.getStocked(),
					_getServiceContext()
			);

			return _toProduct(entity);
		} catch (PortalException portalException) {
			portalException.printStackTrace();
			throw portalException;
		}
	}

	@Override
	public Product postProduct(Product product) throws Exception {
		try {
			ProductEntity entity = _productEntityService.addProductEntity(
					_toCategoryCode(product.getCategory()),
					product.getName(),
					product.getPrice(),
					product.getStocked(),
					_getServiceContext()
			);

			return _toProduct(entity);
		} catch (PortalException portalException) {
			portalException.printStackTrace();
			throw portalException;
		}
	}

	@Override
	public Product putProduct(Long productId, Product product) throws Exception {

		try {
			ProductEntity entity = _productEntityService.updateProductEntity(
					productId,
					_toCategoryCode(product.getCategory()),
					product.getName(),
					product.getPrice(),
					product.getStocked(),
					_getServiceContext()
			);

			return _toProduct(entity);
		} catch (PortalException portalException) {
			portalException.printStackTrace();
			throw portalException;
		}

	}

	protected ServiceContext _getServiceContext() {
		long groupId = contextUser.getGroupId();
		ServiceContext serviceContext = ServiceContextRequestUtil.createServiceContext(
				groupId,
				contextHttpServletRequest,
				null
		);

		serviceContext.setCompanyId(contextCompany.getCompanyId());

		// need the current user in the service context.
		// will get easier in newer version of the REST Builder plugin...
		// but for now, this is the only game in town.
		//long userId = PrincipalThreadLocal.getUserId();
		long userId = contextUser.getUserId();
		;
		serviceContext.setUserId(userId);

		return serviceContext;
	}

	private Product _toProduct(ProductEntity entity) {
		Product product = new Product();
		product.setId(entity.getProductId());
		product.setName(entity.getName());
		product.setPrice(entity.getPrice());
		product.setStocked(entity.getStocked());
		product.setCategory(_toProductCategory(entity.getCategory()));
		return product;
	}

	private Product.Category _toProductCategory(int categoryCode) {
		if (categoryCode == ProductCategoryConstants.INDEX_ELECTRONICS) {
			return Product.Category.ELECTRONICS;
		}
		if (categoryCode == ProductCategoryConstants.INDEX_SPORTING_GOODS) {
			return Product.Category.SPORTING_GOODS;
		}
		return Product.Category.OTHER;
	}

	private int _toCategoryCode(Product.Category category) {
		switch (category) {
			case ELECTRONICS:
				return ProductCategoryConstants.INDEX_ELECTRONICS;
			case SPORTING_GOODS:
				return ProductCategoryConstants.INDEX_SPORTING_GOODS;
		}
		return ProductCategoryConstants.INDEX_OTHER;
	}

	@Reference
	private ProductEntityService _productEntityService;

}