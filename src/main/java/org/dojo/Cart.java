package org.dojo;

import java.util.ArrayList;
import java.util.List;

public class Cart {

	List<Item> items = new ArrayList<Item>();

	public void add(Item item) {
		items.add(item);
	}

	public Price price() {
		Price sum = new Price(0);
		for (Item item : items) {
			sum = sum.add(item.price());
		}
		return sum;
	}

}
