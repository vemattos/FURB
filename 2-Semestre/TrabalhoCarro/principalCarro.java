//vinicius mattos
 
 public class principalCarro {
    public static void main(String[] args) {
        
        Carro[] carros = new Carro[5];
        carros[0] = new Carro("Gol", "VW", "MMM001", "Preta", 2009, 25000.0, 1);
        carros[1] = new Carro("Fox", "VW", "LML002", "Vermelha", 2010, 30000.0, 2);
        carros[2] = new Carro("Uno", "Fiat", "MLM003", "Cinza", 2011, 32000.0, 3);
        carros[3] = new Carro("Fiesta", "Ford", "LLL004", "Branca", 2009, 29000.0, 1);
        carros[4] = new Carro("Palio", "Fiat", "KKK345", "Amarelo", 2011, 26000.0, 1);

        int anoDesejado = 2011;
        System.out.println("Carros de " + anoDesejado + ":");
        boolean encontrarCarro = false;

        for (int i = 0; i < carros.length; i++) {
            if (carros[i].getAno() == anoDesejado) {
                carros[i].imprimir();
                encontrarCarro = true;
            }
        }

        if (!encontrarCarro) {
            System.out.println("Nenhum carro de " + anoDesejado + " foi encontrado.");
        }

        String marcaDesejada = "VW";
        double precoMinimo = 25000.0;
        double precoMaximo = 30000.0;
        System.out.println("\nCarros da marca " + marcaDesejada + " com preço entre R$" + precoMinimo + " e R$" + precoMaximo + ":");
        for (int i = 0; i < carros.length; i++) {
            if (carros[i].getMarca().equals(marcaDesejada) && carros[i].getPreco() >= precoMinimo && carros[i].getPreco() <= precoMaximo) {
                System.out.println(carros[i].getModelo() + " -> R$" + carros[i].getPreco());
            }
        }

        int localDesejado = 1;
        double menorPrecoLocal = Double.MAX_VALUE;
        double maiorPrecoLocal = 0.0;
        System.out.println("\nCarros no local " + localDesejado + ":");
        for (int i = 0; i < carros.length; i++) {
            if (carros[i].getLocalizacao() == localDesejado) {
                if (carros[i].getPreco() < menorPrecoLocal) {
                    menorPrecoLocal = carros[i].getPreco();
                }
                if (carros[i].getPreco() > maiorPrecoLocal) {
                    maiorPrecoLocal = carros[i].getPreco();
                }
                System.out.println(carros[i].getModelo() + " -> R$" + carros[i].getPreco());
            }
        }
        System.out.println("O carro mais barato do local " + localDesejado + " custa: R$" + menorPrecoLocal);
        System.out.println("O carro mais caro do local " + localDesejado + " custa: R$" + maiorPrecoLocal);
    }
}