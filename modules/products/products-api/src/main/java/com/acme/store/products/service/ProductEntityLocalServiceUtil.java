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

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for ProductEntity. This utility wraps
 * <code>com.acme.store.products.service.impl.ProductEntityLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see ProductEntityLocalService
 * @generated
 */
public class ProductEntityLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.acme.store.products.service.impl.ProductEntityLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
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
	public static ProductEntity addProductEntity(
			Integer category, String name, Double price, Boolean stocked,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws PortalException {

		return getService().addProductEntity(
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
	public static ProductEntity addProductEntity(ProductEntity productEntity) {
		return getService().addProductEntity(productEntity);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel createPersistedModel(
			Serializable primaryKeyObj)
		throws PortalException {

		return getService().createPersistedModel(primaryKeyObj);
	}

	/**
	 * Creates a new product entity with the primary key. Does not add the product entity to the database.
	 *
	 * @param productId the primary key for the new product entity
	 * @return the new product entity
	 */
	public static ProductEntity createProductEntity(long productId) {
		return getService().createProductEntity(productId);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel deletePersistedModel(
			PersistedModel persistedModel)
		throws PortalException {

		return getService().deletePersistedModel(persistedModel);
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
	public static ProductEntity deleteProductEntity(long productId)
		throws PortalException {

		return getService().deleteProductEntity(productId);
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
	public static ProductEntity deleteProductEntity(ProductEntity productEntity)
		throws PortalException {

		return getService().deleteProductEntity(productEntity);
	}

	public static <T> T dslQuery(DSLQuery dslQuery) {
		return getService().dslQuery(dslQuery);
	}

	public static int dslQueryCount(DSLQuery dslQuery) {
		return getService().dslQueryCount(dslQuery);
	}

	public static DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	public static <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return getService().dynamicQuery(dynamicQuery);
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
	public static <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getService().dynamicQuery(dynamicQuery, start, end);
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
	public static <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<T> orderByComparator) {

		return getService().dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(DynamicQuery dynamicQuery) {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static ProductEntity fetchProductEntity(long productId) {
		return getService().fetchProductEntity(productId);
	}

	/**
	 * Returns the product entity matching the UUID and group.
	 *
	 * @param uuid the product entity's UUID
	 * @param groupId the primary key of the group
	 * @return the matching product entity, or <code>null</code> if a matching product entity could not be found
	 */
	public static ProductEntity fetchProductEntityByUuidAndGroupId(
		String uuid, long groupId) {

		return getService().fetchProductEntityByUuidAndGroupId(uuid, groupId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return getService().getExportActionableDynamicQuery(portletDataContext);
	}

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return getService().getPersistedModel(primaryKeyObj);
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
	public static List<ProductEntity> getProductEntities(int start, int end) {
		return getService().getProductEntities(start, end);
	}

	/**
	 * Returns all the product entities matching the UUID and company.
	 *
	 * @param uuid the UUID of the product entities
	 * @param companyId the primary key of the company
	 * @return the matching product entities, or an empty list if no matches were found
	 */
	public static List<ProductEntity> getProductEntitiesByUuidAndCompanyId(
		String uuid, long companyId) {

		return getService().getProductEntitiesByUuidAndCompanyId(
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
	public static List<ProductEntity> getProductEntitiesByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		OrderByComparator<ProductEntity> orderByComparator) {

		return getService().getProductEntitiesByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of product entities.
	 *
	 * @return the number of product entities
	 */
	public static int getProductEntitiesCount() {
		return getService().getProductEntitiesCount();
	}

	/**
	 * Returns the product entity with the primary key.
	 *
	 * @param productId the primary key of the product entity
	 * @return the product entity
	 * @throws PortalException if a product entity with the primary key could not be found
	 */
	public static ProductEntity getProductEntity(long productId)
		throws PortalException {

		return getService().getProductEntity(productId);
	}

	/**
	 * Returns the product entity matching the UUID and group.
	 *
	 * @param uuid the product entity's UUID
	 * @param groupId the primary key of the group
	 * @return the matching product entity
	 * @throws PortalException if a matching product entity could not be found
	 */
	public static ProductEntity getProductEntityByUuidAndGroupId(
			String uuid, long groupId)
		throws PortalException {

		return getService().getProductEntityByUuidAndGroupId(uuid, groupId);
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
	public static ProductEntity patchProductEntity(
			Long productId, Integer category, String name, Double price,
			Boolean stocked,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws PortalException {

		return getService().patchProductEntity(
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
	public static ProductEntity updateProductEntity(
			Long productId, Integer category, String name, Double price,
			Boolean stocked,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws PortalException {

		return getService().updateProductEntity(
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
	public static ProductEntity updateProductEntity(
		ProductEntity productEntity) {

		return getService().updateProductEntity(productEntity);
	}

	public static ProductEntityLocalService getService() {
		return _service;
	}

	private static volatile ProductEntityLocalService _service;

}