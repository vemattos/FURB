// VINICIUS MATTOS
package zProva;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Prova {
    public static void main(String[] args) {
        try {
			Scanner leitor = new Scanner(new File("C:/_projetos/TextoProva/Questao1.csv"));
			while (leitor.hasNext()) { 
				System.out.println(leitor.nextLine());
			}
			
			leitor.close();
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}   
    }
    
	}
    
