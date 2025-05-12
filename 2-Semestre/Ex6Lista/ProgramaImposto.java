package Ex6Lista;

import java.util.ArrayList;
import java.util.Scanner;

public class ProgramaImposto {

    public ProgramaImposto(){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Contribuinte> contribuintes = new ArrayList<>();

        while (true) {
            System.out.println("Digite as informações do contribuinte ou 'sair' para encerrar:");
            System.out.print("Nome: ");
            String nome = scanner.nextLine();
            if (nome.equals("sair")) {
                break;
            }

            System.out.print("CPF: ");
            String cpf = scanner.nextLine();
            System.out.print("Renda Anual: R$");
            double rendaAnual = scanner.nextDouble();
            scanner.nextLine(); 

            Contribuinte contribuinte = new Contribuinte(nome, cpf, rendaAnual);
            contribuintes.add(contribuinte);
        }

        
        Contribuinte maiorImposto = null;
        double maiorImpostoValor = 0.0;

        for (Contribuinte contribuinte : contribuintes) {
            if (contribuinte.calcularImposto() > maiorImpostoValor) {
                maiorImposto = contribuinte;
                maiorImpostoValor = contribuinte.calcularImposto();
            }
        }

        System.out.println("Opções disponíveis:");
        System.out.println("a) Consultar CPF de um contribuinte");
        System.out.println("b) Mostrar dados do contribuinte com maior imposto a pagar");
        System.out.print("Digite a opção desejada: ");
        char opcao = scanner.nextLine().charAt(0);

        if (opcao == 'a') {
            System.out.print("Digite o CPF do contribuinte: ");
            String cpfConsulta = scanner.nextLine();
            boolean encontrado = false;

            for (Contribuinte contribuinte : contribuintes) {
                if (contribuinte.getCpf().equals(cpfConsulta)) {
                    System.out.println(contribuinte);
                    encontrado = true;
                    break;
                }
            }

            if (!encontrado) {
                System.out.println("Contribuinte não encontrado.");
            }
        } else if (opcao == 'b') {
            if (maiorImposto != null) {
                System.out.println("Contribuinte com maior imposto a pagar:");
                System.out.println(maiorImposto);
            } else {
                System.out.println("Nenhum contribuinte cadastrado.");
            }
        } else {
            System.out.println("Opção inválida.");
        }

        scanner.close();
    }

    public static void main(String[] args) {
       new ProgramaImposto();
    }
}
