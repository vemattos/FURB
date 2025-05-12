package ClinicaPedrita;

public class Ouro extends Plano{

    public Ouro(String nome, int ano, int qtDependentes) {
        super(nome, ano, qtDependentes); 
    }
    //metodo para exibir as informações da classe
    public String toString(){
        return "Tipo do plano: Ouro \n" + super.toString();
    }
}
