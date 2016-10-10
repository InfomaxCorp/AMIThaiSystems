package com.amithai.backend.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.*;

public enum DataSource {

	INSTANCE;

	final public static String TBL_HOTEL = "tbl_hotel";
	final public static String TBL_SHOW = "tbl_show";
	final public static String TBL_PLACE = "tbl_place";
	final public static String TBL_RESTAURANT = "tbl_restaurant";
	final public static String TBL_TRANSPORT = "tbl_transport";

	private static final String url = "jdbc:mysql://localhost:3306/amidb";
	private static final String user = "root";
	private static final String pwd = "";

	private Connection conn = null;

	static {
		try {

			Class.forName("com.mysql.jdbc.Driver").newInstance();
		} catch (InstantiationException | IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	private DataSource() {
		// drop the table if it exists
		try {
			Statement stmt = this.getStatement();
//			stmt.executeUpdate("drop table event if exists");
//			stmt.executeUpdate("create table event (evtid VARCHAR(37) NOT NULL PRIMARY KEY, name VARCHAR(100), priority INTEGER, evtdate TIMESTAMP)");
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			this.close();
		}
	}

	public Statement getStatement() throws SQLException {
		Statement stmt = null;
		// get connection

		// conn =
		// DriverManager.getConnection("jdbc:mysql://localhost:3306/database_name",
		// "root", "");
		
		try {

			Class.forName("com.mysql.jdbc.Driver").newInstance();
		} catch (InstantiationException | IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		conn = DriverManager.getConnection(url, user, pwd);
		stmt = conn.createStatement();
		return stmt;
	}

	public void close() {
		try {
			if (conn != null) {
				conn.close();
				conn = null;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}