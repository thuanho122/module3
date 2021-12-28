package vn.ht;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
@WebServlet(name = "")
public class ProductDiscountServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       double listPrice = Double.parseDouble(req.getParameter("listPrice"));
        double discountPercent = Double.parseDouble(req.getParameter("discountPercent"));
       String productDescription = req.getParameter("productDescription");
        PrintWriter pw = resp.getWriter();
        pw.println("<html>");
        pw.println("<p>" + productDescription + "</p>");
        pw.println("<p>List Price: " + listPrice+ "</p>");
        pw.println("<p>Discount Percent" + discountPercent + "</p>");
        pw.println("<p>Result" +listPrice*(1 - discountPercent/100)+ "</p>");
        pw.println("</html>");
        pw.close();
    }
}
