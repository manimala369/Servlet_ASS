package com.connection;

import java.sql.Connection;

public class CheckConnection {
	public static void main(String[] args) {
		Connection conn = ConnectionFactory.getConnection();
		if(conn!=null) {
			System.out.println("done");
			System.out.println(conn.getClass());
		}
	}
}
