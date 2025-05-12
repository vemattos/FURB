import java.util.Scanner;

public class ex14p2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int lucromenor10 = 0;
        int lucro10e20 = 0;
        int lucromaior20 = 0;
        int valortotalcompra = 0;
        int valortotalvenda = 0;
        int lucrototal = 0;

        for (int i = 1; i <= 20; i++) {
            System.out.println("Insira o nome da mercadoria " + i);
            String nomemercadoria = teclado.next();
            System.out.println("Insira o preço de compra da mercadoria");
            int precocompra = teclado.nextInt();
            System.out.println("Insira o preço de venda da mercadoria");
            int precovenda = teclado.nextInt();

            double lucro = (precovenda - precocompra) / precocompra * 100;
            if (lucro < 10) {
                lucromenor10++;
            }
            else if (lucro >= 10 && lucro <= 20) {
                lucro10e20++;
            }
            else if (lucro > 20) {
                lucromaior20++;
            }

            valortotalcompra += precocompra;
            valortotalvenda += precovenda;
            lucrototal += (precocompra - precovenda);
        }

        System.out.println("Mercadorias com lucro menor que 10%: " + lucromenor10);
        System.out.println("Mercadorias com lucro entre 10% e 20%: " + lucro10e20);
        System.out.println("Mercadorias com lucro maior que 20%: " + lucromaior20);
        System.out.println("O valor total de compra foi: " + valortotalcompra);
        System.out.println("O valor total de vendas foi: " + valortotalvenda);
        System.out.println("O lucro total foi: " + lucrototal);
        teclado.close();
    }
}
