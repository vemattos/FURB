import java.util.Scanner;

public class ex10 {
    private static final int CAPACIDADE = 50;
    private static int[] vetor = new int[CAPACIDADE];
    private static int tamanho = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            exibirMenu();
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    incluirValor();
                    break;
                case 2:
                    pesquisarValor();
                    break;
                case 3:
                    alterarValor();
                    break;
                case 4:
                    excluirValor();
                    break;
                case 5:
                    mostrarValores();
                    break;
                case 6:
                    ordenarValores();
                    break;
                case 7:
                    inverterValores();
                    break;
                case 8:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }

            System.out.println();
        } while (opcao != 8);
        scanner.close();
    }

    public static void exibirMenu() {
        System.out.println("Menu:");
        System.out.println("1 - Incluir valor");
        System.out.println("2 - Pesquisar valor");
        System.out.println("3 - Alterar valor");
        System.out.println("4 - Excluir valor");
        System.out.println("5 - Mostrar valores");
        System.out.println("6 - Ordenar valores");
        System.out.println("7 - Inverter valores");
        System.out.println("8 - Sair do sistema");
    }

    public static void incluirValor() {
        if (tamanho == CAPACIDADE) {
            System.out.println("O vetor está cheio. Não é possível incluir mais valores.");
            return;
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor a ser incluído: ");
        int valor = scanner.nextInt();

        vetor[tamanho] = valor;
        tamanho++;

        System.out.println("Valor incluído no vetor.");
        scanner.close();
    }

    public static void pesquisarValor() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor a ser pesquisado: ");
        int valor = scanner.nextInt();
        scanner.close();

        for (int i = 0; i < tamanho; i++) {
            if (vetor[i] == valor) {
                System.out.println("O valor está presente no vetor.");
                return;
            }
        }
        System.out.println("O valor não está presente no vetor.");   
    }
    public static void alterarValor() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número a ser alterado: ");
        int numeroAntigo = scanner.nextInt();
        System.out.print("Digite o novo número: ");
        int numeroNovo = scanner.nextInt();

        boolean encontrado = false;
        for (int i = 0; i < tamanho; i++) {
            if (vetor[i] == numeroAntigo) {
                vetor[i] = numeroNovo;
                encontrado = true;
                break;
            }
        }
        if (encontrado) {
            System.out.println("Número alterado com sucesso.");
        } else {
            System.out.println("Número não encontrado.");
        }
        scanner.close();
    }
    public static void excluirValor() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor a ser excluído: ");
        int valor = scanner.nextInt();
        boolean encontrado = false;
        for (int i = 0; i < tamanho; i++) {
            if (vetor[i] == valor) {
                encontrado = true;

                // Deslocar os elementos à frente para preencher a posição excluída
                for (int j = i; j < tamanho - 1; j++) {
                    vetor[j] = vetor[j + 1];
                }

                tamanho--;
                break;
            }
        }

        if (encontrado) {
            System.out.println("Valor excluído do vetor.");
        } else {
            System.out.println("Valor não encontrado.");
        }
        scanner.close();
    }

    public static void mostrarValores() {
        System.out.print("Valores do vetor: ");
        for (int i = 0; i < tamanho; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
    }

    public static void ordenarValores() {
        boolean trocou;

        do {
            trocou = false;

            for (int i = 0; i < tamanho - 1; i++) {
                if (vetor[i] > vetor[i + 1]) {
                    int temp = vetor[i];
                    vetor[i] = vetor[i + 1];
                    vetor[i + 1] = temp;
                    trocou = true;
                }
            }
        } while (trocou);

        System.out.println("Valores ordenados em ordem crescente.");
    }

    public static void inverterValores() {
        int inicio = 0;
        int fim = tamanho - 1;

        while (inicio < fim) {
            int temp = vetor[inicio];
            vetor[inicio] = vetor[fim];
            vetor[fim] = temp;
            inicio++;
            fim--;
        }

        System.out.println("Valores do vetor invertidos.");
    }
}