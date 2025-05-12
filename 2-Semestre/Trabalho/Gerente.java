package Trabalho;

public class Gerente extends Funcionario{

    private String senha;

    public Gerente(String nome, String cpf, String senha) {
        super(nome, cpf);
        this.senha = senha;
    }
    
}
