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

package com.acme.store.products.internal.security.permission.resource.definition;

import com.acme.store.products.constants.ProductConstants;
import com.acme.store.products.constants.ProductsPortletKeys;
import com.acme.store.products.model.ProductEntity;
import com.acme.store.products.service.ProductEntityLocalService;
import com.liferay.exportimport.kernel.staging.permission.StagingPermission;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.security.permission.resource.ModelResourcePermission;
import com.liferay.portal.kernel.security.permission.resource.ModelResourcePermissionLogic;
import com.liferay.portal.kernel.security.permission.resource.PortletResourcePermission;
import com.liferay.portal.kernel.security.permission.resource.StagedModelPermissionLogic;
import com.liferay.portal.kernel.security.permission.resource.definition.ModelResourcePermissionDefinition;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import java.util.function.Consumer;

/**
 * @author Jeff Rogers
 */
@Component(immediate = true, service = ModelResourcePermissionDefinition.class)
public class ProductEntityModelResourcePermissionDefinition
	implements ModelResourcePermissionDefinition<ProductEntity> {

	@Override
	public ProductEntity getModel(long entryId) throws PortalException {
		return _productEntityLocalService.getProductEntity(entryId);
	}

	@Override
	public Class<ProductEntity> getModelClass() {
		return ProductEntity.class;
	}

	@Override
	public PortletResourcePermission getPortletResourcePermission() {
		return _portletResourcePermission;
	}

	@Override
	public long getPrimaryKey(ProductEntity productEntity) {
		return productEntity.getProductId();
	}

	@Override
	public void registerModelResourcePermissionLogics(
		ModelResourcePermission<ProductEntity> modelResourcePermission,
		Consumer<ModelResourcePermissionLogic<ProductEntity>>
			modelResourcePermissionLogicConsumer) {

		modelResourcePermissionLogicConsumer.accept(
			new StagedModelPermissionLogic<>(
				_stagingPermission, ProductsPortletKeys.PRODUCTS_PORTLET_REACT,
					ProductEntity::getProductId));

		modelResourcePermissionLogicConsumer.accept(
				new StagedModelPermissionLogic<>(
						_stagingPermission, ProductsPortletKeys.PRODUCTS_PORTLET_ANGULAR,
						ProductEntity::getProductId));
	}

	@Reference
	private ProductEntityLocalService _productEntityLocalService;

	@Reference(target = "(resource.name=" + ProductConstants.RESOURCE_NAME + ")")
	private PortletResourcePermission _portletResourcePermission;

	@Reference
	private StagingPermission _stagingPermission;

}