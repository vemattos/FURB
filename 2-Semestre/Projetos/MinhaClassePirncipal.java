package Projetos;
public class MinhaClassePirncipal {
    public static void main(String[] args) {
        MinhaClasse x = new MinhaClasse(20); //criar objeto
        MinhaClasse y = new MinhaClasse(10);
       MinhaClasse z; 
        System.out.println(x.getVar1());
        x.meuMetodoA();
        System.out.println(x.getVar1());
        System.out.println(x.getVar2());
        System.out.println(x);
       
    }
}
