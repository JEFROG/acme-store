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

package com.acme.store.products.model.impl;

import com.acme.store.products.model.ProductEntity;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing ProductEntity in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class ProductEntityCacheModel
	implements CacheModel<ProductEntity>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof ProductEntityCacheModel)) {
			return false;
		}

		ProductEntityCacheModel productEntityCacheModel =
			(ProductEntityCacheModel)object;

		if (productId == productEntityCacheModel.productId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, productId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", productId=");
		sb.append(productId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", category=");
		sb.append(category);
		sb.append(", name=");
		sb.append(name);
		sb.append(", price=");
		sb.append(price);
		sb.append(", stocked=");
		sb.append(stocked);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public ProductEntity toEntityModel() {
		ProductEntityImpl productEntityImpl = new ProductEntityImpl();

		if (uuid == null) {
			productEntityImpl.setUuid("");
		}
		else {
			productEntityImpl.setUuid(uuid);
		}

		productEntityImpl.setProductId(productId);
		productEntityImpl.setGroupId(groupId);
		productEntityImpl.setCompanyId(companyId);
		productEntityImpl.setUserId(userId);

		if (userName == null) {
			productEntityImpl.setUserName("");
		}
		else {
			productEntityImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			productEntityImpl.setCreateDate(null);
		}
		else {
			productEntityImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			productEntityImpl.setModifiedDate(null);
		}
		else {
			productEntityImpl.setModifiedDate(new Date(modifiedDate));
		}

		productEntityImpl.setCategory(category);

		if (name == null) {
			productEntityImpl.setName("");
		}
		else {
			productEntityImpl.setName(name);
		}

		productEntityImpl.setPrice(price);
		productEntityImpl.setStocked(stocked);

		productEntityImpl.resetOriginalValues();

		return productEntityImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		productId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();

		category = objectInput.readInt();
		name = objectInput.readUTF();

		price = objectInput.readDouble();

		stocked = objectInput.readBoolean();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(productId);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		objectOutput.writeInt(category);

		if (name == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(name);
		}

		objectOutput.writeDouble(price);

		objectOutput.writeBoolean(stocked);
	}

	public String uuid;
	public long productId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public int category;
	public String name;
	public double price;
	public boolean stocked;

}