package br.alura.gerenciador_02.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "listaempresa", urlPatterns = { "/listaempresa" })
public class ListaEmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Banco banco = new Banco();
		
		List<Empresa> lista = banco.getEmpresa();
		
		PrintWriter out = response.getWriter();
		
		out.println("<html>");
		out.println("<body>");
		
		out.println("<ul>");
		
		for (Empresa empresa : lista) {
			out.println("<li>" + empresa.getNome() + "</li>");
		}
		
		out.println("</ul>");
		
		
		out.println("</body>");
		out.println("</html>");
	}

}
