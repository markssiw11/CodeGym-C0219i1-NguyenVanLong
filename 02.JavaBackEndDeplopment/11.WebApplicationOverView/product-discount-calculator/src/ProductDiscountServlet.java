import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ProductDiscountServlet",urlPatterns = "/index")
public class ProductDiscountServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        float listPrice = Float.parseFloat(request.getParameter("listPrice"));
        float discountPercent = Float.parseFloat(request.getParameter("discountPercent"));
        float discountAmount = listPrice*discountPercent*01;
        float discountPrice = listPrice-discountAmount;
        String productDescription = request.getParameter("productDescription");
        PrintWriter writer= response.getWriter();
        writer.println("<html>");
        writer.println("Product Descriptipn: "+ productDescription+"</br>");
        writer.println("List price: "+listPrice+"</br>");
        writer.println("Discount Percent: "+ discountPercent+"</br>");
        writer.println("Discount Amount: "+discountAmount+"</br>");
        writer.println("Discount Price: "+ discountPrice+"</br>");
        writer.println("</html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
