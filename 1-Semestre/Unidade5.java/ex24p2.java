import java.util.Scanner;

public class ex24p2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Insira o limite diário em kg:");
        int limitediario = teclado.nextInt();

        double pesototal =  0;
        boolean continuar = true;
        boolean excedeu = false;

        while (continuar && !excedeu) {
            System.out.println("Insira o peso do peixe em gramas: ");
            double pesopeixe = teclado.nextInt() / 1000;
            pesototal += pesopeixe;

            if (pesototal >= limitediario) {
                excedeu = true;
                System.out.println("Limite diário excedido");
            } else {
                System.out.println("Peso total da pesca até agora: " + pesototal);
                System.out.println("Deseja informar o peso de mais um peixe? (s/n)");
                String resposta = teclado.next();
                if (resposta.equalsIgnoreCase("s")) {
                    continuar = true;
                } else {
                    resposta.equalsIgnoreCase("n");
                    break;
            }
                
        }
    }
    }
}


//fazer um programa que leia o limite diario em quilogramas
//leia o peso de cada peixe pego em gramas
//peso total da pesca
//parar quando atingir o limite diario