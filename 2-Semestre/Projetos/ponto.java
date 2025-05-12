package Projetos;
public class ponto {
    //declarar atributos
    private double x;
    private double y;
    //definindo construtor
    public ponto(double x, double y){
        setX(x);
        setY(y);
    }
    //criando metodos acessores e modificadores(setters/getters)
    public void setX(double x){
        this.x = x;    
    }
    public double getX(){
        return this.x;
    }
    public void setY(double y){
        this.y = y;
    }
    public double getY(){
        return this.y;
    }
    private int verificarQuadrante(){
        if (getX() >= 0 && getY() >= 0)
        return 1;
        if (getX() < 0 && getY() >= 0)
        return 2;
        if (getX() < 0 && getY() < 0)
        return 3;
        return 4;
    }
    public String imprimir(){
        return "o ponto de coordenada ( " + getX() + " , " + getY() + " ) está localizado no quadrante " + verificarQuadrante();
    }
}