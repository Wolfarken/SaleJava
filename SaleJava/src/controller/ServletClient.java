package controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ClientDAO;
import model.Client;

@WebServlet("/newClient")
public class ServletClient extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
       
	
    public ServletClient() 
    {
        super();
    }

    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		Client client = new Client();
		
		client.setDocument(request.getParameter("document"));
		client.setName(request.getParameter("name"));
		client.setBirthday(request.getParameter("birthday"));
		
		String exit = "";
		
		try 
		{
			ClientDAO clientDAO = new ClientDAO();
			exit = clientDAO.newClient(client);
		} 
		catch (ClassNotFoundException | SQLException e) 
		{
			e.printStackTrace();
			exit = e.getMessage();
		}
		finally 
		{
			RequestDispatcher requestDisp = request.getRequestDispatcher("index.jsp");
			request.setAttribute("exit", exit);
			requestDisp.forward(request, response);
		}
	}

}
