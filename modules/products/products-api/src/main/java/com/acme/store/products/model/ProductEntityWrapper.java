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

package com.acme.store.products.model;

import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link ProductEntity}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ProductEntity
 * @generated
 */
public class ProductEntityWrapper
	extends BaseModelWrapper<ProductEntity>
	implements ModelWrapper<ProductEntity>, ProductEntity {

	public ProductEntityWrapper(ProductEntity productEntity) {
		super(productEntity);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("productId", getProductId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("category", getCategory());
		attributes.put("name", getName());
		attributes.put("price", getPrice());
		attributes.put("stocked", isStocked());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long productId = (Long)attributes.get("productId");

		if (productId != null) {
			setProductId(productId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		Integer category = (Integer)attributes.get("category");

		if (category != null) {
			setCategory(category);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		Double price = (Double)attributes.get("price");

		if (price != null) {
			setPrice(price);
		}

		Boolean stocked = (Boolean)attributes.get("stocked");

		if (stocked != null) {
			setStocked(stocked);
		}
	}

	@Override
	public ProductEntity cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the category of this product entity.
	 *
	 * @return the category of this product entity
	 */
	@Override
	public int getCategory() {
		return model.getCategory();
	}

	/**
	 * Returns the company ID of this product entity.
	 *
	 * @return the company ID of this product entity
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this product entity.
	 *
	 * @return the create date of this product entity
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this product entity.
	 *
	 * @return the group ID of this product entity
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this product entity.
	 *
	 * @return the modified date of this product entity
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the name of this product entity.
	 *
	 * @return the name of this product entity
	 */
	@Override
	public String getName() {
		return model.getName();
	}

	/**
	 * Returns the price of this product entity.
	 *
	 * @return the price of this product entity
	 */
	@Override
	public Double getPrice() {
		return model.getPrice();
	}

	/**
	 * Returns the primary key of this product entity.
	 *
	 * @return the primary key of this product entity
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the product ID of this product entity.
	 *
	 * @return the product ID of this product entity
	 */
	@Override
	public long getProductId() {
		return model.getProductId();
	}

	/**
	 * Returns the stocked of this product entity.
	 *
	 * @return the stocked of this product entity
	 */
	@Override
	public boolean getStocked() {
		return model.getStocked();
	}

	/**
	 * Returns the user ID of this product entity.
	 *
	 * @return the user ID of this product entity
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this product entity.
	 *
	 * @return the user name of this product entity
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this product entity.
	 *
	 * @return the user uuid of this product entity
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this product entity.
	 *
	 * @return the uuid of this product entity
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	/**
	 * Returns <code>true</code> if this product entity is stocked.
	 *
	 * @return <code>true</code> if this product entity is stocked; <code>false</code> otherwise
	 */
	@Override
	public boolean isStocked() {
		return model.isStocked();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the category of this product entity.
	 *
	 * @param category the category of this product entity
	 */
	@Override
	public void setCategory(int category) {
		model.setCategory(category);
	}

	/**
	 * Sets the company ID of this product entity.
	 *
	 * @param companyId the company ID of this product entity
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this product entity.
	 *
	 * @param createDate the create date of this product entity
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this product entity.
	 *
	 * @param groupId the group ID of this product entity
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this product entity.
	 *
	 * @param modifiedDate the modified date of this product entity
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the name of this product entity.
	 *
	 * @param name the name of this product entity
	 */
	@Override
	public void setName(String name) {
		model.setName(name);
	}

	/**
	 * Sets the price of this product entity.
	 *
	 * @param price the price of this product entity
	 */
	@Override
	public void setPrice(Double price) {
		model.setPrice(price);
	}

	/**
	 * Sets the primary key of this product entity.
	 *
	 * @param primaryKey the primary key of this product entity
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the product ID of this product entity.
	 *
	 * @param productId the product ID of this product entity
	 */
	@Override
	public void setProductId(long productId) {
		model.setProductId(productId);
	}

	/**
	 * Sets whether this product entity is stocked.
	 *
	 * @param stocked the stocked of this product entity
	 */
	@Override
	public void setStocked(boolean stocked) {
		model.setStocked(stocked);
	}

	/**
	 * Sets the user ID of this product entity.
	 *
	 * @param userId the user ID of this product entity
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this product entity.
	 *
	 * @param userName the user name of this product entity
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this product entity.
	 *
	 * @param userUuid the user uuid of this product entity
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this product entity.
	 *
	 * @param uuid the uuid of this product entity
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	@Override
	public StagedModelType getStagedModelType() {
		return model.getStagedModelType();
	}

	@Override
	protected ProductEntityWrapper wrap(ProductEntity productEntity) {
		return new ProductEntityWrapper(productEntity);
	}

}