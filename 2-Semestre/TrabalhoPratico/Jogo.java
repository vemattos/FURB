//matheus gamba e vinicius mattos
package TrabalhoPratico;

public class Jogo {
    public String confronto(Personagem heroi, Vilao vilao) {
        int poderHeroi = heroi.calcularPoderTotal();
        int poderVilao = vilao.calcularPoderTotal();

        if (poderHeroi > poderVilao) {
            return heroi.getNome() + " venceu o vilão " + vilao.getNome() + "!";
        } else if (poderVilao > poderHeroi) {
            return "O vilão " + vilao.getNome() + " venceu o herói " + heroi.getNome() + "!";
        } else {
            return "O confronto terminou em empate!";
        }
    }

    public static void main(String[] args) {
        SuperHeroi chapolin = new SuperHeroi("Chapolin Colorado", "Roberto Gómez Bolaños");
        chapolin.adicionarSuperPoder(new SuperPoder("Anteninhas de vinil", 4));
        chapolin.adicionarSuperPoder(new SuperPoder("Marreta Biônica", 5));
        chapolin.adicionarSuperPoder(new SuperPoder("Corneta paralisadora", 5));
        chapolin.adicionarSuperPoder(new SuperPoder("Pastilhas encolhedoras", 4));

        Vilao duendeVerde = new Vilao("Duende Verde", 10, "Norman Osbourne");
        duendeVerde.adicionarSuperPoder(new SuperPoder("Força", 5));

        Jogo jogo = new Jogo();
        String resultado = jogo.confronto(chapolin, duendeVerde);
        System.out.println(resultado);
    }
}