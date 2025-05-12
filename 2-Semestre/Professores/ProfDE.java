package Professores;

public class ProfDE extends Professor {
    
 private double salario;
// definindo o construtor para inicializar os atributos da classe pai e da filha
public ProfDE( String nome, String matricula, int idade, double salario) {
    super(nome, matricula, idade); // passando os valores dos atributos da classe pai
    setSalario(salario);
}

public double getSalario() {
    return salario;
}

public void setSalario(double salariofix) {
    this.salario = salariofix;
}

public String toString(){
    return "Nome do professor:" + getNome() + "\n" +
    "Idade:" + getIdade() + "\n";
      
    }
}

