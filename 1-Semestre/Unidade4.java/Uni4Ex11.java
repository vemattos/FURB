import java.util.Scanner;

public class Uni4Ex11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Insira a idade dos 3 filhos");

        int prim = teclado.nextInt();
        int seg = teclado.nextInt();
        int ter = teclado.nextInt();

        if (prim == seg && seg == ter) {
            System.out.println("TRIGÊMEOS");
        } else {
            if (prim == seg || prim == ter || seg == ter) {
                System.out.println("GÊMEOS");
            } else {
                if (prim != seg && prim != ter) {
                    System.out.println("APENAS IRMÃOS");

                    
                }
                
            }
            
        }

teclado.close();
    }
}
