package servletPack;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/print")
public class PrintColor extends HttpServlet {
@Override
protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
	String color=arg0.getParameter("color");
	arg1.getWriter().print("<div style='background-color:"+color+";height:250px;width:250px;border:2px solid black'></div>");
}
}
