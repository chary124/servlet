package com.chary.servlets;

import java.io.IOException;

import com.chary.database.DeleteDao;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/delete")
public class DeleteServlet extends HttpServlet {
	
	 protected void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException
	 {
		 String id = req.getParameter("id");
		 DeleteDao d = new DeleteDao();
		 int k = d.deleteBook(id);
		 if(k>0)
		 {
			 req.setAttribute("msg", "delete suceesfully");
			 req.getRequestDispatcher("delete.jsp").forward(req, res);
		 }
		 else
		 {
			 req.setAttribute("msg", "not delete");
			 req.getRequestDispatcher("msg.jsp").forward(req, res);
		 }
	 }
	
}
