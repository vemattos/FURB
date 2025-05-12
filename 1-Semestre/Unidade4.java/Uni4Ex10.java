import java.util.Scanner;

public class Uni4Ex10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe a idade do Marquinhos");
        int idadeM = teclado.nextInt();
        System.out.println("Informe a idade do Zezinho");
        int idadeZ = teclado.nextInt();
        System.out.println("Informe a idade da Luluzinha");
        int idadeL = teclado.nextInt();

        if (idadeM < idadeZ && idadeM < idadeL) {
            System.out.println("Marquinhos é o caçula");
          }else{
            if (idadeZ < idadeM && idadeZ < idadeL) {
                System.out.println("Zezinho é o caçula");
            }else{
                if (idadeL < idadeM && idadeL < idadeZ) {
                    System.out.println("Luluzinha é a caçula");
                    
                }
                
            }

            
            
        }

       teclado.close();
    }
}
