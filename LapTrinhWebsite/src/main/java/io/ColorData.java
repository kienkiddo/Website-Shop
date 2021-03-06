package io;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.Color;
import model.Item;

public class ColorData {

	public static ArrayList<Color> list = null;
	
	public static ArrayList<Color> all(){
		if (list == null) {
			list = new ArrayList<Color>();
			try {
				String sql = "SELECT * FROM color";
				var ps = DBConnect.getConn().createStatement();
				ResultSet res = ps.executeQuery(sql);
				while (res.next()) {
					list.add(new Color(res.getInt("id"), res.getString("name")));
				}
				
			} catch (SQLException e) {
				e.printStackTrace();
			} 
		}
		return list;
	}
}
