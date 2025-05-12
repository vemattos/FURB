package Projetos;
public class lutador {
    //definindo e declarando os atributos da classe
    private String nome;
    private double peso;

    //definindo os metodos acessores e modificadores dos atributos
    public lutador(){

    }
    public lutador(String nome, double peso){

        setNome(nome);
        setPeso(peso);
    }

    //setNome
    public void setNome(String nome){
        this.nome = nome;
    }
    //getNome
    public String getNome(){
        return this.nome;
    }
    //setPeso
    public void setPeso(double peso){
        this.peso = peso;
    }
    //getPeso
    public Double getPeso(){
        return this.peso;
    }
    //metodo para definir a categoria do lutador
    public String definirCategoria(){
        String categoria = "";
        if(getPeso() <= 54){
            categoria = "Pluma";
        } else {
            if(getPeso() <= 60){
                categoria = "Leve";
            } else {
                if (getPeso() <= 70 ) {
                    categoria = "Meio-leve";
                } else {
                    categoria = "Pesado";
                }
            }
        }  
        return categoria;
    }

    //metodo para imprimir o nome e categoria do lutador
    public String imprimir(){
        return "Lutador: " + getNome() + " compete na categoria: " + definirCategoria();  
    }
}