package main.Java.model;


import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

@WebServlet("/test")
public class test extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response){
        try {
            PrintWriter out =  response.getWriter();
            out.println("<center>");
            out.print(request.getParameter("name"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
