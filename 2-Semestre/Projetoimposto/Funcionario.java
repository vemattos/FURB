import java.text.DecimalFormat;
public class Funcionario {
    DecimalFormat df_2 = new DecimalFormat("0.00");
    private String nome;
    private double salario;
    private double impostoCalculado;

    public Funcionario(String nome, double salario) {
        setNome(nome);
        setSalario(salario);
        impostoCalculado = this.calcularIrpf();
    }
    /**
     * @return String return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return double return the salario
     */
    public double getSalario() {
        return salario;
    }

    /**
     * @param salario the salario to set
     */
    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public double getImpostoCalculado() {
        return impostoCalculado;
    }
    public double calcularIrpf(){
        
        double faixa1 = 0;
        double faixa2 = 0;
        double faixa3 = 0;
        double faixa4 = 0;
        double faixa5 = 0;
        double salario = getSalario();

         double limFaixa1 = 1903.98;
         double limFaixa2 = 2826.65;
         double limFaixa3 = 3751.05;
         double limFaixa4 = 4664.68;

        if (salario <= limFaixa1) {
            faixa1 = 0;
        } else if (salario <= limFaixa2) {
            faixa2 = (salario - limFaixa1) * 0.075;
        } else if (salario <= limFaixa3) {
            faixa2 = (limFaixa2 - limFaixa1) * 0.075;
            faixa3 = (salario - limFaixa2) * 0.15;
        } else if (salario <= limFaixa4) {
            faixa2 = (limFaixa2 - limFaixa1) * 0.075;
            faixa3 = (limFaixa3 - limFaixa2) * 0.15;
            faixa4 = (salario - limFaixa3) * 0.225;
        } else {
            faixa2 = (limFaixa2 - limFaixa1) * 0.075;
            faixa3 = (limFaixa3 - limFaixa2) * 0.15;
            faixa4 = (limFaixa4 - limFaixa3) * 0.225;
            faixa5 = (salario - limFaixa4) * 0.275;
        }

        impostoCalculado = faixa1 + faixa2 + faixa3 + faixa4 + faixa5;
        return impostoCalculado;
    }
    @Override
    public String toString() {
        return "\nFuncionario [nome=" + nome + ", salario=" + salario + ", impostoCalculado = R$ " + df_2.format(calcularIrpf()) + "]";
    }

 
}
