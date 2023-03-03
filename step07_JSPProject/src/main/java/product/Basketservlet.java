package product;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "Basket", urlPatterns = { "/Basket" })
public class Basketservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		out.print("<html><head></head><body>");
		out.print("Cart List..<br>");
		
		HttpSession session = request.getSession();
		if(session!=null) {
			ArrayList<String> list = (ArrayList<String>)session.getAttribute("shop");
			out.print("Product : " + list + "<br>");
		}
		out.print("<a href='product/product.html'>상품 선택 페이지로 이동</a>");
		out.print("</body></html>");
		out.close();
	}

}
