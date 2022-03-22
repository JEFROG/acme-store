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

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;ACME_ProductEntity&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see ProductEntity
 * @generated
 */
public class ProductEntityTable extends BaseTable<ProductEntityTable> {

	public static final ProductEntityTable INSTANCE = new ProductEntityTable();

	public final Column<ProductEntityTable, String> uuid = createColumn(
		"uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<ProductEntityTable, Long> productId = createColumn(
		"productId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<ProductEntityTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<ProductEntityTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<ProductEntityTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<ProductEntityTable, String> userName = createColumn(
		"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<ProductEntityTable, Date> createDate = createColumn(
		"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<ProductEntityTable, Date> modifiedDate = createColumn(
		"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<ProductEntityTable, Integer> category = createColumn(
		"category", Integer.class, Types.INTEGER, Column.FLAG_DEFAULT);
	public final Column<ProductEntityTable, String> name = createColumn(
		"name", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<ProductEntityTable, Double> price = createColumn(
		"price", Double.class, Types.DOUBLE, Column.FLAG_DEFAULT);
	public final Column<ProductEntityTable, Boolean> stocked = createColumn(
		"stocked", Boolean.class, Types.BOOLEAN, Column.FLAG_DEFAULT);

	private ProductEntityTable() {
		super("ACME_ProductEntity", ProductEntityTable::new);
	}

}