package javaproject;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

@WebServlet("/RegisterAction")
public class RegisterAction extends HttpServlet {
	private static final long serialVersionUID=1L;
	protected void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
	{
		String name,email,password;
		name=request.getParameter("name");
		email=request.getParameter("email");
		password=request.getParameter("password");
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","");
			Statement s=c.createStatement();
			s.execute("insert into user_detail(name,email,password) values('"+name+"','"+email+"','"+password+"')");
			}catch(Exception e)
		{
				System.out.println(e);
		}
	}

}
