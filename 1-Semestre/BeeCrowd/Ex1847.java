import java.util.Scanner;

public class Ex1847 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int A = teclado.nextInt(); int B = teclado.nextInt(); int C = teclado.nextInt();
        if (B < A && C >= B)
        System.out.println(":)");
    else
        if (B > A && C <= B)
            System.out.println(":(");
        else
            if (B > A && C > B && (C - B) < (B - A))
                System.out.println(":(");
            else
                if (B > A && C > B && (C - B) >= (B - A))
                    System.out.println(":)");
                else
                    if (B < A && C < B && (B - C) < (A - B))
                        System.out.println(":)");
                    else
                        if (B < A && C < B && (B - C) >= (A - B))
                            System.out.println(":(");
                        else
                            if (A == B) {
                                if (C > B)
                                    System.out.println(":)");
                                else
                                    System.out.println(":(");
                            }

        teclado.close();
    }
}
