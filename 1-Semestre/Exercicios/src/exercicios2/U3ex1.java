package exercicios2;

import java.util.Scanner;

public class U3ex1 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    System.out.println("Informe a largura do terreno");
    double largura = teclado.nextDouble();
    System.out.println("Informe a altura do terreno");
    double altura = teclado.nextDouble();

    double area = largura * altura;
    System.out.println("A área do terreno é " + area);
    teclado.close();
  }  
}
