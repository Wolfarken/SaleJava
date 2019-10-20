package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class GenericDAO 
{
	private Connection connection;
	
	public Connection getConnection() throws ClassNotFoundException, SQLException
	{
		String hostName = "localhost";
		String dbName = "Sale";
		String user = "player";
		String password = "123";
		
		Class.forName("net.sourceforge.jtds.jdbc.Driver");
		connection = DriverManager.getConnection(String.format("jdbc:jtds:sqlserver://%s:1433;databaseName=%s;user=%s;password=%s;", hostName, dbName, user, password));
		
		return connection;
	}
}
