package laurag;

import java.sql.*;

public class DB {

	static {
		try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e) {
			throw new ExceptionInInitializerError(e);
		}
	}

	public Connection getConnection() {
		try {
			String url = "jdbc:postgresql://localhost/trabalho3Bim";
			String usuario = "postgres";
			String senha = "uexzhhmx";
			Connection con = DriverManager.getConnection(url, usuario, senha);
			return con;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}