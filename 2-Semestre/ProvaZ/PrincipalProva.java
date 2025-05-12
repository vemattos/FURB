package zProva;

import java.util.HashMap;

public class PrincipalProva {
    public static void main(String[] args) {
        HashMap<String, Onibus> onibusHashMap = new HashMap<String, Onibus>();
        
        Onibus onibus1 = new Municipal("AAA123", 10, 5.30, 45);
        Onibus onibus2 = new Intermunicipal("BBB456", 20, 5.30, 0.70);

        onibusHashMap.put(onibus1.getPlaca(), onibus1);
        onibusHashMap.put(onibus2.getPlaca(), onibus2);

        Motorista motorista1 = new Motorista("Pedro", 10);
        Motorista motorista2 = new Motorista("Carlos", 20);

        onibus1.adicionaMotorista(motorista1);
        onibus2.adicionaMotorista(motorista2);

        Passageiro passageiro1 = new Estudante("Matheus", 11);
        Passageiro passageiro2 = new Aposentado("Jon", 123456);
        Passageiro passageiro3 = new Passageiro("Jhonatan");
        Passageiro passageiro4 = new Estudante("Jão", 12);
        Passageiro passageiro5 = new Aposentado("Anderson", 456789);
        Passageiro passageiro6 = new Passageiro("Romario");
        Passageiro passageiro7 = new Estudante("Ronaldo", 13);
        Passageiro passageiro8 = new Aposentado("Dalessandro", 7891011);
        Passageiro passageiro9 = new Passageiro("Taison");
        Passageiro passageiro10 = new Aposentado("Messi", 123124);
        Passageiro passageiro11 = new Aposentado("Peter", 4324523);

        onibus1.adicionaPassageiros(passageiro1);
        onibus1.adicionaPassageiros(passageiro2);
        onibus1.adicionaPassageiros(passageiro3);
        onibus1.adicionaPassageiros(passageiro4);
        onibus1.adicionaPassageiros(passageiro5);

        onibus2.adicionaPassageiros(passageiro6);
        onibus2.adicionaPassageiros(passageiro7);
        onibus2.adicionaPassageiros(passageiro8);
        onibus2.adicionaPassageiros(passageiro9);
        onibus2.adicionaPassageiros(passageiro10);
        onibus2.adicionaPassageiros(passageiro11);

        System.out.println(onibus1.ContaAposentados());
        System.out.println(onibus2.ContaAposentados());

        for (Onibus onibus : onibusHashMap.values()) {
            System.out.println("O ônibus " + onibus + "\nArrecadou " + onibus.calcularPreco());
        }

        for (Onibus onibus : onibusHashMap.values()) {
            System.out.println("O ônibus " + onibus + "\nPossuí " + onibus.ContaAposentados() + " passageiros aposentados");
        }
        
    }
}
