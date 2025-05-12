package Projetos;
public class PrincipalApollice {

    public static String menorIdade(Apolice vetor[]) {

        int menorIdade = Integer.MAX_VALUE;
        String retorno = "";
        // varrendo o vetor
        for (int i = 0; i < vetor.length; i++) {
            // verificando se a idade do cliente é menor do que a menor idade encontrada
            if (vetor[i].getIdade() < menorIdade) {
                menorIdade = vetor[i].getIdade();
                // armazenando informacoes da menor idade
                retorno = vetor[i].imprimir();
            } else {
                if (vetor[i].getIdade() == menorIdade) {
                    retorno = retorno + "\n" + vetor[i].imprimir();
                }

            }
        }
        return retorno;
    }

    public static void main(String[] args) {
        // item a) criando objeto e atribuindo valores
        Apolice umaApolice = new Apolice("João", 27, 900);

        // item b) Executar o método imprimir() e analisar o que será impresso na tela
        System.out.println("Item B:");
        System.out.println(umaApolice.imprimir());

        // item c) Executar o método calcularPremio()
        System.out.println("\nItem D:");
        umaApolice.calcularPremio();

        // item d) Executar o método imprimir() novamente e analisar o que será exibido
        // na tela
        System.out.println(umaApolice.imprimir());

        // item e) Executar o método oferecerDesconto() passando como parâmetro a cidade
        // de Blumenau
        System.out.println("\nitem E:");
        umaApolice.oferecerDesconto("Blumenau");

        // item f) Executar novamente o método imprimir() e analisar o que será mostrado
        // na tela
        System.out.println("\nItem F:");
        System.out.println(umaApolice.imprimir());

        Apolice vetor[] = new Apolice[5];
        vetor[0] = new Apolice("João", 27, 900.0);
        vetor[1] = new Apolice("Maria", 18, 2000.0);
        vetor[2] = new Apolice("Marta", 39, 1600.0);
        vetor[3] = new Apolice("Jose", 24, 2300.0);
        vetor[4] = new Apolice("Tiago", 18, 1700.0);

        // descobrindo clientes com a menor idade
    }
}

