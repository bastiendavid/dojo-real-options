package org.dojo;

public class PriceComputer {

	private Cart cart = new Cart();
	
	public void add(Item item) {
		cart.add(item);
	}

	public Price price() {
		return cart.price();
	}
}
