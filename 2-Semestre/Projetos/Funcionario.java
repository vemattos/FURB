package Projetos;
public class Funcionario {
    private String nome;
    private double salario;
    private double impostoCalculado;
    public Funcionario(String nome, double salario) {
        setNome(nome);
        setSalario(salario);
        impostoCalculado = 0;
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


    public double calcularIrpf(){
        
        double faixa1 = 0;
        double faixa2 = 0;
        double faixa3 = 0;
        double faixa4 = 0;
        double faixa5 = 0;
        
        double salario = getSalario();

        if (salario <= 1903.98) {
            faixa1 = 0;
        } else if (salario <= 2826.65) {
            faixa2 = (salario - 1903.98) * 0.075;
        } else if (salario <= 3751.05) {
            faixa2 = (2826.65 - 1903.98) * 0.075;
            faixa3 = (salario - 2826.65) * 0.15;
        } else if (salario <= 4664.68) {
            faixa2 = (2826.65 - 1903.98) * 0.075;
            faixa3 = (3751.05 - 2826.65) * 0.15;
            faixa4 = (salario - 3751.05) * 0.225;
        } else {
            faixa2 = (2826.65 - 1903.98) * 0.075;
            faixa3 = (3751.05 - 2826.65) * 0.15;
            faixa4 = (4664.68 - 3751.05) * 0.225;
            faixa5 = (salario - 4664.68) * 0.275;
        }

        impostoCalculado = faixa1 + faixa2 + faixa3 + faixa4 + faixa5;
        return impostoCalculado;
    }
    @Override
    public String toString() {
        return "\nFuncionario [nome=" + nome + ", salario=" + salario + ", impostoCalculado=" + Double.toString(calcularIrpf()) + "]";
    }

    
    
}

