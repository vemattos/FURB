package Viagens;

import java.util.ArrayList;

public class Navio extends Embarcacao{ //heranca
    
    //delcarando os atributos da classe
    private String nome;
    private ArrayList<Botes> botes; // agregação passo 1

    //definindo construtor para inicializar os atributos da classe
 
    public Navio(int registroCapitania, int quantidadePessoas, String nome) {
        //passando parametros para a classe-pai
        //hierarquia de construtor
        super(registroCapitania, quantidadePessoas);
        setNome(nome);
        botes = new ArrayList<Botes>(); //agregação passo 2
    }

    //metodos acessores e modificadores//metodos acessores e modificadores

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    //metodo para adicionar botes ao navio agregação passo 3
    public void adicionarBotes(Botes umBote){
        botes.add(umBote);
    }

    //metodo para verificar a seguranca do navio em termos de botes/qtd pessoas
    private boolean verificarSeguranca(){
        //varrer o arraylist de botes e totalizar a qtd de pessoas
        int total = 0;
        for (Botes umBote : botes) {
            total += umBote.getQuantidadePessoas();
        }
        //comparar se a quantidade pessoas nos botes eh maior ou igual a quantidade de pessoas no navio
        if (total >= getQuantidadePessoas()) {
            return true;
        } else {
            return false;
        }
    }

    //metodos para mostrar/exibir as informações da classe navio, da classe botes e se o navio é seguro ou não
    @Override //polimorfismo
    public String mostrar(){
        //informações sobre o navio
        String str = super.mostrar() + "\nNome: " + getNome() + "\n\n";
        //varrendo o arraylist de botes
        for (Botes umBote : botes) {
            str += umBote.mostrar() + "\n\n";
        }
        if (verificarSeguranca()) {
            return str += "Navio atende as normas de segurança";
        } else {
            return str += "Navio não atende as normas de segurança, quantidade de pessoas suportadas: " + getQuantidadePessoas();
        }
    }
}
