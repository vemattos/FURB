import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class A2Ex5 {
    Map<String, String> estudantes = new HashMap<>();
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        A2Ex5 estudantes = new A2Ex5();
        estudantes.executar();
    }

    public void executar() {
        boolean sair = false;

        while (!sair) {
            System.out.println("Escolha uma opção:");
            System.out.println("1- Cadastrar aluno");
            System.out.println("2- Selecionar aluno");
            System.out.println("3- Alterar dados do aluno");
            System.out.println("4- Excluir aluno");
            System.out.println("5- Estatísticas");
            System.out.println("6- Sair");

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
                    alterar();
                    break;
                case 4:
                    excluir();
                    break;
                case 5:
                    estatisticas();
                    break;
                case 6:
                    sair = true;
                    System.out.println("Fim");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }
    }

    public void cadastrar() {
        System.out.println("Digite o nome do aluno:");
        String nome = scanner.nextLine();
        System.out.println("Digite o status do aluno (Aprovado/Reprovado):");
        String status = scanner.nextLine();

        estudantes.put(nome, status);
        System.out.println("Aluno cadastrado");
    }

    public void selecionar() {
        System.out.println("Digite o nome do aluno que deseja selecionar:");
        String nome = scanner.nextLine();

        if (estudantes.containsKey(nome)) {
            System.out.println("Nome: " + nome + ", status: " + estudantes.get(nome));
        } else {
            System.out.println("Aluno não encontrado");
        }
    }

    public void alterar() {
        System.out.println("Digite o nome do aluno que deseja alterar:");
        String nome = scanner.nextLine();

        if (estudantes.containsKey(nome)) {
            System.out.println("Digite o novo status do aluno (Aprovado/Reprovado):");
            String novoStatus = scanner.nextLine();
            estudantes.put(nome, novoStatus);
            System.out.println("Dados do aluno alterados");
        } else {
            System.out.println("Aluno não encontrado");
        }
    }

    public void excluir() {
        System.out.println("Digite o nome do aluno que deseja excluir:");
        String nome = scanner.nextLine();

        if (estudantes.containsKey(nome)) {
            estudantes.remove(nome);
            System.out.println("Aluno excluído");
        } else {
            System.out.println("Aluno não encontrado");
        }
    }

    public void estatisticas() {
        int totalAlunos = estudantes.size();
        int aprovados = 0;
        int reprovados = 0;

        for (String status : estudantes.values()) {
            if (status.equalsIgnoreCase("Aprovado")) {
                aprovados++;
            } else if (status.equalsIgnoreCase("Reprovado")) {
                reprovados++;
            }
        }

        System.out.println("Estatísticas:");
        System.out.println("Total de alunos registrados: " + totalAlunos);
        System.out.println("Total de alunos aprovados: " + aprovados);
        System.out.println("Total de alunos reprovados: " + reprovados);
    }
}