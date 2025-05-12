import java.text.DecimalFormat;
import java.util.Scanner;
public class ex18 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df2 = new DecimalFormat("0.00");

        int c4 = 0;
        int pessoas4 = 0;
        int c5 = 0;
        int pessoas5 = 0;
        int c9 = 0;
        int pessoas9 = 0;
        int c12 = 0;
        int pessoas12 = 0;
        int totalcasas = 0;
        int totalpessoas = 0;

        while (true) {
            System.out.println("Insira o número do canal");
            int numerocanal = teclado.nextInt();
            if (numerocanal == 0) {
                break;
            }
            System.out.println("Insira quantas pessoas estão assistindo");
            int assistindo = teclado.nextInt();
            switch (numerocanal) {
                case 4:
                    {c4 = c4 + 1; //casas no canal 4
                        pessoas4 = pessoas4 + assistindo; //pessoas no canal 4
                        break;}
                case 5:
                    {c5++;
                        pessoas5 += assistindo;
                        break;}
                case 9:
                    {c9++;
                        pessoas9 += assistindo;
                        break;}
                case 12:
                    {c12++;
                        pessoas12 += assistindo;
                        break;}
                default:
                    break;
            }
        }//while
        totalcasas = c4 + c5 + c9 + c12;
        totalpessoas = pessoas4 + pessoas5 + pessoas9 + pessoas12;

        System.out.println("Total de casas: " + totalcasas);
        System.out.println("Total pessoas: " + totalpessoas);
        System.out.println("Total de casas no canal 4: " + c4);
        System.out.println("Número de pessoas no canal 4: " + pessoas4);
        double percentual = (float)((float)c4 / totalcasas) * 100;
        System.out.println("Percentual de audiência no canal 4 por residência " + df2.format(percentual) + "%");
        percentual = (float)((float)pessoas4 / totalpessoas) * 100;
        System.out.println("Percentual de audiência no canal 4 por público " + df2.format(percentual) + "%");
       
        System.out.println("Total de casas no canal 5: " + c5);
        System.out.println("Número de pessoas no canal 5: " + pessoas5);
        percentual = (float)((float)c5 / totalcasas) * 100;
        System.out.println("Percentual de audiência no canal 5 por residência: " + df2.format(percentual) + "%");
        percentual = (float)((float)pessoas5 / totalpessoas) * 100;
        System.out.println("Percentual de audiência no canal 5 por público: " + df2.format(percentual) + "%");

        System.out.println("Total de casas no canal 9: " + c9);
        System.out.println("Número de pessoas no canal 9: " + pessoas9);
        percentual = (float)((float)c9 / totalcasas) * 100;
        System.out.println("Percentual de audiência no canal 9 por residência: " + df2.format(percentual) + "%");
        percentual = (float)((float)pessoas9 / totalpessoas) * 100;
        System.out.println("Percentual de audiência no canal 9 por público: " + df2.format(percentual) + "%");

        System.out.println("Total de casas no canal 12: " + c12);
        System.out.println("Número de pessoas no canal 12: " + pessoas12);
        percentual = (float)((float)c12 / totalcasas) * 100;
        System.out.println("Percentual de audiência no canal 12 por residência: " + df2.format(percentual) + "%");
        percentual = (float)((float)pessoas12 / totalpessoas) * 100;
        System.out.println("Percentual de audiência no canal 12 por público: " + df2.format(percentual) + "%");

        teclado.close();
    }
}