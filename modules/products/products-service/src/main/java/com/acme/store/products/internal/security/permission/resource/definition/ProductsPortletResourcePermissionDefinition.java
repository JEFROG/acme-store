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

package com.acme.store.products.internal.security.permission.resource.definition;

import com.acme.store.products.constants.ProductConstants;
import com.acme.store.products.constants.ProductsPortletKeys;
import com.liferay.exportimport.kernel.staging.permission.StagingPermission;
import com.liferay.portal.kernel.security.permission.resource.PortletResourcePermissionLogic;
import com.liferay.portal.kernel.security.permission.resource.StagedPortletPermissionLogic;
import com.liferay.portal.kernel.security.permission.resource.definition.PortletResourcePermissionDefinition;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Jeff Rogers
 */
@Component(
        immediate = true, service = PortletResourcePermissionDefinition.class
)
public class ProductsPortletResourcePermissionDefinition
        implements PortletResourcePermissionDefinition {

    @Override
    public PortletResourcePermissionLogic[]
    getPortletResourcePermissionLogics() {

        return new PortletResourcePermissionLogic[]{
                new StagedPortletPermissionLogic(
                        _stagingPermission, ProductsPortletKeys.PRODUCTS_PORTLET_REACT),
                new StagedPortletPermissionLogic(
                        _stagingPermission, ProductsPortletKeys.PRODUCTS_PORTLET_ANGULAR)
        };
    }

    @Override
    public String getResourceName() {
        return ProductConstants.RESOURCE_NAME;
    }

    @Reference
    private StagingPermission _stagingPermission;

}