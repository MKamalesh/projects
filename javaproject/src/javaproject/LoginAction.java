package javaproject;


	import javax.servlet.ServletException;
	import javax.servlet.annotation.WebServlet;
	import javax.servlet.http.HttpServlet;
	import javax.servlet.http.HttpServletRequest;
	import javax.servlet.http.HttpServletResponse;

	import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
	import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

	@WebServlet("/LoginAction")
	public  class LoginAction extends HttpServlet {
		private static final long serialVersionUID=1L;
		protected void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
		{
			String name,email,password;
			name=request.getParameter("name");
			email=request.getParameter("email");
			password=request.getParameter("password");
			PrintWriter out=response.getWriter();
			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","");
				Statement s=c.createStatement();
				ResultSet rs=s.executeQuery("select*from user_detail where email='"+email+"'and password='"+password+"'");
				if(rs.next())
				{
					out.println("Welcome!!!");
					out.println(rs.getString("name"));
					
				}
				}catch(Exception e)
			{
					//System.out.println(e);
					out.println("unable to register");
			}
		}

	}


