package Projetos;
import java.util.Arrays;

public class Funcionarios {
    Funcionario[] funcionario = new Funcionario[5];
    int indice = 0;

    public Funcionario getFuncionario(int ind) {
        return funcionario[ind];
    }

    public void incluiFuncionario(Funcionario f) {
        this.funcionario[indice] = f;
        indice++;
    }

    @Override
    public String toString() {
        return "Funcionarios [funcionario=" + Arrays.toString(funcionario) + ", indice=" + indice + "]";
    }
    
     public Funcionario pagaMais() {
        double maiorSalario = 0;
        double salarioAtual = 0;
        int indiceMaiorSalario = 0;
        for (int i = 0; i < indice; i++) {
            salarioAtual = funcionario[i].getSalario();
            if (salarioAtual > maiorSalario) {
                maiorSalario = salarioAtual;
                indiceMaiorSalario = i;
            }
            
        }
        return funcionario[indiceMaiorSalario];
    }
    
}
