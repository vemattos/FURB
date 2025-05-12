import java.util.Scanner;

public class ex32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o dia da semana do primeiro dia do mês (1=Domingo, 2=Segunda, ..., 7=Sábado): ");
        int primeiroDiaSemana = scanner.nextInt();
        
        System.out.print("Digite o número de dias do mês: ");
        int numeroDias = scanner.nextInt();
        
        System.out.println("D\tS\tT\tQ\tQ\tS\tS");
        
        int dia = 1;
        
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 7; j++) {
                if (i == 1 && j < primeiroDiaSemana) {
                    System.out.print("\t");
                } else if (dia <= numeroDias) {
                    System.out.print(dia + "\t");
                    dia++;
                }
            }
            
            System.out.println();
            
            if (dia > numeroDias) {
                break;
            }
        }
        
        scanner.close();
    }
}