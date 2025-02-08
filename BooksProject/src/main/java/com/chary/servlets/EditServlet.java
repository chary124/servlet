package com.chary.servlets;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.chary.database.AddBookDao;
import com.chary.database.Book;
import com.chary.database.EditDao;

 
@WebServlet("/edit")
public class EditServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
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
		EditDao ed = new EditDao();
		UpdateServlet u = new UpdateServlet();
		ServletContext sc = req.getServletContext();
		String st = (String)sc.getAttribute("id");
		 
		System.out.println(st + " uiuywe ");
		int k =  ed.edit(b, st);
		
		if(k>0)
			{
			System.out.println("book details ");
			req.setAttribute("msg", "book  edited  succesfully");
			req.getRequestDispatcher("editbook.jsp").forward(req, res);
		}
		else
		{
			req.setAttribute("msg", "book not updated ");
			req.getRequestDispatcher("msg.jsp").forward(req, res);
		}
		
		
 	}

	 
	}


