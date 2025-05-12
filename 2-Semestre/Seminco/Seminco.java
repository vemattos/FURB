package Seminco;

import java.util.HashMap;

public class Seminco {
	
	public Seminco() {
		HashMap<String, Artigo> seminco = new HashMap<String, Artigo>();
		
		Artigo umArtigo = new Artigo("Ibovespa em alta", "Felipe Gropp");	
		Revisor umRevisor = new Revisor("Pedro Albuquerque","Interessante assunto", "Aceito");
		
		umArtigo.adicionarAvaliacao(umRevisor);		
		umArtigo.adicionarAvaliacao(new Revisor("Nathan bahia","Péssima vocação", "Rejeitado"));
		System.out.println(umArtigo.imprimir());
		
		seminco.put(umArtigo.getTitulo(), umArtigo);
		System.out.println(seminco.get("Ibovespa em alta").imprimir());
	}
	
	public static void main(String[] args) {
		new Seminco();
	}
}


