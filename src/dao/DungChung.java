package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class DungChung {
	public static Connection cn;

	public void KetNoi() throws Exception {
		// b1 : Xac dinh HQTCSDL
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		// b2: Ket noi csdl
		String url = "jdbc:sqlserver://DESKTOP-PIKNVLI:1433;databaseName=QlSach;username=sa;password=123";
		cn = DriverManager.getConnection(url);
		System.out.print("Da ket noi");

	}

}
