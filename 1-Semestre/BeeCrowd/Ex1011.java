import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex1011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df_3 = new DecimalFormat("0.000");

        double Raio = sc.nextInt();
        
        double VOLUME = (4/3.0) * 3.14159 * Math.pow(Raio, 3);

        System.out.println("VOLUME = " + df_3.format(VOLUME));
        sc.close();


    
    }
}
