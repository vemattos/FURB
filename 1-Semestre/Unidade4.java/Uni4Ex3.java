import java.util.Scanner;

public class Uni4Ex3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Insira o primeiro valor = ");
        int Valor1 = teclado.nextInt();
        System.out.print("Insira o segundo valor = ");
        int Valor2 = teclado.nextInt();

        if (Valor1 > Valor2) {
           System.out.println("O maior valor é = " + Valor1); 
        } else  {
         System.out.println("O maior valor é = " + Valor2);
        }
        teclado.close();

    }
}
