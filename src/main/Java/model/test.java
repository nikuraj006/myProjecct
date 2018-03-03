package main.Java.model;


import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/test")
public class test extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response){
        System.out.println(request.getParameter("name"));
    }
}
