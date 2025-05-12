import java.util.Arrays;
import java.text.DecimalFormat;

public class Funcionarios {
    DecimalFormat df_2 = new DecimalFormat();
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

    String listaFuncionarios(){
        String lista = "";
          for (int i = 0; i < indice; i++) {
           lista = lista + "\n" + funcionario[i].getNome() + ", Salário: R$" + funcionario[i].getSalario() + ", Imposto calculado: R$ " + df_2.format(funcionario[i].getImpostoCalculado());   
        }

        return lista;
    }
    
}
