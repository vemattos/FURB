import java.util.Scanner;
public class ex15 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        while (true) {
            System.out.println("Insira o nome do aluno");
            String nome = teclado.next();
            if (nome.equals("fim")) {
                break;
            }
            System.out.println("Insira nota 1");
            int nota1 = teclado.nextInt();
            System.out.println("Insira nota 2");
            int nota2 = teclado.nextInt();
            int media = (nota1 + nota2) / 2;
            System.out.println("A média do aluno " + nome + " é: " + media);
        }
        teclado.close();
    }
}
