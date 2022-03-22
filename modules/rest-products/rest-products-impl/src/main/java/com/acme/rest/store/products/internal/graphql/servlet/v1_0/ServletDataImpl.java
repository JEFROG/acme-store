package com.acme.rest.store.products.internal.graphql.servlet.v1_0;

import com.acme.rest.store.products.internal.graphql.mutation.v1_0.Mutation;
import com.acme.rest.store.products.internal.graphql.query.v1_0.Query;
import com.acme.rest.store.products.resource.v1_0.ProductResource;

import com.liferay.portal.vulcan.graphql.servlet.ServletData;

import javax.annotation.Generated;

import org.osgi.framework.BundleContext;
import org.osgi.service.component.ComponentServiceObjects;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceScope;

/**
 * @author c02y33mljgh6
 * @generated
 */
@Component(immediate = true, service = ServletData.class)
@Generated("")
public class ServletDataImpl implements ServletData {

	@Activate
	public void activate(BundleContext bundleContext) {
		Mutation.setProductResourceComponentServiceObjects(
			_productResourceComponentServiceObjects);

		Query.setProductResourceComponentServiceObjects(
			_productResourceComponentServiceObjects);
	}

	@Override
	public Mutation getMutation() {
		return new Mutation();
	}

	@Override
	public String getPath() {
		return "/rest-products-graphql/v1_0";
	}

	@Override
	public Query getQuery() {
		return new Query();
	}

	@Reference(scope = ReferenceScope.PROTOTYPE_REQUIRED)
	private ComponentServiceObjects<ProductResource>
		_productResourceComponentServiceObjects;

}