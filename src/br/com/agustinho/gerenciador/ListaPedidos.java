package br.com.agustinho.gerenciador;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ListaPedidos
 */
@WebServlet("/lista-pedidos")
public class ListaPedidos extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		Banco banco = new Banco();
		List<Pedido> lista = banco.getPedidos();
		
		RequestDispatcher rd = request.getRequestDispatcher("/lista-pedidos.jsp");
		request.setAttribute("pedidos", banco.getPedidos());
		rd.forward(request, response);
		
		out.println("<html><body>");
		out.println("<ul>");
		for (Pedido pedido : lista) {
			out.println("<li> " + pedido.getProduto() + " </li>");
		}
		out.println("</ul>");
		out.println("</body></html>");
			
	}

}
