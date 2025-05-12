package Projetos;
public class ContaCorrente {
    
    //declarando atributos da classe
    private String nome;
    private double saldo;

    //defindo os construtores
    public ContaCorrente() {
        setNome("Sem nome");
        setSaldo(0);
    }

    public ContaCorrente(String nome) {
        setNome(nome);
        setSaldo(0);
    }

    public ContaCorrente(String nome, double saldo) {
        setNome(nome);
        setSaldo(saldo);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNome() {
        return nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void fazerDeposito(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Depósito com valor negativo");
        }
        //atualizando o saldo da conta corrente
        setSaldo(getSaldo() + valor);
    }

    public void realizarSaque(double valor){
        //verificando se o valor do saque é negativo
        if (valor <= 0){
            throw new IllegalArgumentException("Valor do saque negado ou zerado");
        }
        //verificando se ha saldo para realizar o saque no devido valor
        if (getSaldo() < valor) {
            throw new IllegalArgumentException("Saldo insuficiente");
        }
        //atualizando o saldo
        setSaldo (getSaldo() - valor);
    }
    public void realizartrasferencia(ContaCorrente outraConta, double valor){
        realizarSaque(valor);
        outraConta.fazerDeposito(valor);
    }
}