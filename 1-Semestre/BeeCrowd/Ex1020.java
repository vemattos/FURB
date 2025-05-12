import java.util.Scanner;

public class Ex1020 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    int days = teclado.nextInt();

    int anos = days / 365;
    int qtdias = days % 365;

    int meses = qtdias / 30;
    int qtdias2 = qtdias % 30;

    int dias2 = qtdias2;

    System.out.println(anos + " anos(s)");
    System.out.println(meses + " mês(s)");
    System.out.println(dias2 + " dias(s)");
    teclado.close();




  
   


    }
    
}