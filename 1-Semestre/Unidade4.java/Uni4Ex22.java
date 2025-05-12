import java.util.Scanner;

public class Uni4Ex22 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("1 = Ciência da Computação");
        System.out.println("2 = Licenciatura da Computação");
        System.out.println("3 = Sistemas de Informação");
        int opção = teclado.nextInt();

        if (opção == 1) {
            System.out.println("Bacharel em Ciência da Computação");
        }
        else if (opção == 2) {
            System.out.println("Licenciado em Computação");
        }
        else if (opção == 3) {
            System.out.println("Bacharel em Sistemas de Informação");
        }
        else {
            System.out.println("Entrada incorreta");
        }
        teclado.close();
    }
}


