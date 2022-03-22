/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 * <p>
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 * <p>
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.acme.store.products.internal.search.spi.model.index.contributor;

import com.acme.store.products.model.ProductEntity;
import com.acme.store.products.service.ProductEntityLocalService;
import com.liferay.portal.kernel.search.Document;
import com.liferay.portal.search.batch.BatchIndexingActionable;
import com.liferay.portal.search.batch.DynamicQueryBatchIndexingActionableFactory;
import com.liferay.portal.search.spi.model.index.contributor.ModelIndexerWriterContributor;
import com.liferay.portal.search.spi.model.index.contributor.helper.IndexerWriterMode;
import com.liferay.portal.search.spi.model.index.contributor.helper.ModelIndexerWriterDocumentHelper;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Jeff Rogers
 */
@Component(
        immediate = true,
        property = "indexer.class.name=com.acme.store.products.model.ProductEntity",
        service = ModelIndexerWriterContributor.class
)
public class ProductModelIndexerWriterContributor
        implements ModelIndexerWriterContributor<ProductEntity> {

    @Override
    public void customize(BatchIndexingActionable batchIndexingActionable, ModelIndexerWriterDocumentHelper modelIndexerWriterDocumentHelper) {
        // we don't need to customize the batchIndexingActionable guy, just use as is.

        batchIndexingActionable.setPerformActionMethod((ProductEntity product) -> {
            Document document = modelIndexerWriterDocumentHelper.getDocument(product);

            batchIndexingActionable.addDocuments(document);
        });
    }

    @Override
    public BatchIndexingActionable getBatchIndexingActionable() {
        return _dynamicQueryBatchIndexingActionableFactory.getBatchIndexingActionable(_productEntityLocalService.getIndexableActionableDynamicQuery());
    }

    @Override
    public long getCompanyId(ProductEntity product) {
        return product.getCompanyId();
    }

    @Override
    public IndexerWriterMode getIndexerWriterMode(ProductEntity vitamin) {
        return IndexerWriterMode.UPDATE;
    }

    @Reference
    private ProductEntityLocalService _productEntityLocalService;

    @Reference
    private DynamicQueryBatchIndexingActionableFactory _dynamicQueryBatchIndexingActionableFactory;
}