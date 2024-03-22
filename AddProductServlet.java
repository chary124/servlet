package test;
import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/add")
public class AddProductServlet extends GenericServlet{
@Override
 public void service(ServletRequest req,ServletResponse res)throws 
ServletException,IOException{
 ProductBean pb = new ProductBean();//Bean Object
 pb.setCode(req.getParameter("code"));
//Venkatesh Maipathii
 pb.setName(req.getParameter("name"));
 pb.setPrice(Float.parseFloat(req.getParameter("price")));
 pb.setQty(Integer.parseInt(req.getParameter("qty")));
 AddProductDAO ob = new AddProductDAO();
 int k = ob.insert(pb);
 if(k>0) {
 req.setAttribute("msg", "Product added Successfully...<br>");
 RequestDispatcher rd = 
req.getRequestDispatcher("AddProduct.jsp");
 rd.forward(req, res);
 }
 }
}