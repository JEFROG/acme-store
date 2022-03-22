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

package com.acme.store.products.internal.search.spi.model.index.contributor;

import com.acme.store.products.constants.ProductCategoryConstants;
import com.acme.store.products.model.ProductEntity;
import com.liferay.portal.kernel.search.Document;
import com.liferay.portal.kernel.search.Field;
import com.liferay.portal.search.spi.model.index.contributor.ModelDocumentContributor;

import org.osgi.service.component.annotations.Component;

/**
 * @author Jeff Rogers
 */
@Component(
	immediate = true,
	property = "indexer.class.name=com.acme.store.products.model.ProductEntity",
	service = ModelDocumentContributor.class
)
public class ProductModelDocumentContributor
	implements ModelDocumentContributor<ProductEntity> {

	@Override
	public void contribute(Document document, ProductEntity productEntity) {

		document.addText(Field.NAME, productEntity.getName());

		String category = "";

		if (productEntity.getCategory() == ProductCategoryConstants.INDEX_ELECTRONICS) {
			category = ProductCategoryConstants.ELECTRONICS;
		} else if (productEntity.getCategory() == ProductCategoryConstants.INDEX_SPORTING_GOODS) {
			category = ProductCategoryConstants.SPORTING_GOODS;
		}
		document.addKeyword(Field.TITLE, category);
		document.addText(Field.TITLE, category);
		document.addKeyword(Field.DESCRIPTION, category);
		document.addText(Field.DESCRIPTION, category);
		document.addKeyword(Field.CONTENT, category);
		document.addText(Field.CONTENT, category);
		document.addText(ProductCategoryConstants.CATEGORY, category);
		document.addKeyword(ProductCategoryConstants.CATEGORY, category);

	}

}