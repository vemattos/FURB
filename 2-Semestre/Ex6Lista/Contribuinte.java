package Ex6Lista;

    public class Contribuinte {
    private String nome;
    private String cpf;
    private double rendaAnual;
    private double impostoAPagar;

    public Contribuinte(String nome, String cpf, double rendaAnual) {
        setNome(nome);
        setCpf(cpf);
        setRendaAnual(rendaAnual);
        calcularImposto();
    }

    public double calcularImposto() {
        double impostoAPagar;
        if (rendaAnual <= 4000.0) {
            impostoAPagar = 0.0;
        } else if (rendaAnual <= 9000.0) {
            impostoAPagar = (rendaAnual - 4000.0) * 0.058;
        } else if (rendaAnual <= 25000.0) {
            impostoAPagar = (9000.0 - 4000.0) * 0.058 + (rendaAnual - 9000.0) * 0.15;
        } else if (rendaAnual <= 35000.0) {
            impostoAPagar = (9000.0 - 4000.0) * 0.058 + (25000.0 - 9000.0) * 0.15 + (rendaAnual - 25000.0) * 0.275;
        } else {
            impostoAPagar = (9000.0 - 4000.0) * 0.058 + (25000.0 - 9000.0) * 0.15 + (35000.0 - 25000.0) * 0.275 + (rendaAnual - 35000.0) * 0.30;
        }
        return impostoAPagar;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getRendaAnual() {
        return rendaAnual;
    }

    public void setRendaAnual(double rendaAnual) {
        this.rendaAnual = rendaAnual;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\nCPF: " + cpf + "\nRenda Anual: R$" + rendaAnual + "\nImposto a Pagar: R$" + impostoAPagar;
    }
}
    
