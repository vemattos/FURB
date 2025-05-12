import java.util.Scanner;

public class Uni4Ex14 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Insira o dia");
        int dia = teclado.nextInt();
        System.out.println("Insira o mês");
        int mes = teclado.nextInt();
        System.out.println("Insira o ano");
        int ano = teclado.nextInt();

        if (dia > 0 && dia < 32 && mes > 0 && mes < 13 && ano > 0 && mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12 || mes != 2 && dia < 31 || mes == 2 && dia < 29){
            System.out.println("Válida");     
        }
        
        else if (dia == 29 && ano % 4 == 0 && !(ano % 100 == 0 && ano % 400 != 0)){
            System.out.println("Não válida");
    }
    else {
        System.out.println("Não válida");
    }
    teclado.close();
 
}
}
