import java.util.Scanner;

public class Uni4Ex26 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("se opção = T: calcular a área de um triângulo de base b e altura h");
        System.out.println("se opção = Q: calcular a área de um quadrado de lado l");
        System.out.println("se opção = R: calcular a área de um retângulo de base b e altura h");
        System.out.println("se opção = C: calcular a área de um círculo de raio r");
        char opção = teclado.next().toUpperCase().charAt(0);

        if (opção == 'T') {
            System.out.println("Digite a base do triângulo");
            int base = teclado.nextInt();
            System.out.println("Digite a altura do triângulo");
            int alt = teclado.nextInt();
            int at = base * alt;
            System.out.println("A área do triângulo é = " + at);
        }
        else if (opção == 'Q') {
            System.out.println("Digite o lado do quadrado");
            int lado = teclado.nextInt();
            int aq = lado * lado;
            System.out.println("A área do quadrado é = " + aq);
        }
        else if (opção == 'R') {
            System.out.println("Digite a base do retângulo");
            int baseR = teclado.nextInt();
            System.out.println("Digite a altura do retângulo");
            int alturaR = teclado.nextInt();
            int ar = baseR * alturaR;
            System.out.println("A área do retângulo é = " + ar);
        }
        else if (opção == 'C') {
            System.out.println("Informe o raio do círculo");
            int raio = teclado.nextInt();
            double ac = Math.PI * Math.pow(raio, 2);
            System.out.println("A área do círculo é = " + ac);
        }
        else {
            System.out.println("Entrada incorreta");
    }
    teclado.close();
    }
}

