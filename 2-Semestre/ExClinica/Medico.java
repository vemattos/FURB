package ClinicaPedrita;

public class Medico extends Pessoa{

    private String CRM;
    private String especialidade;

    public Medico(String nome, String cRM, String especialidade) {
        super(nome);
        setCRM(cRM);
        setEspecialidade(especialidade);
    }
    
    public String getCRM() {
        return CRM;
    }
    public void setCRM(String cRM) {
        CRM = cRM;
    }
    public String getEspecialidade() {
        return especialidade;
    }
    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
    
    public String toString(){
        return super.toString() + "\nCRM: " + getCRM() +"\nEspecialidade: " + getEspecialidade();
    }
}
