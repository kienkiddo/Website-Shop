package io;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import commom.Security;
import model.User;

public class UserData {
	
	public static boolean insert(User user) {
		try {
			String sql = "INSERT INTO user(id, name, phone, email, password) VALUES(NULL, ?, ?, ?, ?)";
			var ps = DBConnect.getConn().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			ps.setString(1, user.getName());
			ps.setString(2, user.getPhone());
			ps.setString(3, user.getEmail());
			ps.setString(4, Security.getMd5(user.getPassword()));
			int row = ps.executeUpdate();
			ResultSet res = ps.getGeneratedKeys();
			if (res.next()) {
				user.setId(res.getInt(1));
			}
			return row == 1;
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		return false;
	}
	
	public static User withId(int id) {
		try {
			String sql = "SELECT * FROM user WHERE id=? LIMIT 1";
			var ps = DBConnect.getConn().prepareStatement(sql);
			ps.setInt(1, id);
			ResultSet res = ps.executeQuery();
			if (res.next()) {
				User user = new User();
				user.fill(res);
				return user;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		return null;
	}
	

	public static User login(String email, String password) {
		try {
			String sql = "SELECT * FROM user WHERE email=? and password=? LIMIT 1";
			var ps = DBConnect.getConn().prepareStatement(sql);
			ps.setString(1, email);
			ps.setString(2, password);
			ResultSet res = ps.executeQuery();
			if (res.next()) {
				User user = new User();
				user.fill(res);
				return user;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		return null;
	}
	
	public static boolean isEmail(String email) {
		try {
			String sql = "SELECT id FROM user WHERE email=? LIMIT 1";
			var ps = DBConnect.getConn().prepareStatement(sql);
			ps.setString(1, email);
			ResultSet res = ps.executeQuery();
			if (res.next()) {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		return false;
	}



}
