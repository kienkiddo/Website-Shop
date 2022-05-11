package io;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.Info;
import model.Item;
import model.User;

public class ItemData {
	
	public static ArrayList<Item> allSale(){
		ArrayList<Item> items = new ArrayList<Item>();
		try {
			String sql = "SELECT * FROM item WHERE status=1 and sale > 0 ORDER BY rand() LIMIT 3";
			var ps = DBConnect.getConn().createStatement();
			ResultSet res = ps.executeQuery(sql);
			while (res.next()) {
				Item item = new Item();
				item.fill(res);
				items.add(item);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		return items;
	}
	
	public static ArrayList<Item> all(int type, int status){
		ArrayList<Item> items = new ArrayList<Item>();
		try {
			String sql = "SELECT * FROM item WHERE type=" + type + " and status=" + status;
			var ps = DBConnect.getConn().createStatement();
			ResultSet res = ps.executeQuery(sql);
			while (res.next()) {
				Item item = new Item();
				item.fill(res);
				items.add(item);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		return items;
	}
	
	public static Item withId(int id) {
		try {
			String sql = "SELECT * FROM item WHERE id=" + id;
			var ps = DBConnect.getConn().createStatement();
			ResultSet res = ps.executeQuery(sql);
			while (res.next()) {
				Item item = new Item();
				item.fill(res);
				return item;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		return null;
	}
	
}
