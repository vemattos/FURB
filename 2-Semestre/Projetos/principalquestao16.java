package Projetos;
public class principalquestao16 {
    public static void main(String[] args) {
        //criando um objeto conta corrente
        ContaCorrente cc = new ContaCorrente("João", 950);
        System.out.println("Nome: " + cc.getNome() + " saldo: " + cc.getSaldo());

        cc.fazerDeposito(1000);
        System.out.println("Nome: " + cc.getNome() + " saldo: " + cc.getSaldo());

        cc.realizarSaque(900);
        System.out.println(cc.getSaldo());

        ContaCorrente ccDestino = new ContaCorrente("Maria", 7000);
        cc.realizartrasferencia(ccDestino, 600);
        System.out.println("Saldo cc Maria: " + ccDestino.getSaldo());
        System.out.println("Saldo cc Joao: " + cc.getSaldo());
    }
}