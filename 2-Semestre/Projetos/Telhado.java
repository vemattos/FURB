package Projetos;
//Vinicius Mattos
public class Telhado {

    private double altura;
    private double largura;

    public Telhado(double altura, double largura) {
        this.altura = altura;
        this.largura = largura;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public double getLargura() {
        return largura;
    }
    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double calcularVazao(){
        double vazao = 0.067 * getAltura() * (getLargura()/2);
        return vazao;
    }

    private int diametro;
    public int cachas(){
        if (calcularVazao() <= 7.1) {
            diametro = 100;
        } else if (calcularVazao() <= 22.8) {
            diametro = 150;
        } else if (calcularVazao() <= 50.2) {
            diametro = 200;
        } else if (calcularVazao() <= 90.8) {
            diametro = 250;
        } else if (calcularVazao() <= 154.3) {
            diametro = 300;
        }
        return diametro;
    }

    double area;
    public double areaTelhado(){
       area = getAltura() * getLargura();
       return area;
    }

    double maior = 0;
    public double maiorTelhado(Telhado telhado[]){
        for (int i = 0; i < telhado.length; i++) {
            if (areaTelhado() > maior) {
                maior = areaTelhado();
            }
        }
        return maior;
    }
}

