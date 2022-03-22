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

package com.acme.store.products.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link ProductEntityService}.
 *
 * @author Brian Wing Shun Chan
 * @see ProductEntityService
 * @generated
 */
public class ProductEntityServiceWrapper
	implements ProductEntityService, ServiceWrapper<ProductEntityService> {

	public ProductEntityServiceWrapper(
		ProductEntityService productEntityService) {

		_productEntityService = productEntityService;
	}

	@Override
	public com.acme.store.products.model.ProductEntity addProductEntity(
			Integer category, String name, Double price, Boolean stocked,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _productEntityService.addProductEntity(
			category, name, price, stocked, serviceContext);
	}

	@Override
	public void deleteProductEntity(Long productId)
		throws com.liferay.portal.kernel.exception.PortalException {

		_productEntityService.deleteProductEntity(productId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _productEntityService.getOSGiServiceIdentifier();
	}

	@Override
	public com.acme.store.products.model.ProductEntity getProductEntity(
			Long productId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _productEntityService.getProductEntity(productId);
	}

	@Override
	public com.acme.store.products.model.ProductEntity patchProductEntity(
			Long productId, Integer category, String name, Double price,
			Boolean stocked,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _productEntityService.patchProductEntity(
			productId, category, name, price, stocked, serviceContext);
	}

	@Override
	public com.acme.store.products.model.ProductEntity updateProductEntity(
			Long productId, Integer category, String name, Double price,
			Boolean stocked,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _productEntityService.updateProductEntity(
			productId, category, name, price, stocked, serviceContext);
	}

	@Override
	public ProductEntityService getWrappedService() {
		return _productEntityService;
	}

	@Override
	public void setWrappedService(ProductEntityService productEntityService) {
		_productEntityService = productEntityService;
	}

	private ProductEntityService _productEntityService;

}