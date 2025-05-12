import java.util.Scanner;
import java.text.DecimalFormat;

public class Uri1181 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df1 = new DecimalFormat("0.0");

        // Linha onde será efetuada a operação desejada
        int L = teclado.nextInt();

        // Operação desejada (S - soma / M - média)
        String T = teclado.next().toUpperCase();

        // Criar matriz 12x12
        double[][] matriz = new double[12][12];

        // Preencher matriz com valores informados pelo usuário
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++)
                matriz[i][j] = teclado.nextDouble();
        }

        if (T.charAt(0) == 'S') {
            int soma = 0;
            for (int j = 0; j < 12; j++) {
                soma += matriz[L][j];
            }
            System.out.println(df1.format(soma));
        }
        else
            if (T.charAt(0) == 'M') {
            int soma = 0;
            for (int j = 0; j < 12; j++) {
                soma += matriz[L][j];
            }
            double media = (double) soma / 12;
            System.out.println(df1.format(media));
        }
        teclado.close();
    }
}