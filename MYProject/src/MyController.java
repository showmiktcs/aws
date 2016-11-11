

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyController
 */

public class MyController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Connection con = null;		
		
		
		
		String check = request.getParameter("check");
		System.out.println(check);
		System.out.println(check.equals("insert"));
		if(check.equals("insert"))
		{
			String gender = request.getParameter("gender");
			String name = request.getParameter("name");

			System.out.println("name : "+name);
			try
			{
				Class.forName("com.mysql.jdbc.Driver");  
				con=DriverManager.getConnection("jdbc:mysql://dettest1.ce1xnn9brlzu.ap-south-1.rds.amazonaws.com:3306/dettest1","dettest1","dettest1");  
				PreparedStatement stmt=con.prepareStatement("insert into emp1(uname,gender) values(?,?)");  
				stmt.setString(1, name);
				stmt.setString(2, gender);
				int rs = stmt.executeUpdate();
				if(rs!=0)
				{
					response.sendRedirect("success.html");				
				}
				else
					response.sendRedirect("failure.html");

			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
		else
		{
			String name = request.getParameter("search");
			try{  
				Class.forName("com.mysql.jdbc.Driver");  
				con=DriverManager.getConnection("jdbc:mysql://dettest1.ce1xnn9brlzu.ap-south-1.rds.amazonaws.com:3306/dettest1","dettest1","dettest1");  
				PreparedStatement stmt=con.prepareStatement("Select * from emp1 where uname =?");  
				stmt.setString(1, name);
				ResultSet rs=stmt.executeQuery();  
				if(rs.next())
				{				
				
					request.setAttribute("name", rs.getString(1));
					request.setAttribute("id", rs.getString(2));
					request.setAttribute("gender", rs.getString(3));
					RequestDispatcher rd = request.getRequestDispatcher("success.jsp");
					rd.forward(request, response);
				}
					
				else 
					response.sendRedirect("failure.html");
					con.close();  
				}
				catch(Exception e)
				{
					System.out.println(e);
				}  
		
		}
				  
	}

}
