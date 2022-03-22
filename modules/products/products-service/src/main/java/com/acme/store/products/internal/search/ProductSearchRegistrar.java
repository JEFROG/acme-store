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

package com.acme.store.products.internal.search;

import com.acme.store.products.constants.ProductCategoryConstants;
import com.acme.store.products.model.ProductEntity;
import com.liferay.portal.kernel.search.Field;
import com.liferay.portal.search.spi.model.index.contributor.ModelIndexerWriterContributor;
import com.liferay.portal.search.spi.model.registrar.ModelSearchRegistrarHelper;
import com.liferay.portal.search.spi.model.result.contributor.ModelSummaryContributor;

import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Jeff Rogers
 */
@Component(immediate = true, service = {})
public class ProductSearchRegistrar {

	@Activate
	protected void activate(BundleContext bundleContext) {
		_serviceRegistration = _modelSearchRegistrarHelper.register(
			ProductEntity.class, bundleContext,
			modelSearchDefinition -> {
				modelSearchDefinition.setDefaultSelectedFieldNames(
						Field.COMPANY_ID,
						Field.ENTRY_CLASS_NAME, Field.ENTRY_CLASS_PK,
						Field.GROUP_ID, Field.SCOPE_GROUP_ID,
						Field.UID, Field.NAME, ProductCategoryConstants.CATEGORY,
						ProductCategoryConstants.STOCKED);

				modelSearchDefinition.setModelIndexWriteContributor(
					_modelIndexWriterContributor);

				modelSearchDefinition.setModelSummaryContributor(
					_modelSummaryContributor);

			});
	}

	@Deactivate
	protected void deactivate() {
		_serviceRegistration.unregister();
	}

	@Reference(
		target = "(indexer.class.name=com.acme.store.products.model.ProductEntity)"
	)
	private ModelIndexerWriterContributor<ProductEntity>
		_modelIndexWriterContributor;

	@Reference
	private ModelSearchRegistrarHelper _modelSearchRegistrarHelper;

	@Reference(
		target = "(indexer.class.name=com.acme.store.products.model.ProductEntity)"
	)
	private ModelSummaryContributor _modelSummaryContributor;

	private ServiceRegistration<?> _serviceRegistration;

}