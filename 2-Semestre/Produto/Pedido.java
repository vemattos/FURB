package Produto;

import java.util.ArrayList;

public class Pedido {
	private int numero;
	private String nomeCliente;
	private ArrayList produtos;
	
	public Pedido(int numero, String nomeCliente) {
		setNumero(numero);
		setNmCliente(nomeCliente);
		produtos = new ArrayList();
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNmCliente(String nmCliente) {
		this.nomeCliente = nmCliente;
	}

	public ArrayList getProdutos() {
		return produtos;
	}

	public void setProdutos(ArrayList produtos) {
		this.produtos = produtos;
	}
	public void adicionarItemAoPedido(Produto umProduto) {
		produtos.add(umProduto);
	}
}