import java.util.Scanner;

public class Ex1046 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
		
		int hora_inicial,hora_final;
		int contador=0;
		
		hora_inicial = teclado.nextInt();
		hora_final = teclado.nextInt();
		
		if(hora_final<=hora_inicial){
			hora_final = hora_final+24;
		}
		
		for(int i= hora_inicial;i<hora_final;i++) {
			contador++;
		}
		System.out.println("O JOGO DUROU "+contador+" HORA(S)");
		
		teclado.close();
	}

}

