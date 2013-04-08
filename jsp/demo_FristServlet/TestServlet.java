package lion.home;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;

public class TestServlet extends HttpServlet {
	
	public void service (ServletRequest request,ServletResponse response){
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out =null;
		try {
			out = response.getWriter();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		out.println("<html>");
		out.println("<head>");
		out.println("<title>FristServlet</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("</body>");
		out.println("</html>");
		out.println("<html>");
		out.close();
	}
}
