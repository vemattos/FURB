import java.util.Scanner;

public class Uni4Ex12 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Insira valor do lado 1");
        int lado1 = teclado.nextInt();
        System.out.println("Insira valor do lado 2");
        int lado2 = teclado.nextInt();
        System.out.println("Insira valor do lado 3");
        int lado3 = teclado.nextInt();

        if (lado1 == lado2 && lado1 == lado3 && lado2 == lado3) {
            System.out.println("EQUILÁTERO");
        } else {
            if (lado1 != lado2 && lado1 != lado3 && lado2 != lado3) {
                System.out.println("ESCALENO");
            } else {
                if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {
                    System.out.println("ISÓCELES");
                }
                
            }
           
            
        }
     teclado.close();

    }
}
