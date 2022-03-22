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

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link ProductEntityLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see ProductEntityLocalService
 * @generated
 */
public class ProductEntityLocalServiceWrapper
	implements ProductEntityLocalService,
			   ServiceWrapper<ProductEntityLocalService> {

	public ProductEntityLocalServiceWrapper(
		ProductEntityLocalService productEntityLocalService) {

		_productEntityLocalService = productEntityLocalService;
	}

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
	@Override
	public com.acme.store.products.model.ProductEntity addProductEntity(
			Integer category, String name, Double price, Boolean stocked,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _productEntityLocalService.addProductEntity(
			category, name, price, stocked, serviceContext);
	}

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
	@Override
	public com.acme.store.products.model.ProductEntity addProductEntity(
		com.acme.store.products.model.ProductEntity productEntity) {

		return _productEntityLocalService.addProductEntity(productEntity);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _productEntityLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Creates a new product entity with the primary key. Does not add the product entity to the database.
	 *
	 * @param productId the primary key for the new product entity
	 * @return the new product entity
	 */
	@Override
	public com.acme.store.products.model.ProductEntity createProductEntity(
		long productId) {

		return _productEntityLocalService.createProductEntity(productId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _productEntityLocalService.deletePersistedModel(persistedModel);
	}

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
	@Override
	public com.acme.store.products.model.ProductEntity deleteProductEntity(
			long productId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _productEntityLocalService.deleteProductEntity(productId);
	}

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
	@Override
	public com.acme.store.products.model.ProductEntity deleteProductEntity(
			com.acme.store.products.model.ProductEntity productEntity)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _productEntityLocalService.deleteProductEntity(productEntity);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _productEntityLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _productEntityLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _productEntityLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _productEntityLocalService.dynamicQuery(dynamicQuery);
	}

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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _productEntityLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _productEntityLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _productEntityLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _productEntityLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.acme.store.products.model.ProductEntity fetchProductEntity(
		long productId) {

		return _productEntityLocalService.fetchProductEntity(productId);
	}

	/**
	 * Returns the product entity matching the UUID and group.
	 *
	 * @param uuid the product entity's UUID
	 * @param groupId the primary key of the group
	 * @return the matching product entity, or <code>null</code> if a matching product entity could not be found
	 */
	@Override
	public com.acme.store.products.model.ProductEntity
		fetchProductEntityByUuidAndGroupId(String uuid, long groupId) {

		return _productEntityLocalService.fetchProductEntityByUuidAndGroupId(
			uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _productEntityLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _productEntityLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _productEntityLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _productEntityLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _productEntityLocalService.getPersistedModel(primaryKeyObj);
	}

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
	@Override
	public java.util.List<com.acme.store.products.model.ProductEntity>
		getProductEntities(int start, int end) {

		return _productEntityLocalService.getProductEntities(start, end);
	}

	/**
	 * Returns all the product entities matching the UUID and company.
	 *
	 * @param uuid the UUID of the product entities
	 * @param companyId the primary key of the company
	 * @return the matching product entities, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<com.acme.store.products.model.ProductEntity>
		getProductEntitiesByUuidAndCompanyId(String uuid, long companyId) {

		return _productEntityLocalService.getProductEntitiesByUuidAndCompanyId(
			uuid, companyId);
	}

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
	@Override
	public java.util.List<com.acme.store.products.model.ProductEntity>
		getProductEntitiesByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.acme.store.products.model.ProductEntity>
					orderByComparator) {

		return _productEntityLocalService.getProductEntitiesByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of product entities.
	 *
	 * @return the number of product entities
	 */
	@Override
	public int getProductEntitiesCount() {
		return _productEntityLocalService.getProductEntitiesCount();
	}

	/**
	 * Returns the product entity with the primary key.
	 *
	 * @param productId the primary key of the product entity
	 * @return the product entity
	 * @throws PortalException if a product entity with the primary key could not be found
	 */
	@Override
	public com.acme.store.products.model.ProductEntity getProductEntity(
			long productId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _productEntityLocalService.getProductEntity(productId);
	}

	/**
	 * Returns the product entity matching the UUID and group.
	 *
	 * @param uuid the product entity's UUID
	 * @param groupId the primary key of the group
	 * @return the matching product entity
	 * @throws PortalException if a matching product entity could not be found
	 */
	@Override
	public com.acme.store.products.model.ProductEntity
			getProductEntityByUuidAndGroupId(String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _productEntityLocalService.getProductEntityByUuidAndGroupId(
			uuid, groupId);
	}

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
	@Override
	public com.acme.store.products.model.ProductEntity patchProductEntity(
			Long productId, Integer category, String name, Double price,
			Boolean stocked,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _productEntityLocalService.patchProductEntity(
			productId, category, name, price, stocked, serviceContext);
	}

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
	@Override
	public com.acme.store.products.model.ProductEntity updateProductEntity(
			Long productId, Integer category, String name, Double price,
			Boolean stocked,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _productEntityLocalService.updateProductEntity(
			productId, category, name, price, stocked, serviceContext);
	}

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
	@Override
	public com.acme.store.products.model.ProductEntity updateProductEntity(
		com.acme.store.products.model.ProductEntity productEntity) {

		return _productEntityLocalService.updateProductEntity(productEntity);
	}

	@Override
	public ProductEntityLocalService getWrappedService() {
		return _productEntityLocalService;
	}

	@Override
	public void setWrappedService(
		ProductEntityLocalService productEntityLocalService) {

		_productEntityLocalService = productEntityLocalService;
	}

	private ProductEntityLocalService _productEntityLocalService;

}