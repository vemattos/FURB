import java.util.Scanner;

public class Uni4Ex8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe a letra = ");
     char letra = teclado.next().charAt(0);
    
     if ((letra == 'a'||letra == 'e' ||letra == 'i' || letra == 'o' || letra == 'u')) {
        System.out.println("É vogal");
     }else{
        System.out.println("Não é vogal");
     }
     teclado.close();
    }
}
