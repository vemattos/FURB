public class ex21 {
    public static void main(String[] args) {

        double ze = 1.10;
        double chico = 1.50;
        int anos = 0;

        while (ze < chico) {
            ze += 0.3;
            chico += 0.2;
            anos++;
        }
        System.out.println("Levará " + anos + " anos para Zé ficar maior que Chico");

    }
}
