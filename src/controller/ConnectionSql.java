/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author PC
 */
public class ConnectionSql {
    private static Connection conn = null;

	public static Connection getConnectMySQL() {
		String url = "jdbc:mysql://localhost:3306/quanlihocvien";
		String user = "root";
		String password = "1234";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException | SQLException ex) {
			ex.printStackTrace();
		}
		return conn;

	}

	public static boolean closeConnection() {
		try {
			conn.close();
		} catch (SQLException e) {
			return false;
		}
		return true;
	}
}
