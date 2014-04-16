package org.dojo;

public class Item {

	private String name;
	private Price price;
	private Quantity quantity;

	public Item(String name, Price price, Quantity quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public Price price() {
		return price.multiply(quantity);
	}

}
