import java.util.Scanner;

public class Uni4Ex2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Entre com um valor inteiro maior do que 0: ");    
        int valor = teclado.nextInt();

        if (valor % 2 == 0)
            System.out.println("Número é par");
        else
            System.out.print("Número é ímpar");
            teclado.close();
    }
}

