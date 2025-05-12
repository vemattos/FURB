import java.util.Scanner;

public class ex {
   public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    System.out.println("Informe o sexo (M/F)");
    String sexo = teclado.next().toUpperCase();

    switch (sexo.charAt(0)) {
        case 'M': System.out.println("Masculino");
            break;
        case 'F': System.out.println("Feminino");
             break;
        default: System.out.println("Indefinido");
            break;
    }
teclado.close();
   }
}
