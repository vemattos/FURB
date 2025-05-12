package Ex6Lista;
/**
 * @author Luciana P. A. Kohler
 */

import java.util.HashMap;
import java.util.Scanner;

/**
 * Classe para gerenciar dicionários de IP com seus sites
 */
public class DicionarioDeIP {

	/**
	 * Controle de acesso a sites
	 */
	public DicionarioDeIP() {

		HashMap<String, Site> mapaDeSites = new HashMap<String, Site>();
		Scanner teclado = new Scanner(System.in);

		System.out.print("Digite o endereço do site: ");
		String nome = teclado.next();
		while (!nome.equalsIgnoreCase("Fim")) {
			try {
				System.out.print("Digite o IP do site: ");
				String ip = teclado.next();
				System.out.print("Digite o status (true/false): ");
				boolean status = teclado.nextBoolean();

				Site s = new Site(nome, ip, status);
				if (inserirSite(s, mapaDeSites)) {
					System.out.println("Site inserido");
				} else {
					System.out.println("Já existe site com este nome");
				}

			} catch (Exception e) {
				System.out.println("Erro:" + e.getMessage());
			}

			System.out.print("Digite o endereço do site: ");
			nome = teclado.next();
		}

		System.out.println("SITES...");
		System.out.println(imprimirSite(mapaDeSites));

		System.out.println("PESQUISA SITES...");
		System.out.print("Digite o endereço do site: ");
		nome = teclado.next();
		while (!nome.equalsIgnoreCase("Fim")) {
			System.out.println(acessarSite(nome, mapaDeSites));

			System.out.print("Digite o endereço do site: ");
			nome = teclado.next();
		}

	}

	private String imprimirSite(HashMap<String, Site> sites) {
		String dados = "";

		for (Site s : sites.values()) {
			dados += s.toString() + "\n";
		}

		return dados;
	}

	private String acessarSite(String nome, HashMap<String, Site> sites) {
		if (sites.get(nome).isStatus()) {
			return "Site: " + nome + "\nIP: " + sites.get(nome).getEnderecoIP();
		}
		return "Site bloqueado";
	}

	private boolean inserirSite(Site site, HashMap sites) {
		if (sites.containsKey(site.getNome())) {
			return false;
		}
		sites.put(site.getNome(), site);
		return true;
	}

	public static void main(String[] args) {
		new DicionarioDeIP();

	}

}
