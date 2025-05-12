public class ex2p2 {
    public static void main(String[] args) {

        int somapares = 0;
        int somaimpares = 0;
        
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                somapares += i;
            } else {
                somaimpares += i;
            }
        }
        System.out.println("Soma pares = " + somapares);
        System.out.println("Soma ímpares = " + somaimpares);
    }
}
