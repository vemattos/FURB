package Trabalho;
//Vinícius Mattos
//Matheus Gamba

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Municipios {

    public static void main(String[] args) {
        System.out.println("EQUIPE: \nVINICIUS MATTOS \nMATHEUS GAMBA \n--------------");
        try (BufferedReader leitor = new BufferedReader(new FileReader("C://TextosTrabalho//municipios2.csv"))) {
            String cidadeMaior = MaiorPop("C://TextosTrabalho//municipios2.csv");
            String cidadeMenor = MenorPop("C://TextosTrabalho//municipios2.csv");

            System.out.println("A cidade com a maior população é " + cidadeMaior);
            System.out.println("A cidade com a menor população é " + cidadeMenor);
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo");
        }
    }

    public static String MaiorPop(String arquivo) throws IOException {
        try (BufferedReader leitor = new BufferedReader(new FileReader(arquivo))) {
            String linha;
            int maiorPopulacao = -1;
            String cidadeMaior = "";
            linha = leitor.readLine();
            while ((linha = leitor.readLine()) != null) {
                String[] partes = linha.split(";");
                if (partes.length == 4) {
                    try {
                        int populacao = Integer.parseInt(partes[3]);
                        if (populacao > maiorPopulacao) {
                            maiorPopulacao = populacao;
                            cidadeMaior = partes[1] + ", com " + populacao + " habitantes";
                        }
                    } catch (Exception e) {
                        System.out.println("Erro na conversão");
                    }
                }
            }
            return cidadeMaior;
        }
    }

    public static String MenorPop(String arquivo) throws IOException {
        try (BufferedReader leitor = new BufferedReader(new FileReader(arquivo))) {
            String linha;
            int menorPopulacao = 999999999;
            String cidadeMenor = "";
            linha = leitor.readLine();
            while ((linha = leitor.readLine()) != null) {
                String[] partes = linha.split(";");
                if (partes.length == 4) {
                    try {
                        int populacao = Integer.parseInt(partes[3]);
                        if (populacao < menorPopulacao) {
                            menorPopulacao = populacao;
                            cidadeMenor = partes[1] + ", com " + populacao + " habitantes";
                        }
                    } catch (Exception e) {
                        System.out.println("Erro na conversão de número " + partes[3]);
                    }
                }
            }
            return cidadeMenor;
        }
    }
}