package Questão2;

import java.sql.Date;

public class ArtigoImportante extends Artigo{

    private int fatorImpacto;

    public ArtigoImportante(String titulo, String periodico, Date dataPublicacao, char qualis, int fatorImpacto) {
        super(titulo, periodico, dataPublicacao, qualis);
        this.fatorImpacto = fatorImpacto;
    }

    public int getFatorImpacto() {
        return fatorImpacto;
    }

    public void setFatorImpacto(int fatorImpacto) {
        this.fatorImpacto = fatorImpacto;
    }
    
    @Override
    public String exibirDados(){
        return super.exibirDados() + "\nFator de impacto: " + getFatorImpacto();
    }
    
}
