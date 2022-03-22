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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.acme.store.products.service.http.ProductEntityServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @deprecated As of Athanasius (7.3.x), with no direct replacement
 * @generated
 */
@Deprecated
public class ProductEntitySoap implements Serializable {

	public static ProductEntitySoap toSoapModel(ProductEntity model) {
		ProductEntitySoap soapModel = new ProductEntitySoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setProductId(model.getProductId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setCategory(model.getCategory());
		soapModel.setName(model.getName());
		soapModel.setPrice(model.getPrice());
		soapModel.setStocked(model.isStocked());

		return soapModel;
	}

	public static ProductEntitySoap[] toSoapModels(ProductEntity[] models) {
		ProductEntitySoap[] soapModels = new ProductEntitySoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static ProductEntitySoap[][] toSoapModels(ProductEntity[][] models) {
		ProductEntitySoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new ProductEntitySoap[models.length][models[0].length];
		}
		else {
			soapModels = new ProductEntitySoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static ProductEntitySoap[] toSoapModels(List<ProductEntity> models) {
		List<ProductEntitySoap> soapModels = new ArrayList<ProductEntitySoap>(
			models.size());

		for (ProductEntity model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new ProductEntitySoap[soapModels.size()]);
	}

	public ProductEntitySoap() {
	}

	public long getPrimaryKey() {
		return _productId;
	}

	public void setPrimaryKey(long pk) {
		setProductId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getProductId() {
		return _productId;
	}

	public void setProductId(long productId) {
		_productId = productId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserName() {
		return _userName;
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public int getCategory() {
		return _category;
	}

	public void setCategory(int category) {
		_category = category;
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	public Double getPrice() {
		return _price;
	}

	public void setPrice(Double price) {
		_price = price;
	}

	public boolean getStocked() {
		return _stocked;
	}

	public boolean isStocked() {
		return _stocked;
	}

	public void setStocked(boolean stocked) {
		_stocked = stocked;
	}

	private String _uuid;
	private long _productId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private int _category;
	private String _name;
	private Double _price;
	private boolean _stocked;

}