import java.util.LinkedList;
import java.util.Scanner;

public class A2Ex4 {
    LinkedList<String> lista = new LinkedList<>();
    Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        A2Ex4 nos = new A2Ex4();
        nos.executar();
    }

    public void executar() {
        boolean sair = false;

        while (!sair) {
            System.out.println("Escolha uma opção:");
            System.out.println("1- Cadastrar nome");
            System.out.println("2- Listar nomes");
            System.out.println("3- Finalizar");

            int opcao = s.nextInt();
            s.nextLine(); 

            switch (opcao) {
                case 1:
                    cadastrar();
                    break;
                case 2:
                    listar();
                    break;
                case 3:
                    sair = true;
                    System.out.println("Fim");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }
    }

    public void cadastrar() {
        System.out.println("Digite o nome que deseja cadastrar:");
        String nome = s.nextLine();

        lista.add(nome);
        System.out.println("Nome cadastrado");
    }

    public void listar() {
        if (lista.isEmpty()) {
            System.out.println("Lista vazia");
        } else {
            System.out.println("Nomes na lista:");
            for (String nome : lista) {
                System.out.println(nome);
            }
        }
    }
}