package AulaHerança;

public class Principal {
    public static void main(String[] args) {

        Professor p1 = new Professor("Mauro", 59, "Computação", 80);
        Professor p2 = new Professor("Mauro", 59, "Computação", 80);
        Professor p3 = new Professor("Mauro", 59, "Computação", 80);

        Aluno a1 = new Aluno("Vini", 18, 84, "80");
        Aluno a2 = new Aluno("Vini", 18, 84, "80");
        Aluno a3 = new Aluno("Vini", 18, 84, "80");

        a1.imprimirDados();
        System.out.println(p1.toString());
    }
}
