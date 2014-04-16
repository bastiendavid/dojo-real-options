package org.dojo;

public class PriceComputer {

	private ItemList items = new ItemList();
	
	public void add(Item item) {
		items.add(item);
	}

	public Price price() {
		return items.price();
	}
}
