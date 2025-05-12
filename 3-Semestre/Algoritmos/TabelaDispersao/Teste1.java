package TabelaDispersao;

import java.time.LocalDate;
import java.util.HashMap;

public class Teste1 {

	public static void main(String[] args) {

		
//		Aluno a = new Aluno(10, "Pedro", LocalDate.of(2000, 1, 1));
//		Aluno b = new Aluno(10, "Pedro", LocalDate.of(2000, 1, 1));
//
//		System.out.println("Igual = " + a.equals(b));

		Aluno umAluno = new Aluno(100, "Pedro", LocalDate.of(2000, 1, 1));

		NoMapa<Aluno> no1 = new NoMapa<>();
		no1.setChave(100);
		no1.setInfo(umAluno);

		NoMapa<Aluno> no2 = new NoMapa<>();
		no2.setChave(100);

		System.out.println("Igual = " + no1.equals(no2));

		MapaDispersao<Aluno> mapa = new MapaDispersao<Aluno>(20);

		mapa.inserir(101, new Aluno(100, "Luiza"));
		mapa.inserir(221, new Aluno(200, "Iago"));
		mapa.inserir(5, new Aluno(300, "Antonia"));

		if (mapa.buscar(221) != null)
			System.out.println(mapa.buscar(221).toString());
		mapa.remover(221);
		if (mapa.buscar(221) != null)
			System.out.println(mapa.buscar(221).toString());
		else
			System.out.println("Vazio");

	}

}
