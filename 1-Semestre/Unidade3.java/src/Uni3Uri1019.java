import java.util.Scanner;

public class Uni3Uri1019 {
    public static void main(String[] args) {
     Scanner teclado = new Scanner(System.in);
     
     int segundos = teclado.nextInt();
     int horas = segundos / 3600;
     int minutos = (segundos % 3600) / 60;
     segundos = segundos % 60;

     System.out.println(horas + ":" +  minutos + ":" + segundos);
     teclado.close();
    }
}