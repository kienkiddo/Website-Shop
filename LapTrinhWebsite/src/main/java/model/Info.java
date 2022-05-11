package model;

import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

public class Info {

	private int size;
	
	private int quantity;
	
	public Info(int size, int quantity) {
		this.size = size;
		this.quantity = quantity;
	}
	
	public int getSize() {
		return this.size;
	}
	
	public int getQuantity() {
		return this.quantity;
	}
	

	public void setSize(int size) {
		this.size = size;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}