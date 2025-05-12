package Viagens;

public class Botes extends Embarcacao{
    
    //declarando atributos de classe

    private boolean inflavel;

    //definindo construtor para inicializar atributos de classe

    public Botes(int registroCapitania, int quantidadePessoas, boolean inflavel) {
        super(registroCapitania, quantidadePessoas);
        setInflavel(inflavel);
    }

    //metodos acessores e modificadores

    public boolean isInflavel() {
        return inflavel;
    }

    public void setInflavel(boolean inflavel) {
        this.inflavel = inflavel;
    }

    //metodo para exibir as informacoes
    //sobrescrita do metodo mostrar(polimorfismo)
    @Override
    public String mostrar(){
        if (isInflavel()) {
            return super.mostrar() + "\nInflável";
        } else {
            return super.mostrar() + "\nNão inflável";
        }
    }
    
}
