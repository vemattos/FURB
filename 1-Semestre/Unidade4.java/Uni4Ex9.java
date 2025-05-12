import java.util.Scanner;

public class Uni4Ex9 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int num1 = teclado.nextInt();
        int num2 = teclado.nextInt();

        if (num1 % num2 == 0 || num2 % num1 == 0) {
            System.out.println("São múltiplos");
        }else{
            System.out.println("Não são múltiplos");
            
        }
        teclado.close();
    }
}
