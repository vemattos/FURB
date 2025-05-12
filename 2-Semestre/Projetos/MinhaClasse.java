package Projetos;
public class MinhaClasse {
    private int var1;
    private int var2;

public int getVar1() {
       return var1;
   }

    public void meuMetodoA(){
        var1 = var1 + 20;
    }
    public void meuMetodoB(){
        String var2;
        var2 = "teste";
        do {
            int var3 = 10;
        } while (false);
        System.out.println(var2);
    }

    public MinhaClasse(int var1) {
        this.var1 = var1;
    }

    public void setVar1(int var1) {
        this.var1 = var1;
    }

    public int getVar2() {
        return var2;
    }

    public void setVar2(int var2) {
        this.var2 = var2;
    }

    
    public String toString() {
        return "MinhaClasse [var1=" + var1 + ", var2=" + var2 + "]";
    }
 
    
}
