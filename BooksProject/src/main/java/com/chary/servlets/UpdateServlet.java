package com.chary.servlets;

import java.io.IOException;

import com.chary.database.Book;
import com.chary.database.UpdateDao;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UpdateServlet
 */
@WebServlet("/update")
public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    String bid;
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		 String id = req.getParameter("id");
		 bid = id;
		 Book b = new UpdateDao().update(id);
		 if(b!=null)
		 {
			  ServletContext sc = req.getServletContext();
			  sc.setAttribute("id", id);
			  
			  req.setAttribute("book", b);
			  req.getRequestDispatcher("update.jsp").forward(req, res);
		 }
		 else
		 {

			  req.setAttribute("msg", "id not present to update");
			  req.getRequestDispatcher("msg.jsp").forward(req, res);
		 }
		 }
	public String getid()
	{
		System.out.println(bid);
		return bid;
	}
		 
	}

 


