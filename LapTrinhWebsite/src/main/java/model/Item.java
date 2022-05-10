package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

import io.InfoData;

public class Item {

	private int id;
	
	private int type;
	
	private String name;
	
	private String description;
	
	private int price;
	
	private String thump;
	
	private String strImage;
	
	private String strInfos;
	
	private int colorId;
	
	private int status;
	
	private int sale;
	
	private boolean isNew;

	private ArrayList<String> images = null;
	
	private ArrayList<Info> infos = null;


	public Item() {
		
	}
	
	public void fill(ResultSet res) throws SQLException {
		this.id = res.getInt("id");
		this.type = res.getInt("type");
		this.name = res.getString("name");
		this.description = res.getString("description");
		this.price = res.getInt("price");
		this.thump = res.getString("thump");
		this.strImage = res.getString("image");
		this.strInfos = res.getString("infos");
		this.status = res.getInt("status");
		this.colorId = res.getInt("colorId");
		this.isNew = res.getBoolean("new");
		this.sale = res.getInt("sale");
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getThump() {
		return thump;
	}

	public void setThump(String thump) {
		this.thump = thump;
	}
	
	public ArrayList<String> getImages(){
		if (this.images == null) {
			JSONArray job = (JSONArray) JSONValue.parse(this.strImage);
			for (var obj : job) {
				this.images.add(obj.toString());
			}
		}
		return this.images;
	}
	
	public ArrayList<Info> getInfos(){
		if (this.infos == null) {
			JSONArray job = (JSONArray) JSONValue.parse(this.strInfos);
			for (var obj : job) {
				JSONObject job2 = (JSONObject) obj;
				Info info = new Info(Integer.parseInt(job2.get("size").toString()), Integer.parseInt(job2.get("quantity").toString()));
				this.infos.add(info);
			}
		}
		return this.infos;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public int getColorId() {
		return colorId;
	}

	public void setColorId(int colorId) {
		this.colorId = colorId;
	}

	public boolean isNew() {
		return isNew;
	}

	public void setNew(boolean isNew) {
		this.isNew = isNew;
	}

	public int getSale() {
		return sale;
	}

	public void setSale(int sale) {
		this.sale = sale;
	}
	
	
	
}
