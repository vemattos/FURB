import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni4Ex1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df_2 = new DecimalFormat("0.00");

        System.out.print("Entre com as horas trabalhadas no mês: ");
        double HorasMes = teclado.nextDouble();
        System.out.print("Entre com o valor pago por hora: ");
        double HorasValor = teclado.nextDouble();
        
        double SalarioTotal = HorasMes * HorasValor;
        if (HorasMes > 100){
        }
             double SalarioExtra = (HorasMes - 160) * (HorasValor / 2);
             SalarioTotal = SalarioTotal + SalarioExtra;

             System.out.println("O salário total é: " + df_2.format(SalarioTotal));
             teclado.close();

    }
}
