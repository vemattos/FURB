import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Informe a quantidade de alunos: ");
        int n = scanner.nextInt();
        
        String[] nomes = new String[n];
        int[] idades = new int[n];
        
        // Preenche os nomes e idades dos alunos
        for (int i = 0; i < n; i++) {
            System.out.print("Informe o nome do aluno " + (i + 1) + ": ");
            nomes[i] = scanner.next();
            System.out.print("Informe a idade do aluno " + (i + 1) + ": ");
            idades[i] = scanner.nextInt();
        }
        
        System.out.println("Alunos com 18 anos:");
        // Imprime os nomes dos alunos com 18 anos
        for (int i = 0; i < n; i++) {
            if (idades[i] == 18) {
                System.out.println(nomes[i]);
            }
        }
        
        int contador = 0;
        // Conta a quantidade de alunos com idade acima de 20 anos
        for (int i = 0; i < n; i++) {
            if (idades[i] > 20) {
                contador++;
            }
        }
        
        System.out.println("Quantidade de alunos com idade acima de 20 anos: " + contador);
        scanner.close();
    }
}
