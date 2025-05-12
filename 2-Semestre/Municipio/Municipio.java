package Municipio;

import java.io.File;

import java.io.FileNotFoundException;

import java.util.Scanner;

public class Municipio {
    public Municipio(){
        try {
			Scanner leitor = new Scanner(new File("C://TextosTrabalho//municipios2.csv"));
			while (leitor.hasNext()) { 
                System.out.println(leitor.nextLine());
    		}
			leitor.close();
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
        
	
    }
    public static void main(String[] args) {
        new Municipio();
    }
}

