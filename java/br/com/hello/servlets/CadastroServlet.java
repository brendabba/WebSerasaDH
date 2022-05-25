package br.com.hello.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/cadastro")
public class CadastroServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    	String nome = request.getParameter("nome");
		String email = request.getParameter("email");
		
		PrintWriter out = response.getWriter();
		
		out.println("<html> <body> Nome: " + nome +" e Email: " + email +" cadastrado(a) com sucesso!!! </body></html>");
    }
}
