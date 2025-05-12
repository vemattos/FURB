import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalClientes = 30;
        int[] sexo = new int[totalClientes];
        int[] nota = new int[totalClientes];
        int[] idade = new int[totalClientes];

        for (int i = 0; i < totalClientes; i++) {
            System.out.println("Cliente " + (i + 1));
            System.out.print("Sexo (1 - feminino, 2 - masculino): ");
            sexo[i] = scanner.nextInt();
            System.out.print("Nota (de 0 a 10): ");
            nota[i] = scanner.nextInt();
            System.out.print("Idade: ");
            idade[i] = scanner.nextInt();
            System.out.println();
        }

        double mediaGeral = calcularMedia(nota);
        double mediaHomens = calcularMediaPorSexo(nota, sexo, 2);
        int notaMulherMaisJovem = encontrarNotaMulherMaisJovem(nota, sexo, idade);
        int mulheresMais50AcimaMedia = contarMulheresMais50AcimaMedia(nota, sexo, idade, mediaGeral);

        System.out.println("Nota média recebida pelo cinema: " + mediaGeral);
        System.out.println("Nota média atribuída pelos homens: " + mediaHomens);
        System.out.println("Nota atribuída pela mulher mais jovem: " + notaMulherMaisJovem);
        System.out.println("Quantidade de mulheres com mais de 50 anos que deram nota acima da média: " + mulheresMais50AcimaMedia);
        scanner.close();
    }

    public static double calcularMedia(int[] notas) {
        int soma = 0;
        for (int nota : notas) {
            soma += nota;
        }
        return (double) soma / notas.length;
    }

    public static double calcularMediaPorSexo(int[] notas, int[] sexos, int sexoAlvo) {
        int soma = 0;
        int count = 0;
        for (int i = 0; i < sexos.length; i++) {
            if (sexos[i] == sexoAlvo) {
                soma += notas[i];
                count++;
            }
        }
        if (count == 0) {
            return 0.0;
        }
        return (double) soma / count;
    }

    public static int encontrarNotaMulherMaisJovem(int[] notas, int[] sexos, int[] idades) {
        int menorIdadeMulher = Integer.MAX_VALUE;
        int notaMulherMaisJovem = -1;
        for (int i = 0; i < sexos.length; i++) {
            if (sexos[i] == 1 && idades[i] < menorIdadeMulher) {
                menorIdadeMulher = idades[i];
                notaMulherMaisJovem = notas[i];
            }
        }
        return notaMulherMaisJovem;
    }

    public static int contarMulheresMais50AcimaMedia(int[] notas, int[] sexos, int[] idades, double media) {
        int count = 0;
        for (int i = 0; i < sexos.length; i++) {
            if (sexos[i] == 1 && idades[i] > 50 && notas[i] > media) {
                count++;
            }
        }
        return count;
    }
}