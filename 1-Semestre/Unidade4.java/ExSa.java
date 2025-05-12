import java.util.Scanner;

public class ExSa {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Insira o nome");
        String nome = teclado.nextLine();
        System.out.println("Insira o ano de nascimento");
        int ano = teclado.nextInt();

        int idade = 2023 - ano;
        if (1900 > ano) {
            System.out.println("Dados inválidos");
        }
        else if (nome == "") {
            System.out.println("Dados inválidos");
        } else {
            System.out.println("Nome: " + nome);
            System.out.println("Idade: " + idade);
        }
        teclado.close();
    }
}
