import java.util.Scanner;

public class Uni4Ex4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double A = teclado.nextDouble();

        if ( A != (int) A) {
            System.out.println("O número apresenta casas decimais");
        } else { 
            System.out.println("O número não apresenta casas decimais");   
        }
        teclado.close();
    }
}

