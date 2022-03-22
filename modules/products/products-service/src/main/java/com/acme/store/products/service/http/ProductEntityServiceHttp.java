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

package com.acme.store.products.service.http;

import com.acme.store.products.service.ProductEntityServiceUtil;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.security.auth.HttpPrincipal;
import com.liferay.portal.kernel.service.http.TunnelUtil;
import com.liferay.portal.kernel.util.MethodHandler;
import com.liferay.portal.kernel.util.MethodKey;

/**
 * Provides the HTTP utility for the
 * <code>ProductEntityServiceUtil</code> service
 * utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it requires an additional
 * <code>HttpPrincipal</code> parameter.
 *
 * <p>
 * The benefits of using the HTTP utility is that it is fast and allows for
 * tunneling without the cost of serializing to text. The drawback is that it
 * only works with Java.
 * </p>
 *
 * <p>
 * Set the property <b>tunnel.servlet.hosts.allowed</b> in portal.properties to
 * configure security.
 * </p>
 *
 * <p>
 * The HTTP utility is only generated for remote services.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ProductEntityServiceSoap
 * @generated
 */
public class ProductEntityServiceHttp {

	public static com.acme.store.products.model.ProductEntity addProductEntity(
			HttpPrincipal httpPrincipal, Integer category, String name,
			Double price, Boolean stocked,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				ProductEntityServiceUtil.class, "addProductEntity",
				_addProductEntityParameterTypes0);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, category, name, price, stocked, serviceContext);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				if (exception instanceof
						com.liferay.portal.kernel.exception.PortalException) {

					throw (com.liferay.portal.kernel.exception.PortalException)
						exception;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (com.acme.store.products.model.ProductEntity)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static void deleteProductEntity(
			HttpPrincipal httpPrincipal, Long productId)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				ProductEntityServiceUtil.class, "deleteProductEntity",
				_deleteProductEntityParameterTypes1);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, productId);

			try {
				TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				if (exception instanceof
						com.liferay.portal.kernel.exception.PortalException) {

					throw (com.liferay.portal.kernel.exception.PortalException)
						exception;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static com.acme.store.products.model.ProductEntity getProductEntity(
			HttpPrincipal httpPrincipal, Long productId)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				ProductEntityServiceUtil.class, "getProductEntity",
				_getProductEntityParameterTypes2);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, productId);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				if (exception instanceof
						com.liferay.portal.kernel.exception.PortalException) {

					throw (com.liferay.portal.kernel.exception.PortalException)
						exception;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (com.acme.store.products.model.ProductEntity)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static com.acme.store.products.model.ProductEntity
			patchProductEntity(
				HttpPrincipal httpPrincipal, Long productId, Integer category,
				String name, Double price, Boolean stocked,
				com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				ProductEntityServiceUtil.class, "patchProductEntity",
				_patchProductEntityParameterTypes3);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, productId, category, name, price, stocked,
				serviceContext);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				if (exception instanceof
						com.liferay.portal.kernel.exception.PortalException) {

					throw (com.liferay.portal.kernel.exception.PortalException)
						exception;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (com.acme.store.products.model.ProductEntity)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static com.acme.store.products.model.ProductEntity
			updateProductEntity(
				HttpPrincipal httpPrincipal, Long productId, Integer category,
				String name, Double price, Boolean stocked,
				com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				ProductEntityServiceUtil.class, "updateProductEntity",
				_updateProductEntityParameterTypes4);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, productId, category, name, price, stocked,
				serviceContext);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				if (exception instanceof
						com.liferay.portal.kernel.exception.PortalException) {

					throw (com.liferay.portal.kernel.exception.PortalException)
						exception;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (com.acme.store.products.model.ProductEntity)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	private static Log _log = LogFactoryUtil.getLog(
		ProductEntityServiceHttp.class);

	private static final Class<?>[] _addProductEntityParameterTypes0 =
		new Class[] {
			Integer.class, String.class, Double.class, Boolean.class,
			com.liferay.portal.kernel.service.ServiceContext.class
		};
	private static final Class<?>[] _deleteProductEntityParameterTypes1 =
		new Class[] {Long.class};
	private static final Class<?>[] _getProductEntityParameterTypes2 =
		new Class[] {Long.class};
	private static final Class<?>[] _patchProductEntityParameterTypes3 =
		new Class[] {
			Long.class, Integer.class, String.class, Double.class,
			Boolean.class,
			com.liferay.portal.kernel.service.ServiceContext.class
		};
	private static final Class<?>[] _updateProductEntityParameterTypes4 =
		new Class[] {
			Long.class, Integer.class, String.class, Double.class,
			Boolean.class,
			com.liferay.portal.kernel.service.ServiceContext.class
		};

}