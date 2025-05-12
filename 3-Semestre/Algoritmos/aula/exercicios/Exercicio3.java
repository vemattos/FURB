
import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
        Exercicio3 ex3 = new Exercicio3();
        ex3.exercicio();
    }

    private ArrayList<Produto> produtos;
    private Scanner s;

    public Exercicio3() {
        produtos = new ArrayList<>();
        s = new Scanner(System.in);
    }

    public void exercicio() {
        int opcao = 0;

        while (opcao != 6) {
            System.out.println("1- Cadastrar");
            System.out.println("2- Listar");
            System.out.println("3- Pesquisar");
            System.out.println("4- Alterar");
            System.out.println("5- Remover");
            System.out.println("6- Fim");
            System.out.print("Escolha uma opção: ");
            opcao = s.nextInt();
            s.nextLine(); 

            switch (opcao) {
                case 1:
                    cadastrar();
                    break;
                case 2:
                    listar();
                    break;
                case 3:
                    pesquisar();
                    break;
                case 4:
                    alterar();
                    break;
                case 5:
                    remover();
                    break;
                case 6:
                    System.out.println("Fim");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }
        s.close();
    }

    private void cadastrar() {
        System.out.print("Nome do produto: ");
        String nome = s.nextLine();
        System.out.print("Valor do produto: ");
        double valor = s.nextDouble();
        produtos.add(new Produto(nome, valor));
        System.out.println("Produto cadastrado");
    }

    private void listar() {
        if (produtos.isEmpty()) {
            System.out.println("Nenhum produto cadastrado");
        } else {
            for (Produto produto : produtos) {
                System.out.println("Nome: " + produto.nome + " - Valor: " + produto.valor);
            }
        }
    }

    private void pesquisar() {
        System.out.print("Pesquise o produto: ");
        String termo = s.nextLine();
        boolean encontrado = false;
        for (Produto produto : produtos) {
            if (produto.nome.contains(termo)) {
                System.out.println("Nome: " + produto.nome + " - Valor: " + produto.valor);
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("Nenhum produto encontrado com esse nome");
        }
    }

    private void alterar() {
        System.out.print("Digite o nome do produto que será alterado: ");
        String nomeAlterar = s.nextLine();
        boolean encontrado = false;
        for (Produto produto : produtos) {
            if (produto.nome.equals(nomeAlterar)) {
                System.out.print("Novo nome: ");
                String novoNome = s.nextLine();
                System.out.print("Novo valor: ");
                double novoValor = s.nextDouble();
                produto.nome = novoNome;
                produto.valor = novoValor;
                System.out.println("Produto alterado");
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Produto não encontrado");
        }
    }

    private void remover() {
        System.out.print("Digite o nome do produto que será removido: ");
        String nomeRemover = s.nextLine();
        boolean removido = false;
        for (Produto produto : produtos) {
            if (produto.nome.equals(nomeRemover)) {
                produtos.remove(produto);
                System.out.println("Produto removido");
                removido = true;
                break;
            }
        }
        if (!removido) {
            System.out.println("Produto não encontrado");
        }
    }
}