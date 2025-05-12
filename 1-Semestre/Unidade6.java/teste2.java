import java.util.Scanner;

public class teste2 {
    static int maior = 0;
    static int menor = 0;
    static int indiceMaior = -1;
    static int indiceMenor = -1;
    static String nomes[] = new String[10];
    static int idades[] = new int[10];
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        entraDados();
        mostraResultados();

    }
    public static void entraDados(){
        for (int i = 0; i < 10; i++) {
            nomes[i] = teclado.next();
            idades[i] = teclado.nextInt();
            if (idades[i] > maior) {
                maior = idades[i];
                indiceMaior = i;
            } else if (idades[i] < menor) {
                menor = idades[i];
                indiceMenor = i;
            }
        }
    } //entraDados
    public static void mostraResultados(){
        for (int i = 0; i < 10; i++) {
            if (idades[i] == maior) {
                System.out.println(nomes[i] + " é o maior");
            } else if (idades[i] == menor) {
                System.out.println(nomes[i] + " é o menor");
            }
        }
    }//mostraResultados
}
