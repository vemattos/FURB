package exercicios.src;


import java.util.Scanner;
public class Bccmat8 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    System.out.println("Insira o código da peça 1");
    int P1 = teclado.nextInt();
    System.out.println("Insira o número de peças");
    int Np1 = teclado.nextInt();
    System.out.println("Insira o valor da peça 1");
    int Vp1 = teclado.nextInt();
    
    System.out.println("Insira o código da peça 2");
    int P2 = teclado.nextInt();
    System.out.println("Insira o número de peças");
    int Np2 = teclado.nextInt();
    System.out.println("Insira o valor da peça 2");
    int Vp2 = teclado.nextInt(); 
    
    int vtotal = (Np1 * Vp1) + (Np2 * Vp2);

    System.out.println("As peças " + P1 + " e " + P2  + " custarão " + vtotal);
    teclado.close();
    }
    
}
