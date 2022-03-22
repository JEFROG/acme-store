package com.acme.rest.store.products.client.dto.v1_0;

import com.acme.rest.store.products.client.function.UnsafeSupplier;
import com.acme.rest.store.products.client.serdes.v1_0.ProductSerDes;

import java.io.Serializable;

import java.util.Objects;

import javax.annotation.Generated;

/**
 * @author c02y33mljgh6
 * @generated
 */
@Generated("")
public class Product implements Cloneable, Serializable {

	public static Product toDTO(String json) {
		return ProductSerDes.toDTO(json);
	}

	public Category getCategory() {
		return category;
	}

	public String getCategoryAsString() {
		if (category == null) {
			return null;
		}

		return category.toString();
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public void setCategory(
		UnsafeSupplier<Category, Exception> categoryUnsafeSupplier) {

		try {
			category = categoryUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected Category category;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setId(UnsafeSupplier<Long, Exception> idUnsafeSupplier) {
		try {
			id = idUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected Long id;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setName(UnsafeSupplier<String, Exception> nameUnsafeSupplier) {
		try {
			name = nameUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String name;

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public void setPrice(
		UnsafeSupplier<Double, Exception> priceUnsafeSupplier) {

		try {
			price = priceUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected Double price;

	public Boolean getStocked() {
		return stocked;
	}

	public void setStocked(Boolean stocked) {
		this.stocked = stocked;
	}

	public void setStocked(
		UnsafeSupplier<Boolean, Exception> stockedUnsafeSupplier) {

		try {
			stocked = stockedUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected Boolean stocked;

	@Override
	public Product clone() throws CloneNotSupportedException {
		return (Product)super.clone();
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof Product)) {
			return false;
		}

		Product product = (Product)object;

		return Objects.equals(toString(), product.toString());
	}

	@Override
	public int hashCode() {
		String string = toString();

		return string.hashCode();
	}

	public String toString() {
		return ProductSerDes.toJSON(this);
	}

	public static enum Category {

		ELECTRONICS("Electronics"), SPORTING_GOODS("Sporting Goods"),
		OTHER("Other");

		public static Category create(String value) {
			for (Category category : values()) {
				if (Objects.equals(category.getValue(), value) ||
					Objects.equals(category.name(), value)) {

					return category;
				}
			}

			return null;
		}

		public String getValue() {
			return _value;
		}

		@Override
		public String toString() {
			return _value;
		}

		private Category(String value) {
			_value = value;
		}

		private final String _value;

	}

}