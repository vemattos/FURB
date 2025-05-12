import java.text.DecimalFormat;

public class ex22 {
    public static void main(String[] args) {
        DecimalFormat df_2 = new DecimalFormat("0.0000");
        int anoContratacao = 1995;
        double salarioInicial = 2000.0;
        double aumentoPercentual = 0.015; 

        int anoAtual = 2023;
        double salarioAtual = salarioInicial;

        int ano = anoContratacao + 1;
        while (ano <= anoAtual) {
            aumentoPercentual *= 2; 
            salarioAtual += salarioAtual * aumentoPercentual;
            ano++;
        }

        System.out.println("Salário atual do funcionário em " + anoAtual + ": R$" + df_2.format(salarioAtual));
    }
}
