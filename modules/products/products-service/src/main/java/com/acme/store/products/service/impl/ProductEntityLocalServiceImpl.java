/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 * <p>
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 * <p>
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.acme.store.products.service.impl;

import com.acme.store.products.constants.ProductCategoryConstants;
import com.acme.store.products.model.ProductEntity;
import com.acme.store.products.service.base.ProductEntityLocalServiceBaseImpl;
import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.ResourceConstants;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.Validator;
import org.osgi.service.component.annotations.Component;

/**
 * @author Jeff Rogers
 */
@Component(
		property = "model.class.name=com.acme.store.products.model.ProductEntity",
		service = AopService.class
)
public class ProductEntityLocalServiceImpl
		extends ProductEntityLocalServiceBaseImpl {

	/**
	 * This method will add a product and also calls super method which
	 * will trigger a reindex
	 * @param category
	 * @param name
	 * @param price
	 * @param stocked
	 * @param serviceContext
	 * @return
	 * @throws PortalException
	 */
	@Indexable(type = IndexableType.REINDEX)
	public ProductEntity addProductEntity(Integer category, String name, Double price, Boolean stocked, ServiceContext serviceContext) throws PortalException {

		// generate primary key for the product

		long productId = counterLocalService.increment(ProductEntity.class.getName());

		// create product - this does not persist the entity

		ProductEntity product = createProductEntity(productId);

		// populate fields

		product.setCompanyId(serviceContext.getCompanyId());

		product.setCategory(category);

		product.setCreateDate(serviceContext.getCreateDate());

		product.setGroupId(serviceContext.getScopeGroupId());

		product.setModifiedDate(serviceContext.getModifiedDate());

		product.setName(name);

		product.setPrice(price);

		product.setStocked(stocked);

		product.setUserId(serviceContext.getUserId());

		// persist entity to the database - triggers index update

		product = super.addProductEntity(product);

		// add resource permissions

		boolean portletActions = false;

		boolean addGroupPermissions = serviceContext.isAddGroupPermissions(); // should be true

		boolean addGuestPermissions = serviceContext.isAddGuestPermissions(); // should be true

		resourceLocalService.addResources(product.getCompanyId(), product.getGroupId(),
				product.getUserId(), ProductEntity.class.getName(), product.getProductId(), portletActions,
				addGroupPermissions, addGuestPermissions);

		return product;

	}

	/**
	 * This method is intended to be called by the remot service
	 * and will call the super method to trigger indexing
	 * @param productEntity the product entity
	 * @return
	 */
	@Indexable(type = IndexableType.DELETE)
	public ProductEntity deleteProductEntity(ProductEntity productEntity) throws PortalException {

		// delete the permission resources

		resourceLocalService.deleteResource(productEntity.getCompanyId(), ProductEntity.class.getName(), ResourceConstants.SCOPE_INDIVIDUAL, productEntity.getProductId());

		// delete the product

		return super.deleteProductEntity(productEntity);
	}

	/**
	 * This method will "patch" the product (only non-null fields will
	 * be updated).  If no updates are made, the original product is
	 * returned with no changes made.
	 * @param productId
	 * @param category
	 * @param name
	 * @param price
	 * @param stocked
	 * @param serviceContext
	 * @return
	 * @throws PortalException
	 */
	@Indexable(type = IndexableType.REINDEX)
	public ProductEntity patchProductEntity(Long productId, Integer category, String name, Double price, Boolean stocked, ServiceContext serviceContext) throws PortalException {

		// get the product by its id

		ProductEntity product = getProductEntity(productId);

		boolean changed = false;

		// populate fields - patch will only populate non null values

		if (Validator.isNotNull(category) && category != ProductCategoryConstants.INDEX_OTHER) {
			product.setCategory(category);
			changed = true;
		}

		if (Validator.isNotNull(name)) {
			product.setName(name);
			changed = true;
		}

		if (Validator.isNotNull(price)) {
			product.setPrice(price);
			changed = true;
		}

		if (Validator.isNotNull(stocked)) {
			product.setStocked(stocked);
			changed = true;
		}


		// persist product and trigger reindex if changed

		if (changed) {
			product.setModifiedDate(serviceContext.getModifiedDate());
			product = super.updateProductEntity(product);
		}

		return product;

	}

	/**
	 * Updates the product with the fields as-supplied
	 * @param productId
	 * @param category
	 * @param name
	 * @param price
	 * @param stocked
	 * @param serviceContext
	 * @return
	 * @throws PortalException
	 */
	@Indexable(type = IndexableType.REINDEX)
	public ProductEntity updateProductEntity(Long productId, Integer category, String name, Double price, Boolean stocked, ServiceContext serviceContext) throws PortalException {

		// get the product by its id

		ProductEntity product = getProductEntity(productId);

		// populate all fields fields

		product.setCategory(category);

		product.setModifiedDate(serviceContext.getModifiedDate());

		product.setName(name);

		product.setPrice(price);

		product.setStocked(stocked);

		// persist product and trigger reindex

		product = super.updateProductEntity(product);

		return product;

	}


}