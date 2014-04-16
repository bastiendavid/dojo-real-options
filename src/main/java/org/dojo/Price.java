package org.dojo;

public class Price {
	private double price;

	public Price(double price) {
		this.price = price;
	}

	@Override
	public boolean equals(Object arg0) {
		if (!(arg0 instanceof Price)) {
			return false;
		}

		Price otherPrice = (Price) arg0;
		return otherPrice.price == price;
	}

	public Price add(Price price) {
		return new Price(this.price + price.price);
	}

	public Price multiply(Quantity quantity) {
		return new Price(price * quantity.quantity());
	}
}
