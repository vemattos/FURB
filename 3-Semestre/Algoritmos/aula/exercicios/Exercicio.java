
import java.util.Scanner;

public class Exercicio {

    public static void main(String[] args) {
        Exercicio ex2 = new Exercicio();
        ex2.exercicio();
    }

    private void exercicio() {
        Scanner s = new Scanner(System.in);
        String[] nomes = new String[10];

        int opcao = 0;
        while (opcao != 5) {
            System.out.println("Escolha uma opção:");
            System.out.println("1- Cadastrar");
            System.out.println("2- Listar nomes");
            System.out.println("3- Editar");
            System.out.println("4- Deletar");
            System.out.println("5- Fim");
            opcao = s.nextInt();
            s.nextLine();
            switch (opcao) {
                case 1:
                    cadastrar(nomes, s);
                    break;
                case 2:
                    listar(nomes);
                    break;
                case 3:
                    editar(nomes, s);
                    break;
                case 4:
                    deletar(nomes, s);
                    break;
                case 5:
                    System.out.println("Fim");
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }
        s.close();
    }

    private void cadastrar(String[] nomes, Scanner s) {
        System.out.println("Digite o nome a ser cadastrado:");
        String nome = s.nextLine();
        for (int i = 0; i < nomes.length; i++) {
            if (nomes[i] == null) {
                nomes[i] = nome;
                System.out.println("Nome cadastrado");
                return;
            }
        }
        System.out.println("O array está cheio.");
    }

    private void listar(String[] nomes) {
        System.out.println("Lista de Nomes:");
        for (String nome : nomes) {
            if (nome != null) {
                System.out.println(nome);
            }
        }
    }

    private void editar(String[] nomes, Scanner s) {
        System.out.println("Índice do nome a ser editado:");
        int i = s.nextInt();
        s.nextLine();

        if (i >= 0 && i < nomes.length && nomes[i] != null) {
            System.out.println("Digite o novo nome:");
            nomes[i] = s.nextLine();
            System.out.println("Nome alterado");
        } else {
            System.out.println("Índice inválido");
        }
    }

    private void deletar(String[] nomes, Scanner s) {
        System.out.println("Índice do nome a ser editado:");
        int i = s.nextInt();
        s.nextLine();
        if (i >= 0 && i < nomes.length && nomes[i] != null) {
            nomes[i] = null;
            System.out.println("Nome removido");
        } else {
            System.out.println("Índice inválido");
        }
    }
}