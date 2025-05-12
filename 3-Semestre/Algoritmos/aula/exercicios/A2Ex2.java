
import java.util.Scanner;
import java.util.Vector;

public class A2Ex2 {
    private Vector<String> registros;
    private Scanner scanner;

    public A2Ex2() {
        registros = new Vector<>();
        scanner = new Scanner(System.in);
    }

    public static void main(String[] args) {
        A2Ex2 cadastro = new A2Ex2();
        cadastro.executar();
    }

    public void executar() {
        exibirMenu();
        int opcao = scanner.nextInt();
        scanner.nextLine();

        switch (opcao) {
            case 1:
                cadastrar();
                break;
            case 2:
                selecionar();
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
            case 0:
                System.out.println("Fim");
                scanner.close();
                return;
            default:
                System.out.println("Opção inválida");
        }

        executar();
    }

    private void exibirMenu() {
        System.out.print("Escolha uma opção: ");
        System.out.println("1 - Cadastrar");
        System.out.println("2 - Selecionar todos os registros");
        System.out.println("3 - Pesquisar por termo");
        System.out.println("4 - Alterar dados");
        System.out.println("5 - Remover registro");
        System.out.println("0 - Sair");
    }

    private void cadastrar() {
        System.out.print("Digite o novo registro: ");
        String novoRegistro = scanner.nextLine();

        if (!registros.contains(novoRegistro)) {
            registros.add(novoRegistro);
            System.out.println("Registro cadastrado");
        } else {
            System.out.println("Esse registro já existe");
        }
    }

    private void selecionar() {
        if (registros.isEmpty()) {
            System.out.println("Não há registros cadastrados");
        } else {
            System.out.println("Registros cadastrados:");
            for (String registro : registros) {
                System.out.println(registro);
            }
        }
    }

    private void pesquisar() {
        System.out.print("Digite o termo de pesquisa: ");
        String termo = scanner.nextLine().toLowerCase();

        System.out.println("Registros encontrados:");
        for (String registro : registros) {
            if (registro.toLowerCase().contains(termo)) {
                System.out.println(registro);
            }
        }
    }

    private void alterar() {
        System.out.print("Digite o registro a ser alterado: ");
        String registroAntigo = scanner.nextLine();

        if (registros.contains(registroAntigo)) {
            System.out.print("Digite o novo valor: ");
            String novoValor = scanner.nextLine();

            registros.set(registros.indexOf(registroAntigo), novoValor);
            System.out.println("Registro alterado");
        } else {
            System.out.println("Registro não encontrado");
        }
    }

    private void remover() {
        System.out.print("Digite o registro a ser removido: ");
        String registroRemover = scanner.nextLine();

        if (registros.contains(registroRemover)) {
            registros.remove(registroRemover);
            System.out.println("Registro removido");
        } else {
            System.out.println("Registro não encontrado");
        }
    }
}
