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

import com.acme.store.products.exception.NoSuchProductEntityException;
import com.acme.store.products.model.ProductEntity;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the product entity service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ProductEntityUtil
 * @generated
 */
@ProviderType
public interface ProductEntityPersistence
	extends BasePersistence<ProductEntity> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ProductEntityUtil} to access the product entity persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the product entities where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching product entities
	 */
	public java.util.List<ProductEntity> findByUuid(String uuid);

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
	public java.util.List<ProductEntity> findByUuid(
		String uuid, int start, int end);

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
	public java.util.List<ProductEntity> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ProductEntity>
			orderByComparator);

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
	public java.util.List<ProductEntity> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ProductEntity>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first product entity in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching product entity
	 * @throws NoSuchProductEntityException if a matching product entity could not be found
	 */
	public ProductEntity findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<ProductEntity>
				orderByComparator)
		throws NoSuchProductEntityException;

	/**
	 * Returns the first product entity in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching product entity, or <code>null</code> if a matching product entity could not be found
	 */
	public ProductEntity fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<ProductEntity>
			orderByComparator);

	/**
	 * Returns the last product entity in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching product entity
	 * @throws NoSuchProductEntityException if a matching product entity could not be found
	 */
	public ProductEntity findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<ProductEntity>
				orderByComparator)
		throws NoSuchProductEntityException;

	/**
	 * Returns the last product entity in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching product entity, or <code>null</code> if a matching product entity could not be found
	 */
	public ProductEntity fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<ProductEntity>
			orderByComparator);

	/**
	 * Returns the product entities before and after the current product entity in the ordered set where uuid = &#63;.
	 *
	 * @param productId the primary key of the current product entity
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next product entity
	 * @throws NoSuchProductEntityException if a product entity with the primary key could not be found
	 */
	public ProductEntity[] findByUuid_PrevAndNext(
			long productId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<ProductEntity>
				orderByComparator)
		throws NoSuchProductEntityException;

	/**
	 * Removes all the product entities where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of product entities where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching product entities
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the product entity where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchProductEntityException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching product entity
	 * @throws NoSuchProductEntityException if a matching product entity could not be found
	 */
	public ProductEntity findByUUID_G(String uuid, long groupId)
		throws NoSuchProductEntityException;

	/**
	 * Returns the product entity where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching product entity, or <code>null</code> if a matching product entity could not be found
	 */
	public ProductEntity fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the product entity where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching product entity, or <code>null</code> if a matching product entity could not be found
	 */
	public ProductEntity fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the product entity where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the product entity that was removed
	 */
	public ProductEntity removeByUUID_G(String uuid, long groupId)
		throws NoSuchProductEntityException;

	/**
	 * Returns the number of product entities where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching product entities
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the product entities where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching product entities
	 */
	public java.util.List<ProductEntity> findByUuid_C(
		String uuid, long companyId);

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
	public java.util.List<ProductEntity> findByUuid_C(
		String uuid, long companyId, int start, int end);

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
	public java.util.List<ProductEntity> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ProductEntity>
			orderByComparator);

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
	public java.util.List<ProductEntity> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ProductEntity>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first product entity in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching product entity
	 * @throws NoSuchProductEntityException if a matching product entity could not be found
	 */
	public ProductEntity findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<ProductEntity>
				orderByComparator)
		throws NoSuchProductEntityException;

	/**
	 * Returns the first product entity in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching product entity, or <code>null</code> if a matching product entity could not be found
	 */
	public ProductEntity fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<ProductEntity>
			orderByComparator);

	/**
	 * Returns the last product entity in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching product entity
	 * @throws NoSuchProductEntityException if a matching product entity could not be found
	 */
	public ProductEntity findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<ProductEntity>
				orderByComparator)
		throws NoSuchProductEntityException;

	/**
	 * Returns the last product entity in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching product entity, or <code>null</code> if a matching product entity could not be found
	 */
	public ProductEntity fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<ProductEntity>
			orderByComparator);

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
	public ProductEntity[] findByUuid_C_PrevAndNext(
			long productId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<ProductEntity>
				orderByComparator)
		throws NoSuchProductEntityException;

	/**
	 * Removes all the product entities where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of product entities where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching product entities
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns the product entity where name = &#63; or throws a <code>NoSuchProductEntityException</code> if it could not be found.
	 *
	 * @param name the name
	 * @return the matching product entity
	 * @throws NoSuchProductEntityException if a matching product entity could not be found
	 */
	public ProductEntity findByName(String name)
		throws NoSuchProductEntityException;

	/**
	 * Returns the product entity where name = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param name the name
	 * @return the matching product entity, or <code>null</code> if a matching product entity could not be found
	 */
	public ProductEntity fetchByName(String name);

	/**
	 * Returns the product entity where name = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param name the name
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching product entity, or <code>null</code> if a matching product entity could not be found
	 */
	public ProductEntity fetchByName(String name, boolean useFinderCache);

	/**
	 * Removes the product entity where name = &#63; from the database.
	 *
	 * @param name the name
	 * @return the product entity that was removed
	 */
	public ProductEntity removeByName(String name)
		throws NoSuchProductEntityException;

	/**
	 * Returns the number of product entities where name = &#63;.
	 *
	 * @param name the name
	 * @return the number of matching product entities
	 */
	public int countByName(String name);

	/**
	 * Returns the product entity where category = &#63; or throws a <code>NoSuchProductEntityException</code> if it could not be found.
	 *
	 * @param category the category
	 * @return the matching product entity
	 * @throws NoSuchProductEntityException if a matching product entity could not be found
	 */
	public ProductEntity findByCategory(int category)
		throws NoSuchProductEntityException;

	/**
	 * Returns the product entity where category = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param category the category
	 * @return the matching product entity, or <code>null</code> if a matching product entity could not be found
	 */
	public ProductEntity fetchByCategory(int category);

	/**
	 * Returns the product entity where category = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param category the category
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching product entity, or <code>null</code> if a matching product entity could not be found
	 */
	public ProductEntity fetchByCategory(int category, boolean useFinderCache);

	/**
	 * Removes the product entity where category = &#63; from the database.
	 *
	 * @param category the category
	 * @return the product entity that was removed
	 */
	public ProductEntity removeByCategory(int category)
		throws NoSuchProductEntityException;

	/**
	 * Returns the number of product entities where category = &#63;.
	 *
	 * @param category the category
	 * @return the number of matching product entities
	 */
	public int countByCategory(int category);

	/**
	 * Caches the product entity in the entity cache if it is enabled.
	 *
	 * @param productEntity the product entity
	 */
	public void cacheResult(ProductEntity productEntity);

	/**
	 * Caches the product entities in the entity cache if it is enabled.
	 *
	 * @param productEntities the product entities
	 */
	public void cacheResult(java.util.List<ProductEntity> productEntities);

	/**
	 * Creates a new product entity with the primary key. Does not add the product entity to the database.
	 *
	 * @param productId the primary key for the new product entity
	 * @return the new product entity
	 */
	public ProductEntity create(long productId);

	/**
	 * Removes the product entity with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param productId the primary key of the product entity
	 * @return the product entity that was removed
	 * @throws NoSuchProductEntityException if a product entity with the primary key could not be found
	 */
	public ProductEntity remove(long productId)
		throws NoSuchProductEntityException;

	public ProductEntity updateImpl(ProductEntity productEntity);

	/**
	 * Returns the product entity with the primary key or throws a <code>NoSuchProductEntityException</code> if it could not be found.
	 *
	 * @param productId the primary key of the product entity
	 * @return the product entity
	 * @throws NoSuchProductEntityException if a product entity with the primary key could not be found
	 */
	public ProductEntity findByPrimaryKey(long productId)
		throws NoSuchProductEntityException;

	/**
	 * Returns the product entity with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param productId the primary key of the product entity
	 * @return the product entity, or <code>null</code> if a product entity with the primary key could not be found
	 */
	public ProductEntity fetchByPrimaryKey(long productId);

	/**
	 * Returns all the product entities.
	 *
	 * @return the product entities
	 */
	public java.util.List<ProductEntity> findAll();

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
	public java.util.List<ProductEntity> findAll(int start, int end);

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
	public java.util.List<ProductEntity> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ProductEntity>
			orderByComparator);

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
	public java.util.List<ProductEntity> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ProductEntity>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the product entities from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of product entities.
	 *
	 * @return the number of product entities
	 */
	public int countAll();

}