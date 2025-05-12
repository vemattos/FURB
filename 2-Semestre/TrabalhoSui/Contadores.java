package Trabalho;
public class Contadores {

    private int codigoMunicipio;
    private int totalHomens;
    private int totalMulheres;
    private int totalSolteiro;
    private int totalCasado;
    private int totalViuvo;
    private int totalSeparadoJudicialmente;
    private int totalUniaoConsensual;
    private int totalIgnorado;

    public String toString(){
        return "cod: " + codigoMunicipio + "\tHomens: " + totalHomens + "\tMulheres: " + totalMulheres + "\tsolteiros: " + totalSolteiro + "\tcasados: " + totalCasado + 
        "\tviuvo: " + totalViuvo + "\tsep: " + totalSeparadoJudicialmente + "\tcons: " + totalUniaoConsensual + "\tignoradp: " + totalIgnorado
        + "\ttotal = " + (totalHomens+totalMulheres); 
    }
    public int getCodigoMunicipio() {
        return codigoMunicipio;
    }
    public void setCodigoMunicipio(int codigoMunicipio) {
        this.codigoMunicipio = codigoMunicipio;
    }
    public int getTotalHomens() {
        return totalHomens;
    }
    public void setTotalHomens(int totalHomens) {
        this.totalHomens += totalHomens;
    }
    public int getTotalMulheres() {
        return totalMulheres;
    }
    public void setTotalMulheres(int totalMulheres) {
        this.totalMulheres += totalMulheres;
    }
    public int getTotalSolteiro() {
        return totalSolteiro;
    }
    public void setTotalSolteiro(int totalSolteiro) {
        this.totalSolteiro += totalSolteiro;
    }
    public int getTotalCasado() {
        return totalCasado;
    }
    public void setTotalCasado(int totalCasado) {
        this.totalCasado += totalCasado;
    }
    public int getTotalViuvo() {
        return totalViuvo;
    }
    public void setTotalViuvo(int totalViuvo) {
        this.totalViuvo += totalViuvo;
    }
    public int getTotalSeparadoJudicialmente() {
        return totalSeparadoJudicialmente;
    }
    public void setTotalSeparadoJudicialmente(int totalSeparadoJudicialmente) {
        this.totalSeparadoJudicialmente += totalSeparadoJudicialmente;
    }
    public int getTotalUniaoConsensual() {
        return totalUniaoConsensual;
    }
    public void setTotalUniaoConsensual(int totalUniaoConsensual) {
        this.totalUniaoConsensual += totalUniaoConsensual;
    }
    public int getTotalIgnorado() {
        return totalIgnorado;
    }
    public void setTotalIgnorado(int totalIgnorado) {
        this.totalIgnorado += totalIgnorado;
    }

}
