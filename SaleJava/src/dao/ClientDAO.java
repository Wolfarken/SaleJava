package dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;

import model.Client;

public class ClientDAO 
{
	private Connection connection;
	
	public ClientDAO() throws ClassNotFoundException, SQLException
	{
		GenericDAO gDAO = new GenericDAO();
		connection = gDAO.getConnection();
	}
	
	
	public String newClient(Client client) throws SQLException
	{
		String sql = "{CALL sp_newClient(?,?,?,?)}";
		
		CallableStatement callState = connection.prepareCall(sql);
		
		callState.setString(1, client.getDocument());
		callState.setString(2, client.getName());
		callState.setString(3, client.getBirthday());
		
		callState.registerOutParameter(4, Types.VARCHAR);
		
		callState.execute();
		String exit = callState.getString(4);
		callState.close();
		
		return exit;
	}
}
