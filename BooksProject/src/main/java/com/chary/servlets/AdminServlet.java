package com.chary.servlets;

import java.io.IOException;
import java.net.http.HttpResponse;

import com.chary.database.PassDao;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/add")
public class AdminServlet extends HttpServlet {

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
        {
		String name = req.getParameter("name");
		String pass = req.getParameter("pass");
		
		boolean b = new PassDao().checkPass(name,pass);
		if(b)
		{
			 
			req.setAttribute("msg", "login success");
			req.getRequestDispatcher("res.jsp").forward(req, res);
		}
		else
		{
			req.setAttribute("msg", "login fail");
			req.getRequestDispatcher("msg.jsp").forward(req, res);
		}

	}

}
