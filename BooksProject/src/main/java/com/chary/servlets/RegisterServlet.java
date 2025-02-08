package com.chary.servlets;

import java.io.IOException;

import com.chary.database.Admin;
import com.chary.database.Dao;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/reg")
public class RegisterServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException

	{
          String name = req.getParameter("name");
          String email = req.getParameter("email");
          String fname = req.getParameter("fname");
          String lname = req.getParameter("lname");
          String phno = req.getParameter("phno");
          String pass = req.getParameter("pass");
          
          Admin a = new Admin();
           a.setName(lname);
           a.setEmail(email);
           a.setFname(fname);
           a.setLname(lname);
           a.setPhno(phno);
           a.setPass(pass);
           
           int k = new Dao().insert(a);
           if(k>0)
           {
        	   Cookie c = new Cookie("fname", a.getFname());
        	   res.addCookie(c);
        	   req.setAttribute("msg", "register sucess");
        	   req.getRequestDispatcher("reg.jsp").forward(req, res);
           }
           else
           {
        	   req.setAttribute("msg", "register fail");
        	   req.getRequestDispatcher("msg.jsp").forward(req, res);
           }
           }
	}


