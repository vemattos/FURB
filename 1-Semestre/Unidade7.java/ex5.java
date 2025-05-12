import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        String[] respostasRapaz = new String[5];
        String[] respostasMoca = new String[5];

        lerRespostas(respostasRapaz, "Rapaz");
        lerRespostas(respostasMoca, "Moça");

        int afinidade = calcularAfinidade(respostasRapaz, respostasMoca);
        exibirMensagemAfinidade(afinidade);
    }

    public static void lerRespostas(String[] respostas, String nome) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Respostas do " + nome + ":");
        for (int i = 0; i < respostas.length; i++) {
            System.out.print("Pergunta " + (i + 1) + ": ");
            respostas[i] = scanner.nextLine();
        }

        System.out.println();
        scanner.close();
    }

    public static int calcularAfinidade(String[] respostasRapaz, String[] respostasMoca) {
        int afinidade = 0;

        for (int i = 0; i < respostasRapaz.length; i++) {
            String respostaRapaz = respostasRapaz[i];
            String respostaMoca = respostasMoca[i];

            if (respostaRapaz.equals(respostaMoca)) {
                afinidade += 3;
            } else if (respostaRapaz.equals("IND") || respostaMoca.equals("IND")) {
                afinidade += 1;
            } else if ((respostaRapaz.equals("SIM") && respostaMoca.equals("NÃO")) ||
                    (respostaRapaz.equals("NÃO") && respostaMoca.equals("SIM"))) {
                afinidade -= 2;
            }
        }

        return afinidade;
    }

    public static void exibirMensagemAfinidade(int afinidade) {
        System.out.println("Afinidade: " + afinidade);

        if (afinidade == 15) {
            System.out.println("Casem!");
        } else if (afinidade >= 10 && afinidade <= 14) {
            System.out.println("Vocês têm muita coisa em comum!");
        } else if (afinidade >= 5 && afinidade <= 9) {
            System.out.println("Talvez não dê certo :(");
        } else if (afinidade >= 0 && afinidade <= 4) {
            System.out.println("Vale um encontro.");
        } else if (afinidade >= -9 && afinidade <= -1) {
            System.out.println("Melhor não perder tempo");
        } else if (afinidade == -10) {
            System.out.println("Vocês se odeiam!");
        }
    }
}
