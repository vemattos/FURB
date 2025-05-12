import java.util.Scanner;

public class Uri1180 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int menor = 0, pos = 0;
        int N = teclado.nextInt();
        int[] X = new int[N];

        for (int i = 0; i < N; i++)
            X[i] = teclado.nextInt();
        for (int i = 0; i < N; i++) {
            if (i == 0) {
                menor = X[i];
                pos = 1;
            } else {
                if (menor > X[i]) {
                    menor = X[i];
                    pos = i;
                }
            }
        }
        System.out.println("Menor valor: " + menor);
        System.out.println("Posição: " + pos);
        teclado.close();
    }
}