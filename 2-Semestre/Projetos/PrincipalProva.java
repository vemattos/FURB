package Projetos;

public class PrincipalProva {
    public static void main(String[] args) {
        Concorrente umConcorrente = new Concorrente("Joao", "dev", "929");
        
        Prova umProva = new Prova(umConcorrente, 9.71);

        System.out.println(umProva.imprimir());
    }
}
