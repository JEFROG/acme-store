/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.acme.store.products.service;

import com.acme.store.products.model.ProductEntity;

import com.liferay.exportimport.kernel.lar.PortletDataContext;
import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.service.BaseLocalService;
import com.liferay.portal.kernel.service.PersistedModelLocalService;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;

import org.osgi.annotation.versioning.ProviderType;

/**
 * Provides the local service interface for ProductEntity. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author Brian Wing Shun Chan
 * @see ProductEntityLocalServiceUtil
 * @generated
 */
@ProviderType
@Transactional(
	isolation = Isolation.PORTAL,
	rollbackFor = {PortalException.class, SystemException.class}
)
public interface ProductEntityLocalService
	extends BaseLocalService, PersistedModelLocalService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add custom service methods to <code>com.acme.store.products.service.impl.ProductEntityLocalServiceImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface. Consume the product entity local service via injection or a <code>org.osgi.util.tracker.ServiceTracker</code>. Use {@link ProductEntityLocalServiceUtil} if injection and service tracking are not available.
	 */

	/**
	 * This method will add a product and also calls super method which
	 * will trigger a reindex
	 *
	 * @param category
	 * @param name
	 * @param price
	 * @param stocked
	 * @param serviceContext
	 * @return
	 * @throws PortalException
	 */
	public ProductEntity addProductEntity(
			Integer category, String name, Double price, Boolean stocked,
			ServiceContext serviceContext)
		throws PortalException;

	/**
	 * Adds the product entity to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ProductEntityLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param productEntity the product entity
	 * @return the product entity that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	public ProductEntity addProductEntity(ProductEntity productEntity);

	/**
	 * @throws PortalException
	 */
	public PersistedModel createPersistedModel(Serializable primaryKeyObj)
		throws PortalException;

	/**
	 * Creates a new product entity with the primary key. Does not add the product entity to the database.
	 *
	 * @param productId the primary key for the new product entity
	 * @return the new product entity
	 */
	@Transactional(enabled = false)
	public ProductEntity createProductEntity(long productId);

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException;

	/**
	 * Deletes the product entity with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ProductEntityLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param productId the primary key of the product entity
	 * @return the product entity that was removed
	 * @throws PortalException if a product entity with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	public ProductEntity deleteProductEntity(long productId)
		throws PortalException;

	/**
	 * Deletes the product entity from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ProductEntityLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param productEntity the product entity
	 * @return the product entity that was removed
	 * @throws PortalException
	 */
	@Indexable(type = IndexableType.DELETE)
	public ProductEntity deleteProductEntity(ProductEntity productEntity)
		throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public <T> T dslQuery(DSLQuery dslQuery);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int dslQueryCount(DSLQuery dslQuery);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public DynamicQuery dynamicQuery();

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery);

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.acme.store.products.model.impl.ProductEntityModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end);

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.acme.store.products.model.impl.ProductEntityModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<T> orderByComparator);

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public long dynamicQueryCount(DynamicQuery dynamicQuery);

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public long dynamicQueryCount(
		DynamicQuery dynamicQuery, Projection projection);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ProductEntity fetchProductEntity(long productId);

	/**
	 * Returns the product entity matching the UUID and group.
	 *
	 * @param uuid the product entity's UUID
	 * @param groupId the primary key of the group
	 * @return the matching product entity, or <code>null</code> if a matching product entity could not be found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ProductEntity fetchProductEntityByUuidAndGroupId(
		String uuid, long groupId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ActionableDynamicQuery getActionableDynamicQuery();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ExportActionableDynamicQuery getExportActionableDynamicQuery(
		PortletDataContext portletDataContext);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public IndexableActionableDynamicQuery getIndexableActionableDynamicQuery();

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public String getOSGiServiceIdentifier();

	/**
	 * @throws PortalException
	 */
	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException;

	/**
	 * Returns a range of all the product entities.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.acme.store.products.model.impl.ProductEntityModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of product entities
	 * @param end the upper bound of the range of product entities (not inclusive)
	 * @return the range of product entities
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<ProductEntity> getProductEntities(int start, int end);

	/**
	 * Returns all the product entities matching the UUID and company.
	 *
	 * @param uuid the UUID of the product entities
	 * @param companyId the primary key of the company
	 * @return the matching product entities, or an empty list if no matches were found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<ProductEntity> getProductEntitiesByUuidAndCompanyId(
		String uuid, long companyId);

	/**
	 * Returns a range of product entities matching the UUID and company.
	 *
	 * @param uuid the UUID of the product entities
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of product entities
	 * @param end the upper bound of the range of product entities (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching product entities, or an empty list if no matches were found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<ProductEntity> getProductEntitiesByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		OrderByComparator<ProductEntity> orderByComparator);

	/**
	 * Returns the number of product entities.
	 *
	 * @return the number of product entities
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getProductEntitiesCount();

	/**
	 * Returns the product entity with the primary key.
	 *
	 * @param productId the primary key of the product entity
	 * @return the product entity
	 * @throws PortalException if a product entity with the primary key could not be found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ProductEntity getProductEntity(long productId)
		throws PortalException;

	/**
	 * Returns the product entity matching the UUID and group.
	 *
	 * @param uuid the product entity's UUID
	 * @param groupId the primary key of the group
	 * @return the matching product entity
	 * @throws PortalException if a matching product entity could not be found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ProductEntity getProductEntityByUuidAndGroupId(
			String uuid, long groupId)
		throws PortalException;

	/**
	 * This method will "patch" the product (only non-null fields will
	 * be updated).  If no updates are made, the original product is
	 * returned with no changes made.
	 *
	 * @param productId
	 * @param category
	 * @param name
	 * @param price
	 * @param stocked
	 * @param serviceContext
	 * @return
	 * @throws PortalException
	 */
	public ProductEntity patchProductEntity(
			Long productId, Integer category, String name, Double price,
			Boolean stocked, ServiceContext serviceContext)
		throws PortalException;

	/**
	 * Updates the product with the fields as-supplied
	 *
	 * @param productId
	 * @param category
	 * @param name
	 * @param price
	 * @param stocked
	 * @param serviceContext
	 * @return
	 * @throws PortalException
	 */
	public ProductEntity updateProductEntity(
			Long productId, Integer category, String name, Double price,
			Boolean stocked, ServiceContext serviceContext)
		throws PortalException;

	/**
	 * Updates the product entity in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ProductEntityLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param productEntity the product entity
	 * @return the product entity that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	public ProductEntity updateProductEntity(ProductEntity productEntity);

}