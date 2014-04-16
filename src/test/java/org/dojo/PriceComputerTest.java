package org.dojo;

import org.fest.assertions.api.Assertions;
import org.junit.Test;


public class PriceComputerTest {

	@Test
	public void price_returns_items_price() throws Exception {
		// Given
		Price expectedPrice = new Price(14);
		Item item1 = new Item("banane", new Price(14),new Quantity(1));
		PriceComputer computer = new PriceComputer();
		
		// When
		computer.add(item1);
		
		// Then
		Assertions.assertThat(computer.price()).isEqualTo(expectedPrice);
	}
	
	@Test
	public void price_returns_items_sum_of_price() throws Exception {
		// Given
		Price expectedPrice = new Price(80);
		Item item1 = new Item("banane", new Price(10), new Quantity(6));
		Item item2 = new Item("orange", new Price(5), new Quantity(4));
		PriceComputer computer = new PriceComputer();
		
		// When
		computer.add(item1);
		computer.add(item2);
		
		// Then
		Price actualPrice = computer.price();
		Assertions.assertThat(actualPrice).isEqualTo(expectedPrice);
	}
}
