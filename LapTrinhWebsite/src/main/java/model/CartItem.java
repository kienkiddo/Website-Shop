package model;

import java.sql.ResultSet;
import java.sql.SQLException;

import io.ItemData;

public class CartItem {
	
	private int id;
	
	private int quantity;
	
	private int size;
	
	private Item item = null;
	
	public CartItem(int id, int size, int quantity) {
		this.id = id;
		this.size = size;
		this.quantity = quantity;
	}
	
	public Item getItem() {
		if (item == null) {
			item = ItemData.withId(id);
		}
		return item;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPrice() {
		return this.getItem().getCost();
	}


	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public void setItem(Item item) {
		this.item = item;
	}
}
