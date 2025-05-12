package ZZteste;
import java.util.ArrayList;

public class Vara{
    private String nomeVara;
    private ArrayList<Audiencia> audiencias = new ArrayList<Audiencia>();
    
    public Vara(String nomeVara, ArrayList<Audiencia> audiencias) {
        this.nomeVara = nomeVara;
        this.audiencias = audiencias;
    }
    public String getNomeVara() {
        return nomeVara;
    }
    public void setNomeVara(String nomeVara) {
        this.nomeVara = nomeVara;
    }
    public ArrayList<Audiencia> getAudiencias() {
        return audiencias;
    }
    public void setAudiencias(ArrayList<Audiencia> audiencias) {
        this.audiencias = audiencias;
    }
    
}
