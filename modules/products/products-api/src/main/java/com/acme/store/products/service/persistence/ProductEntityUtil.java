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

package com.acme.store.products.service.persistence;

import com.acme.store.products.model.ProductEntity;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the product entity service. This utility wraps <code>com.acme.store.products.service.persistence.impl.ProductEntityPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ProductEntityPersistence
 * @generated
 */
public class ProductEntityUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(ProductEntity productEntity) {
		getPersistence().clearCache(productEntity);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#fetchByPrimaryKeys(Set)
	 */
	public static Map<Serializable, ProductEntity> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<ProductEntity> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<ProductEntity> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<ProductEntity> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<ProductEntity> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static ProductEntity update(ProductEntity productEntity) {
		return getPersistence().update(productEntity);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static ProductEntity update(
		ProductEntity productEntity, ServiceContext serviceContext) {

		return getPersistence().update(productEntity, serviceContext);
	}

	/**
	 * Returns all the product entities where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching product entities
	 */
	public static List<ProductEntity> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the product entities where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ProductEntityModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of product entities
	 * @param end the upper bound of the range of product entities (not inclusive)
	 * @return the range of matching product entities
	 */
	public static List<ProductEntity> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the product entities where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ProductEntityModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of product entities
	 * @param end the upper bound of the range of product entities (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching product entities
	 */
	public static List<ProductEntity> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<ProductEntity> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the product entities where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ProductEntityModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of product entities
	 * @param end the upper bound of the range of product entities (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching product entities
	 */
	public static List<ProductEntity> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<ProductEntity> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first product entity in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching product entity
	 * @throws NoSuchProductEntityException if a matching product entity could not be found
	 */
	public static ProductEntity findByUuid_First(
			String uuid, OrderByComparator<ProductEntity> orderByComparator)
		throws com.acme.store.products.exception.NoSuchProductEntityException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first product entity in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching product entity, or <code>null</code> if a matching product entity could not be found
	 */
	public static ProductEntity fetchByUuid_First(
		String uuid, OrderByComparator<ProductEntity> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last product entity in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching product entity
	 * @throws NoSuchProductEntityException if a matching product entity could not be found
	 */
	public static ProductEntity findByUuid_Last(
			String uuid, OrderByComparator<ProductEntity> orderByComparator)
		throws com.acme.store.products.exception.NoSuchProductEntityException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last product entity in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching product entity, or <code>null</code> if a matching product entity could not be found
	 */
	public static ProductEntity fetchByUuid_Last(
		String uuid, OrderByComparator<ProductEntity> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the product entities before and after the current product entity in the ordered set where uuid = &#63;.
	 *
	 * @param productId the primary key of the current product entity
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next product entity
	 * @throws NoSuchProductEntityException if a product entity with the primary key could not be found
	 */
	public static ProductEntity[] findByUuid_PrevAndNext(
			long productId, String uuid,
			OrderByComparator<ProductEntity> orderByComparator)
		throws com.acme.store.products.exception.NoSuchProductEntityException {

		return getPersistence().findByUuid_PrevAndNext(
			productId, uuid, orderByComparator);
	}

	/**
	 * Removes all the product entities where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of product entities where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching product entities
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the product entity where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchProductEntityException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching product entity
	 * @throws NoSuchProductEntityException if a matching product entity could not be found
	 */
	public static ProductEntity findByUUID_G(String uuid, long groupId)
		throws com.acme.store.products.exception.NoSuchProductEntityException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the product entity where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching product entity, or <code>null</code> if a matching product entity could not be found
	 */
	public static ProductEntity fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the product entity where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching product entity, or <code>null</code> if a matching product entity could not be found
	 */
	public static ProductEntity fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the product entity where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the product entity that was removed
	 */
	public static ProductEntity removeByUUID_G(String uuid, long groupId)
		throws com.acme.store.products.exception.NoSuchProductEntityException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of product entities where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching product entities
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the product entities where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching product entities
	 */
	public static List<ProductEntity> findByUuid_C(
		String uuid, long companyId) {

		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the product entities where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ProductEntityModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of product entities
	 * @param end the upper bound of the range of product entities (not inclusive)
	 * @return the range of matching product entities
	 */
	public static List<ProductEntity> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the product entities where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ProductEntityModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of product entities
	 * @param end the upper bound of the range of product entities (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching product entities
	 */
	public static List<ProductEntity> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<ProductEntity> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the product entities where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ProductEntityModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of product entities
	 * @param end the upper bound of the range of product entities (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching product entities
	 */
	public static List<ProductEntity> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<ProductEntity> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first product entity in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching product entity
	 * @throws NoSuchProductEntityException if a matching product entity could not be found
	 */
	public static ProductEntity findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<ProductEntity> orderByComparator)
		throws com.acme.store.products.exception.NoSuchProductEntityException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first product entity in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching product entity, or <code>null</code> if a matching product entity could not be found
	 */
	public static ProductEntity fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<ProductEntity> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last product entity in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching product entity
	 * @throws NoSuchProductEntityException if a matching product entity could not be found
	 */
	public static ProductEntity findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<ProductEntity> orderByComparator)
		throws com.acme.store.products.exception.NoSuchProductEntityException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last product entity in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching product entity, or <code>null</code> if a matching product entity could not be found
	 */
	public static ProductEntity fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<ProductEntity> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the product entities before and after the current product entity in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param productId the primary key of the current product entity
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next product entity
	 * @throws NoSuchProductEntityException if a product entity with the primary key could not be found
	 */
	public static ProductEntity[] findByUuid_C_PrevAndNext(
			long productId, String uuid, long companyId,
			OrderByComparator<ProductEntity> orderByComparator)
		throws com.acme.store.products.exception.NoSuchProductEntityException {

		return getPersistence().findByUuid_C_PrevAndNext(
			productId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the product entities where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of product entities where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching product entities
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the product entity where name = &#63; or throws a <code>NoSuchProductEntityException</code> if it could not be found.
	 *
	 * @param name the name
	 * @return the matching product entity
	 * @throws NoSuchProductEntityException if a matching product entity could not be found
	 */
	public static ProductEntity findByName(String name)
		throws com.acme.store.products.exception.NoSuchProductEntityException {

		return getPersistence().findByName(name);
	}

	/**
	 * Returns the product entity where name = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param name the name
	 * @return the matching product entity, or <code>null</code> if a matching product entity could not be found
	 */
	public static ProductEntity fetchByName(String name) {
		return getPersistence().fetchByName(name);
	}

	/**
	 * Returns the product entity where name = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param name the name
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching product entity, or <code>null</code> if a matching product entity could not be found
	 */
	public static ProductEntity fetchByName(
		String name, boolean useFinderCache) {

		return getPersistence().fetchByName(name, useFinderCache);
	}

	/**
	 * Removes the product entity where name = &#63; from the database.
	 *
	 * @param name the name
	 * @return the product entity that was removed
	 */
	public static ProductEntity removeByName(String name)
		throws com.acme.store.products.exception.NoSuchProductEntityException {

		return getPersistence().removeByName(name);
	}

	/**
	 * Returns the number of product entities where name = &#63;.
	 *
	 * @param name the name
	 * @return the number of matching product entities
	 */
	public static int countByName(String name) {
		return getPersistence().countByName(name);
	}

	/**
	 * Returns the product entity where category = &#63; or throws a <code>NoSuchProductEntityException</code> if it could not be found.
	 *
	 * @param category the category
	 * @return the matching product entity
	 * @throws NoSuchProductEntityException if a matching product entity could not be found
	 */
	public static ProductEntity findByCategory(int category)
		throws com.acme.store.products.exception.NoSuchProductEntityException {

		return getPersistence().findByCategory(category);
	}

	/**
	 * Returns the product entity where category = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param category the category
	 * @return the matching product entity, or <code>null</code> if a matching product entity could not be found
	 */
	public static ProductEntity fetchByCategory(int category) {
		return getPersistence().fetchByCategory(category);
	}

	/**
	 * Returns the product entity where category = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param category the category
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching product entity, or <code>null</code> if a matching product entity could not be found
	 */
	public static ProductEntity fetchByCategory(
		int category, boolean useFinderCache) {

		return getPersistence().fetchByCategory(category, useFinderCache);
	}

	/**
	 * Removes the product entity where category = &#63; from the database.
	 *
	 * @param category the category
	 * @return the product entity that was removed
	 */
	public static ProductEntity removeByCategory(int category)
		throws com.acme.store.products.exception.NoSuchProductEntityException {

		return getPersistence().removeByCategory(category);
	}

	/**
	 * Returns the number of product entities where category = &#63;.
	 *
	 * @param category the category
	 * @return the number of matching product entities
	 */
	public static int countByCategory(int category) {
		return getPersistence().countByCategory(category);
	}

	/**
	 * Caches the product entity in the entity cache if it is enabled.
	 *
	 * @param productEntity the product entity
	 */
	public static void cacheResult(ProductEntity productEntity) {
		getPersistence().cacheResult(productEntity);
	}

	/**
	 * Caches the product entities in the entity cache if it is enabled.
	 *
	 * @param productEntities the product entities
	 */
	public static void cacheResult(List<ProductEntity> productEntities) {
		getPersistence().cacheResult(productEntities);
	}

	/**
	 * Creates a new product entity with the primary key. Does not add the product entity to the database.
	 *
	 * @param productId the primary key for the new product entity
	 * @return the new product entity
	 */
	public static ProductEntity create(long productId) {
		return getPersistence().create(productId);
	}

	/**
	 * Removes the product entity with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param productId the primary key of the product entity
	 * @return the product entity that was removed
	 * @throws NoSuchProductEntityException if a product entity with the primary key could not be found
	 */
	public static ProductEntity remove(long productId)
		throws com.acme.store.products.exception.NoSuchProductEntityException {

		return getPersistence().remove(productId);
	}

	public static ProductEntity updateImpl(ProductEntity productEntity) {
		return getPersistence().updateImpl(productEntity);
	}

	/**
	 * Returns the product entity with the primary key or throws a <code>NoSuchProductEntityException</code> if it could not be found.
	 *
	 * @param productId the primary key of the product entity
	 * @return the product entity
	 * @throws NoSuchProductEntityException if a product entity with the primary key could not be found
	 */
	public static ProductEntity findByPrimaryKey(long productId)
		throws com.acme.store.products.exception.NoSuchProductEntityException {

		return getPersistence().findByPrimaryKey(productId);
	}

	/**
	 * Returns the product entity with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param productId the primary key of the product entity
	 * @return the product entity, or <code>null</code> if a product entity with the primary key could not be found
	 */
	public static ProductEntity fetchByPrimaryKey(long productId) {
		return getPersistence().fetchByPrimaryKey(productId);
	}

	/**
	 * Returns all the product entities.
	 *
	 * @return the product entities
	 */
	public static List<ProductEntity> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the product entities.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ProductEntityModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of product entities
	 * @param end the upper bound of the range of product entities (not inclusive)
	 * @return the range of product entities
	 */
	public static List<ProductEntity> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the product entities.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ProductEntityModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of product entities
	 * @param end the upper bound of the range of product entities (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of product entities
	 */
	public static List<ProductEntity> findAll(
		int start, int end,
		OrderByComparator<ProductEntity> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the product entities.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ProductEntityModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of product entities
	 * @param end the upper bound of the range of product entities (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of product entities
	 */
	public static List<ProductEntity> findAll(
		int start, int end, OrderByComparator<ProductEntity> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the product entities from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of product entities.
	 *
	 * @return the number of product entities
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static ProductEntityPersistence getPersistence() {
		return _persistence;
	}

	private static volatile ProductEntityPersistence _persistence;

}