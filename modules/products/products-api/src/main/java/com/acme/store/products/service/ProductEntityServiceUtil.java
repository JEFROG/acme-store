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

import com.acme.store.products.model.ProductEntity;

import com.liferay.portal.kernel.exception.PortalException;

/**
 * Provides the remote service utility for ProductEntity. This utility wraps
 * <code>com.acme.store.products.service.impl.ProductEntityServiceImpl</code> and is an
 * access point for service operations in application layer code running on a
 * remote server. Methods of this service are expected to have security checks
 * based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see ProductEntityService
 * @generated
 */
public class ProductEntityServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.acme.store.products.service.impl.ProductEntityServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static ProductEntity addProductEntity(
			Integer category, String name, Double price, Boolean stocked,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws PortalException {

		return getService().addProductEntity(
			category, name, price, stocked, serviceContext);
	}

	public static void deleteProductEntity(Long productId)
		throws PortalException {

		getService().deleteProductEntity(productId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static ProductEntity getProductEntity(Long productId)
		throws PortalException {

		return getService().getProductEntity(productId);
	}

	public static ProductEntity patchProductEntity(
			Long productId, Integer category, String name, Double price,
			Boolean stocked,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws PortalException {

		return getService().patchProductEntity(
			productId, category, name, price, stocked, serviceContext);
	}

	public static ProductEntity updateProductEntity(
			Long productId, Integer category, String name, Double price,
			Boolean stocked,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws PortalException {

		return getService().updateProductEntity(
			productId, category, name, price, stocked, serviceContext);
	}

	public static ProductEntityService getService() {
		return _service;
	}

	private static volatile ProductEntityService _service;

}