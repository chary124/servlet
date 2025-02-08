package com.chary.servlets;

import java.io.IOException;
import java.util.ArrayList;

import com.chary.database.Book;
import com.chary.database.ViewDao;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/viewbook")
public class ViewServlet extends HttpServlet {

	
	@Override
	protected void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException
	{
	         ViewDao d = new ViewDao();
	         ArrayList<Book> bookinfo = d.view();
	         if(bookinfo!=null)
	         {
	        	 req.setAttribute("al", bookinfo);
	        	 req.getRequestDispatcher("view.jsp").forward(req, res);
	         }
	         else
	         {
	        	 req.setAttribute("msg", "details not avalible");
	        	 req.getRequestDispatcher("msg.jsp").forward(req, res);

	         }
	         
	}
}
