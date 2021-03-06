package io;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import commom.Security;
import model.Bill;
import model.History;
import model.Item;
import model.User;

public class HistoryData {
	
	public static History withLast(int userId) {
		try {
			String sql = "SELECT * FROM history WHERE userId=" + userId + " ORDER BY id DESC LIMIT 1";
			var ps = DBConnect.getConn().createStatement();
			ResultSet res = ps.executeQuery(sql);
			while (res.next()) {
				History history = new History();
				history.fill(res);
				return history;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		return null;
	}
	
	public static void updateStatus(History history) {
		try {
			String sql = "UPDATE history SET status=" + history.getStatus() + " WHERE id=" + history.getId();
			var ps = DBConnect.getConn().createStatement();
			ps.execute(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		} 
	}
	

	
	
	public static History withId(int id) {
		try {
			String sql = "SELECT * FROM history WHERE id=" + id + " LIMIT 1";
			var ps = DBConnect.getConn().createStatement();
			ResultSet res = ps.executeQuery(sql);
			while (res.next()) {
				History history = new History();
				history.fill(res);
				return history;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		return null;
	}
	
	public static boolean insert(History history) {
		try {
			String sql = "INSERT INTO history(id, userId, name, phone, address) VALUES(null, ?, ?, ?, ?)";
			var ps = DBConnect.getConn().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			ps.setInt(1, history.getUserId());
			ps.setString(2, history.getName());
			ps.setString(3, history.getPhone());
			ps.setString(4, history.getAddress());
			int row = ps.executeUpdate();
			ResultSet res = ps.getGeneratedKeys();
			if (res.next()) {
				history.setId(res.getInt(1));
			}
			return row == 1;
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		return false;
	}
	
	public static ArrayList<History> withStatus(int status){
		ArrayList<History> historys = new ArrayList<History>();
		try {
			String sql = "SELECT * FROM history WHERE status=" + status;
			var ps = DBConnect.getConn().createStatement();
			ResultSet res = ps.executeQuery(sql);
			while (res.next()) {
				History history = new History();
				history.fill(res);
				historys.add(history);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		return historys;
	}
	
	public static ArrayList<History> withUserId(int userId){
		ArrayList<History> historys = new ArrayList<History>();
		try {
			String sql = "SELECT * FROM history WHERE userId=" + userId + " ORDER BY id DESC";
			var ps = DBConnect.getConn().createStatement();
			ResultSet res = ps.executeQuery(sql);
			while (res.next()) {
				History history = new History();
				history.fill(res);
				historys.add(history);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		return historys;
	}
	
	
	public static ArrayList<History> all(){
		ArrayList<History> historys = new ArrayList<History>();
		try {
			String sql = "SELECT * FROM history";
			var ps = DBConnect.getConn().createStatement();
			ResultSet res = ps.executeQuery(sql);
			while (res.next()) {
				History history = new History();
				history.fill(res);
				historys.add(history);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		return historys;
	}
	
}
