import java.util.Scanner;

public class Uni4Ex15 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Informe o tempo de admissão em meses");
        int meses = teclado.nextInt();
         
        if (meses <= 12) {
            System.out.println("O funcionário irá receber 5% de ajuste salarial");
        }
        if (meses > 12 && meses <=48) {
            System.out.println("O funcionário irá receber 7% de ajuste salarial");
        }
        teclado.close();
    }
}
