package VeiculoAbstrato;

public class Principal {
    public static void main(String[] args) {
        Carro carro = new Carro("Ford", "Fiesta");
        Moto moto = new Moto("Honda", "CBR");

        carro.exibirInformacoes();
        carro.acelerar();
        carro.frear();

        System.out.println();

        moto.exibirInformacoes();
        moto.acelerar();
        moto.frear();
    }
}