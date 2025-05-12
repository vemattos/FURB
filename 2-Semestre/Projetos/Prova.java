package Projetos;
public class Prova {
    private Concorrente umConcorrente;
    private double nota;

    public Prova(Concorrente umConcorrente, double nota){
        setConcorrente(umConcorrente);
        setNota(nota);
    }

    public Concorrente getUmConcorrente() {
        return umConcorrente;
    }

    public void setConcorrente(Concorrente umConcorrente) {
        this.umConcorrente = umConcorrente;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
    //imprimir as info dos atributos de classe
    public String imprimir(){
        //pegando info que estão no objeto concorrente
        return umConcorrente.getNome() + " - " + umConcorrente.getArea() + " - " + umConcorrente.getInscricao() + " - " + getNota();
    }
    
}
