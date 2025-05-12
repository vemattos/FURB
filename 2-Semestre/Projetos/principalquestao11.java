package Projetos;
public class principalquestao11 {
    public static void main(String[] args) {
        //instanciando um objeto do tipo lutador
        lutador umLutador = new lutador("Joao" , 75.3);
        

        //chamando metodo que define categoria
        System.out.println(umLutador.definirCategoria());

        //chamando metodo que ira imprimir nome e categoria do lutador
        System.out.println(umLutador.imprimir());
    }
}
