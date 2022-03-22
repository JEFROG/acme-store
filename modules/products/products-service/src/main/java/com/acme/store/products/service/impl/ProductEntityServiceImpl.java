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

package com.acme.store.products.service.impl;

import com.acme.store.products.constants.ProductConstants;
import com.acme.store.products.model.ProductEntity;
import com.acme.store.products.service.base.ProductEntityServiceBaseImpl;
import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.security.permission.ActionKeys;
import com.liferay.portal.kernel.security.permission.resource.ModelResourcePermission;
import com.liferay.portal.kernel.security.permission.resource.PortletResourcePermission;
import com.liferay.portal.kernel.service.ServiceContext;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferencePolicy;
import org.osgi.service.component.annotations.ReferencePolicyOption;

/**
 * @author Jeff Rogers
 */
@Component(
		property = {
				"json.web.service.context.name=acme",
				"json.web.service.context.path=ProductEntity"
		},
		service = AopService.class
)
public class ProductEntityServiceImpl extends ProductEntityServiceBaseImpl {

	public ProductEntity addProductEntity(Integer category, String name, Double price, Boolean stocked, ServiceContext serviceContext) throws PortalException {

		_portletResourcePermission.check(
				getPermissionChecker(),
				serviceContext.getScopeGroupId(),
				ActionKeys.ADD_ENTRY
		);

		return productEntityLocalService.addProductEntity(category, name, price, stocked, serviceContext);
	}

	public void deleteProductEntity(final Long productId) throws PortalException {

		_productEntityModelResourcePermission.check(
				getPermissionChecker(),
				productId,
				ActionKeys.DELETE);

		productEntityLocalService.deleteProductEntity(productId);

	}

	public ProductEntity getProductEntity(Long productId) throws PortalException {

		ProductEntity product = productEntityLocalService.getProductEntity(productId);

		_productEntityModelResourcePermission.check(
				getPermissionChecker(),
				product,
				ActionKeys.VIEW
		);

		return product;

	}

	public ProductEntity patchProductEntity(Long productId, Integer category, String name, Double price, Boolean stocked, ServiceContext serviceContext) throws PortalException {
		_productEntityModelResourcePermission.check(
				getPermissionChecker(),
				productId,
				ActionKeys.UPDATE
		);
		return productEntityLocalService.patchProductEntity(productId, category, name, price, stocked, serviceContext);
	}

	public ProductEntity updateProductEntity(Long productId, Integer category, String name, Double price, Boolean stocked, ServiceContext serviceContext) throws PortalException {
		_productEntityModelResourcePermission.check(
				getPermissionChecker(),
				productId,
				ActionKeys.UPDATE
		);
		return productEntityLocalService.updateProductEntity(productId, category, name, price, stocked, serviceContext);
	}


	@Reference(
			policy = ReferencePolicy.DYNAMIC,
			policyOption = ReferencePolicyOption.GREEDY,
			target = "(model.class.name=com.acme.store.products.model.ProductEntity)"
	)
	private volatile ModelResourcePermission<ProductEntity>
			_productEntityModelResourcePermission;

	@Reference(
			policy = ReferencePolicy.DYNAMIC,
			policyOption = ReferencePolicyOption.GREEDY,
			target = "(resource.name=" + ProductConstants.RESOURCE_NAME + ")"
	)
	private volatile PortletResourcePermission _portletResourcePermission;
}