import java.util.LinkedList;
import java.util.Scanner;

public class Av1 {

    LinkedList<String> tarefas = new LinkedList<>();
    Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        Av1 p1 = new Av1();
        p1.executar();
    }

    public void executar() {
        boolean sair = false;
        while (!sair) {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Cadastrar tarefa");
            System.out.println("2 - Concluir tarefa");
            System.out.println("3 - Listar todas as tarefas");
            System.out.println("4 - Finalizar");

            int opcao = s.nextInt();
            s.nextLine(); 

            switch (opcao) {
                case 1:
                    cadastrar();
                    break;
                case 2:
                    concluir();
                    break;
                case 3:
                    listar();
                    break;
                case 4:
                    sair = true;
                    System.out.println("Fim");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }
    }

    public void cadastrar() {
        System.out.println("Cadastre uma tarefa: ");
        String nome = s.nextLine();
        tarefas.addLast(nome);
        System.out.println("Tarefa cadastrada");
    }

    public void concluir(){
        if (tarefas.isEmpty()) {
            System.out.println("Não há tarefas na lista");
        } else {
                String t = tarefas.removeFirst();
                System.out.println("Tarefa concluída: " + t);
                if (!tarefas.isEmpty()) {
                    System.out.println("Próxima tarefa: " + tarefas.getFirst());
                } else {
                    System.out.println("Todas as tarefas foram concluídas");
                }
        }
    }
    
    public void listar(){
        if (tarefas.isEmpty()) {
            System.out.println("Não há tarefas na lista");
        } else {
            System.out.println("Tarefas na lista:");
            for (String tarefa : tarefas) {
                System.out.println(tarefa);
            }
        }
    }
}
