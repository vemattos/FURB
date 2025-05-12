import java.util.Scanner;

public class teste1 {
    static int a;
    static int b;
    public static void main(String[] args) {
        System.out.println("Insira valor 1");
        Scanner teclado = new Scanner(System.in);
         a = teclado.nextInt();
        System.out.println("Insira valor 2");
         b = teclado.nextInt();
        somaDados();
        teclado.close();
    }
    public static void somaDados(){
        int soma = a + b;
        System.out.println("Soma = " + soma);
    }
}
