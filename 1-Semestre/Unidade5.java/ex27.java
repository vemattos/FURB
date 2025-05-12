import java.util.Scanner;
public class ex27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int maiorProducao = 0;
        int diaMaiorProducao = 0;
        int totalManha = 0;
        int totalTarde = 0;
        int producaoTotal = 0;
        
        while (true) {
            System.out.println("Dia do mês de abril (1 a 30): ");
            int dia = scanner.nextInt();
            
            if (dia < 1 || dia > 30) {
                System.out.println("Dia inválido");
                continue;
            }
            
            System.out.println("Total de peças produzidas no turno da manhã: ");
            int manha = scanner.nextInt();
            
            System.out.println("Total de peças produzidas no turno da tarde: ");
            int tarde = scanner.nextInt();
            
            int producaoDia = manha + tarde;
            int valorRecebido = 0;
            
            if (dia <= 15) {
                if (producaoDia > 100 && manha >= 30 && tarde >= 30) {
                    valorRecebido = (int) (producaoDia * 0.80);
                } else {
                    valorRecebido = (int) (producaoDia * 0.50);
                }
            } else {
                valorRecebido = (int) (manha * 0.40 + tarde * 0.30);
            }
            
            if (producaoDia > maiorProducao) {
                maiorProducao = producaoDia;
                diaMaiorProducao = dia;
            }
            
            totalManha += manha;
            totalTarde += tarde;
            producaoTotal += producaoDia;
            
            System.out.println("Valor recebido: R$" + valorRecebido);
            
            System.out.println("Novo funcionário (1.sim 2.não)?");
            int opcao = scanner.nextInt();
            
            if (opcao != 1) {
                break;
            }
        }
        
        System.out.println("Dia com maior produção: " + diaMaiorProducao);
        System.out.println("Período em que mais produz: " + (totalManha > totalTarde ? "manhã" : "tarde") + " - Quantidade produzida: " + (totalManha > totalTarde ? totalManha : totalTarde));
        
        scanner.close();
    }
}
