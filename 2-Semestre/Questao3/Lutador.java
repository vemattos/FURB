package Questao3;

public class Lutador extends Atleta{ 

    //definindo construtor para inicializar os atributos da classe pai
    public Lutador(String nome, double peso, int idade){
        super(nome, peso, idade);
    }
    //sobrescrevendo o metodo definir categoria
    public String definirCategoria(){
        if (getPeso() < 54) {
            return "Pluma";
        } else {
            if (getPeso() < 60) {
                return "Leve";
            } else {
                if (getPeso() < 75) {
                    return "Meio-leve";
                }
            }
        }
        return "Pesado";
    }
}
