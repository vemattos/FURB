import java.util.Scanner;

public class Uri1173 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int V = teclado.nextInt();
        int N[] = new int[10];
        N[0] = V;
        for (int i = 1; i < N.length; i++)
            N[i] = N[i-1] * 2;
        for (int i = 0; i < N.length; i++)
            System.out.println("N[" + i + "] = " + N[i]);
    
        teclado.close();
    }
}
