package com.acme.rest.store.products.client.function;

import javax.annotation.Generated;

/**
 * @author c02y33mljgh6
 * @generated
 */
@FunctionalInterface
@Generated("")
public interface UnsafeSupplier<T, E extends Throwable> {

	public T get() throws E;

}