package com.comcast.crm.generic.databaseutility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class DatabaseUtility {
	Connection con;

	public void getDbconnection(String url, String usn, String password) throws SQLException {
		try {
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);

			con = DriverManager.getConnection(url, usn, password);
		} catch (Exception e) {
		}
	}
	public void getDbconnection() throws SQLException {
		try {
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);

			con = DriverManager.getConnection("http://106.51.90.215:8084/", "rmgyantra", "rmgy@9999");
		} catch (Exception e) {
		}
	}

	public void closeDbconnection() throws SQLException {

		try {
			con.close();
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	public ResultSet executeNonSelectQuery(String query) throws SQLException {
		ResultSet result = null;
		try {
			Statement stat = con.createStatement();
			result = stat.executeQuery(query);
		} catch (Exception e) {
		}

		return result;
	}

	public int executeNonselectQuery(String query) {
		int result = 0;
		try {
			Statement stat = con.createStatement();
			result = stat.executeUpdate(query); // return integer value
		} catch (Exception e) {
		}
		return result;

	}
}