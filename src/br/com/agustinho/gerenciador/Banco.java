package br.com.agustinho.gerenciador;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	private static List<Pedido> lista = new ArrayList<>();
	
	static {
		Pedido pedido1 = new Pedido();
		pedido1.setProduto("Bolo de Abacaxi");
		Pedido pedido2 = new Pedido();
		pedido2.setProduto("Rocambole");
		lista.add(pedido1);
		lista.add(pedido2);
	}
	
	public void adiciona(Pedido pedido) {
		lista.add(pedido);
	}
	
	public List<Pedido> getPedidos(){
		return Banco.lista;
	}
}
