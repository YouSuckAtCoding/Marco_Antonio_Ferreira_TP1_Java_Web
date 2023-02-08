

import java.io.IOException;
import java.io.PrintWriter;

import br.infnet.edu.Domain.Usuario;
import br.infnet.edu.Utility.SevletHtmlGenerator;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;



@WebServlet("/Hello")
public class Hello extends HttpServlet {
	private static final long serialVersionUID = 1L;

 
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		Usuario newUser = new Usuario();
		newUser.setName(request.getParameter("NameInput"));
		newUser.setEmail(request.getParameter("EmailInput"));
		newUser.setPassword(request.getParameter("PasswordInput"));
		
		PrintWriter writer = response.getWriter();
		
		SevletHtmlGenerator generator = new SevletHtmlGenerator();
		
		writer.println(generator.GenerateResponseHtml(newUser));
		
	}

}
