import java.util.Scanner;

public class Uni3Uri1016 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int velocidade = teclado.nextInt();
        int resposta = velocidade * 2;

        System.out.println(resposta + " minutos");
        teclado.close();

    }
}
