package ClinicaPedrita;

public class Consulta {
    private int codigo;
    private Paciente umPaciente;
    private Medico umMedico;
    private int dia;
    private double valor = 250.00;
    
    public Consulta(int codigo, Paciente umPaciente, Medico umMedico, int dia) {
        setCodigo(codigo);
        setUmPaciente(umPaciente);
        setUmMedico(umMedico);
        setDia(dia);
        setValor(250.00);
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Paciente getUmPaciente() {
        return umPaciente;
    }

    public void setUmPaciente(Paciente umPaciente) {
        this.umPaciente = umPaciente;
    }

    public Medico getUmMedico() {
        return umMedico;
    }

    public void setUmMedico(Medico umMedico) {
        this.umMedico = umMedico;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double calcularConsulta(){

    }

    
    public String toString(){
        return "Consulta de nr: " + getCodigo() + "\nPaciente: " + getUmPaciente().getNome() + "\nMédico: " +getUmMedico().getNome() + "\nFeito no dia: " + getDia() + "\nValor: R$ " + getValor();
    }
}
