import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Entre com um número inteiro maior do que 2: ");
        int n = teclado.nextInt();
    
        int valorpar = 0;
        int valorimpar = 4;
    
        for (int i = 1; i <= n; i++) { 
            if (i % 2 == 0) {
                valorpar = valorimpar + 2;
                System.out.println(valorpar);
            } else {
                valorimpar = valorimpar * 2;
                System.out.println(valorimpar);
            }
        }  
        teclado.close();
    }
}

