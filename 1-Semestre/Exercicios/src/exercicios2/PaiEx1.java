package exercicios2;

import java.util.Scanner;

public class PaiEx1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String alfabeto = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("Este string é " + alfabeto);
        System.out.println("Seu tamanho é " + alfabeto.length());
        System.out.println("O caractere no indice 4 é: " + alfabeto.charAt(4));
        System.out.println("O índice do caractere Z é: " + alfabeto.indexOf('Z'));
        System.out.println("Sua versão minúscula é: " + alfabeto.toLowerCase());
        System.out.println("Esse string ainda é: " + alfabeto);
        teclado.close();
    }
}
