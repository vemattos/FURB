import java.util.Scanner;

public class Uni4Ex21 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe a massa");
        double massa = teclado.nextDouble();
        System.out.println("Informe a altura");
        double altura = teclado.nextDouble();
        double imc = massa/Math.pow(altura, 2);
        System.out.println("IMC = " + imc);
        
        if (imc < 18.5) {
            System.out.println("Magreza");
        }
        else if (imc <=18.5 || imc <= 24.9) {
            System.out.println("Saudável");
        }
        else if (imc <= 25.0 || imc <= 29.9) {
            System.out.println("Sobrepeso");
        }
        else if (imc <= 30.0 || imc <= 34.9) {
            System.out.println("Obesidade grau 1");
        }
        else if (imc <= 35.0 || imc <= 39.9) {
            System.out.println("Obesidade grau 2 (severa)");
        }
        else if (imc >= 40.0) {
            System.out.println("Obesidade grau 3 (mórbida)");
        }
        teclado.close();
    }
}
