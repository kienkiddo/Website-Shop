package model;

import io.ItemData;

public class CartItem {
	private int id;
	
	private int price;
	
	private Info info;
	
	private Item item = null;
	
	public CartItem(int id, int price, Info info) {
		this.id = id;
		this.price = price;
		this.info = info;
	}
	
	public Item getItem() {
		if (item == null) {
			item = ItemData.withId(id);
		}
		return item;
	}
	
}