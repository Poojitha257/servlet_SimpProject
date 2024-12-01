package servletPack;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/color")
public class Color_Class extends HttpServlet {
@Override
protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
	List<String> colors=Arrays.asList("red","green","pink","blue");
	String color=colors.get(new Random().nextInt(colors.size()));
	arg1.getWriter().print("<div style='background-color:" + color + ";height:250px;width:250px;border:2px solid black;'></div>");
	
}
}
