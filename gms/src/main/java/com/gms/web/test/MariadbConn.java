package com.gms.web.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MariadbConn {
	public class DBConstant {
		public static final String ORACLE_DRIVER = "oracle.jdbc.driver.OracleDriver";
		public static final String MYSQL_DRIVER = "";
		public static final String MARIADB_DRIVER = "";
		public static final String MSSQL_DRIVER = "";
		public static final String CONNECTION_URL = "jdbc:oracle:thin:@localhost:1521:xe";
		public static final String USERNAME = "TAEHYEONG";
		public static final String PASSWORD = "Zz251379";
	}
	
	public String exam() {
		Connection conn;
		Statement stmt;
		String s = "";
		try {
	        Class.forName(DBConstant.MARIADB_DRIVER);
	        conn = DriverManager.getConnection(
	                DBConstant.CONNECTION_URL,
	                DBConstant.USERNAME,
	                DBConstant.PASSWORD);
	         stmt = conn.createStatement();
	        String sql = String.format("SELECT USERID FROM MEMBER");
			try {
				ResultSet rs = stmt.executeQuery(sql);
				if(rs.next()) {
					s = rs.getString("USERID");
				}else {
					s = "연결실패";
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return s;
		}
	}
}
