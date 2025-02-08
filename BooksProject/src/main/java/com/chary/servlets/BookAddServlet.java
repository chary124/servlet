package com.chary.servlets;

import java.io.IOException;

import com.chary.database.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/addbook")
public class BookAddServlet extends HttpServlet {
	
	
	@Override
	protected void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException
	{
		String bid = req.getParameter("bookId");
		String bookname = req.getParameter("bookName");
		String bookauthor = req.getParameter("bookAuthor");
		String bookprice = req.getParameter("bookCost");
		String bookqty = req.getParameter("bookQty");
		
		Book b = new Book();
		b.setBookId(bid);
		b.setBookName(bookname);
		b.setBookAuthor(bookauthor);
		b.setBookPrice(bookprice);
		b.setBookQty(bookqty);
		AddBookDao d = new AddBookDao();
		int k = d.insert(b);
		
		if(k>0)
			{
			System.out.println("book details ");
			req.setAttribute("msg", "book added succesfully");
			req.getRequestDispatcher("addbook.jsp").forward(req, res);
		}
		else
		{
			req.setAttribute("msg", "book not added");
			req.getRequestDispatcher("msg.jsp").forward(req, res);
		}
		
	}

}
