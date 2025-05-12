package Questao3;

public class Jogador extends Atleta{
    public Jogador(String nome, double peso, int idade){
        super(nome, peso, idade);
    }
    //polimorfat (sobrescrita metodo da categoria)
    @Override
    public String definirCategoria(){
        if (getIdade() < 16) {
            return "Infantil";
        } else {
            if (getIdade() < 18) {
                return "Juvenil";
            }
        }
        return "Adulto";
    }
}
