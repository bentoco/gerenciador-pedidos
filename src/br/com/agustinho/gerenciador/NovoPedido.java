package br.com.agustinho.gerenciador;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class NovoPedido
 */
@WebServlet("/novo-pedido")
public class NovoPedido extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String produto = request.getParameter("produto");
		
		Pedido pedido = new Pedido();
		pedido.setProduto(produto);
		
		Banco banco = new Banco();
		banco.adiciona(pedido);
		
		System.out.println(pedido.getProduto());
		
		//chamada do jsp
		RequestDispatcher rd = request.getRequestDispatcher("/novo-pedido.jsp");
		request.setAttribute("produto", pedido.getProduto());
		rd.forward(request, response);
	}

}
