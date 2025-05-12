package ClinicaPedrita;

public class Prata extends Plano{

    public Prata(String nome, int ano, int qtDependentes) {
        super(nome, ano, qtDependentes); 
    }
    
    //metodo para exibir as informações da classe
    public String toString(){
        return "Tipo do plano: Prata \n" + super.toString();
    }
}
