package servletPack;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/time")
public class Time_Class extends HttpServlet {
@Override
protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
	arg1.getWriter().print("<h1>The current time is</h1>"+ LocalDateTime.now().toLocalTime());
//	LocalDateTime cur=LocalDateTime.now();
//	DateTimeFormatter timeFormatter=DateTimeFormatter.ofPattern("HH:MM:SS");
//	String fortime=cur.format(timeFormatter);
//	arg1.getWriter().print(" <h1> the time is:"+fortime );
}
}
