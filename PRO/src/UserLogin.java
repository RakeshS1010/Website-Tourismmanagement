
	import java.sql.*;
	import java.io.*;
	import javax.servlet.*;
	import javax.servlet.http.*;
	import java.util.Calendar;

	public class UserLogin extends 
	{
	        Connection conn;
	        PrintWriter pw;
	        public void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
	        {
	                res.setContentType("text/html");
	                pw=res.getWriter();
	                String url="jdbc:odbc:khokhar";

	                try
	                {
	                        String username =req.getParameter("UserName");
	                        String password =req.getParameter("Password");

	                        Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
	                        conn=DriverManager.getConnection(url);
	                        Statement stmt= conn.createStatement();
	                        ResultSet rs=stmt.executeQuery("select * from Authenticated where UserName ='" +username+ "' and Password ='"+ password +"'");

	                        if(rs.next()==false)
	                        {
	                                res.setContentType("text/html");
	                                res.setStatus(HttpServletResponse.SC_OK);

	                                pw.println("<html><head><title>User Authentication</Title></Head>");
	                                pw.println("<body Background='http://localhost:8080/school/2011-12/background.bmp'>");

	                                pw.println("<table width=100% align=center>");
	                                pw.println("
	<tr><th align=left><img src='http://localhost:8080/school/2011-12/schoollogo2.JPG' alt=schoollogo.jpg border=0 width=550 height=65></Th></Tr>
	");
	                                pw.println("</Table><hr>
	");

	                                //First Table
	                                pw.println("<br><table width=50% align=center Border=0>");
	                                pw.println("
	<tr><th align=center><h3>
	Sorry!!! Your User Name or Password Wrong</h3>
	</Th></Tr>
	");
	                                pw.println("
	<tr><th><input Type=Button value='   Try Again   ' onClick='history.back();'></Th></Tr>
	");
	                                pw.println("</Table>");

	                                pw.println("<center>
	<img src='http://localhost:8080/school/2011-12/schoollogo.JPG' alt=schoollogo.jpg border=0 width=350 height=300>");
	                                
	                                pw.println("<br><br><br><center>
	");
	                                pw.println("<font size=2 color=gray>");
	                                pw.println("Copyright © 2011-12, School-Management System, Developed by <a Href='MailTo:bintu.chaudhary.mks@gmail.com'> <b><font color=gray>Bintu Chaudhary</Font> </b></A>  | Disclaimer");
	                                pw.println("<br>Best viewed at 1024 x 768 resolution with Google Chrome or Mozila Firefox 3.6 and higher not Internet Explorer");

	                                pw.println("</Body></html>");
	                        }                
	                        else
	                        {
	                                String sql_chk=("select * from Authenticated where UserName ='" +username+ "' and Password ='"+ password +"'");
	                                rs=stmt.executeQuery(sql_chk);
	                                
	                                pw.println("<html><head><title>User Authentication</Title></Head>");
	                                pw.println("<body Background='http://localhost:8080/school/2011-12/background.bmp'>");

	                                pw.println("<table width=100% align=center>");
	                                pw.println("
	<tr><th align=left><img src='http://localhost:8080/school/2011-12/schoollogo2.JPG' alt=schoollogo.jpg border=0 width=550 height=65></Th></Tr>
	");
	                                pw.println("</Table><hr>
	");
	                                pw.println("<center>
	<h2>
	<marquee>Welcome "+username+"</Marquee></h2>
	</Center>");

	                                pw.println("<table align=center Border=0>");
	                                pw.println("
	<tr><th><a href='http://localhost:8080/school/2011-12/index2011_12.html'><input Type=button Value=' Session 2011-12 '></a></Th>");
	                                pw.println("<form method=post action='http://localhost:8080/examples/servlet/EditPassword'>
	");
	                                pw.println("<input Type=hidden name=username value="+username+">");
	                                pw.println("<th><u><input Type=submit Value='Change-Password'></u></Th></Form></Tr>
	");
	                                pw.println("</Tr>
	</Table>");

	                                pw.println("<center>
	<img src='http://localhost:8080/school/2011-12/schoollogo.JPG' alt=schoollogo.jpg border=0 width=350 height=300>");
	                                
	                                pw.println("<br><br><br><center>
	");
	                                pw.println("<font size=2 color=gray>");
	                                pw.println("Copyright © 2011-12, School-Management System, Developed by <a Href='MailTo:bintu.chaudhary.mks@gmail.com'> <b><font color=gray>Bintu Chaudhary</Font></b></A>  | Disclaimer");
	                                pw.println("<br>Best viewed at 1024 x 768 resolution with Google Chrome or Mozila Firefox 3.6 and higher not Internet Explorer");
	                                stmt.close();
	                                conn.close();
	                                pw.println("</Body></html>");                
	                        }                                
	                }
	                catch(Exception e)
	                {
	                        pw.println(e.getMessage());
	                }
	        }
	}


}
