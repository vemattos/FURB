package Viagens;

public abstract class Embarcacao {

    //declarando atributos da classe

    private int registroCapitania;
    private int quantidadePessoas;

    //definindo construtor para inicializar os atributos da classe

    public Embarcacao(int registroCapitania, int quantidadePessoas) {
        setRegistroCapitania(registroCapitania);
        setQuantidadePessoas(quantidadePessoas);
    }

    //metodos acessores e modificadores

    public int getRegistroCapitania() {
        return registroCapitania;
    }
    public void setRegistroCapitania(int registroCapitania) {
        this.registroCapitania = registroCapitania;
    }
    public int getQuantidadePessoas() {
        return quantidadePessoas;
    }
    public void setQuantidadePessoas(int quantidadePessoas) {
        this.quantidadePessoas = quantidadePessoas;
    }

    //metodo para mostrar as informacoes
    
    public String mostrar(){
        return "Registro da capitania: " + getRegistroCapitania() + "\n Quantidade de pessoas: " + getQuantidadePessoas();
    }
    
}
