import java.util.Scanner;

public class vinicius_01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Insira o gênero");
        String genero = teclado.nextLine();
        System.out.println("Insira o mês de nascimento");
        int mesNascimento = teclado.nextInt();

        if (genero == "") {
            System.out.println("Dados incorretos");
        }
        else if (mesNascimento > 7) {
            System.out.println("Nasceu no segundo semestre");
        }
        else {
            System.out.println("Gênero: " + genero + " Mês: " + mesNascimento);
            System.out.println("Nasceu no primeiro semestre");
        }  
        teclado.close(); 
    }
}