import java.util.Scanner;

public class Uni4Ex6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

    String letra = teclado.next().toUpperCase();

    switch (letra) {
        case "M" : {
            System.out.println("Masculino");
            break;
        }
        case "F" : {
            System.out.println("Feminino");
            break;
        } 
        case "I" : {
            System.out.println("Não informado");
            break;
        }
        default : System.out.println("Entrada incorreta");
 }
 teclado.close();
}
}
