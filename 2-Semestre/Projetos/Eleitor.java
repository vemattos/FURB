package Projetos;
public class Eleitor {
private String nome;
private int idade;

public Eleitor (String nome, int idade){
    setNome(nome);
    setIdade(idade);
}   
  //setNome
  public void setNome(String nome){
    this.nome = nome;
}
//getNome
public String getNome(){
    return this.nome;
}
//setIdade
public void setIdade(int idade){
    this.idade = idade;
}
//getIdade
public int getIdade(){
    return this.idade;
}

public String verificar (){
if(getIdade()< 16){
    return "Eleitor não pode votar";

}
else if(idade >= 16 && idade <=65){
return " deve votar";

}

else{
  return "Voto facultativo";
}

}

public String imprimir(){
    return "O eleitor: " + getNome() + verificar();
}


}
