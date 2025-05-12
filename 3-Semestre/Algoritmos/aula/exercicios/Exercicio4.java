
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/*
 * - A estrutura de fila é apropriada para esse sistema, pois o primeiro a chegar é o primeiro a ser atendido (FIFO - First In, First Out).
 */
public class Exercicio4 {

    public static void main(String[] args) {
        Exercicio4 ex4 = new Exercicio4();
        ex4.iniciarAtendimento();
    }

    private Queue<String> fila;
    private Scanner s;

    public Exercicio4() {
        fila = new LinkedList<>();
        s = new Scanner(System.in);
    }

    public void iniciarAtendimento() {
        int opcao = 0;
        while (opcao != 3) {
            System.out.println("Escolha uma opção:");
            System.out.println("1- Cadastrar");
            System.out.println("2- Remover");
            System.out.println("3- Fim");
            opcao = s.nextInt();
            s.nextLine();

            switch (opcao) {
                case 1:
                    cadastrar();
                    break;
                case 2:
                    remover();
                    break;
                case 3:
                    System.out.println("Fim");
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }
        s.close();
    }

    private void cadastrar() {
        System.out.println("Digite o nome da pessoa para atendimento:");
        String nome = s.nextLine();
        fila.offer(nome);
        System.out.println("Atendimento cadastrado");
    }

    private void remover() {
        if (!fila.isEmpty()) {
            String atendimentoRemovido = fila.poll();
            System.out.println("Atendimento removido: " + atendimentoRemovido);
        } else {
            System.out.println("A fila está vazia");
        }
    }
}