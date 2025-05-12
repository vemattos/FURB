package Texto;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class ArquivoEx {
    Scanner t = new Scanner(System.in);
    public ArquivoEx(){
        System.out.println("Insira o nome do arquivo e a extensão");
        String str = t.next();
        try {
        File arquivo = new File(str);
        FileOutputStream fos = new FileOutputStream(arquivo, true);
        PrintWriter arquivoTexto = new PrintWriter(fos);
        System.out.println("Insira os dados do arquivo, (fim para finalizar escrita)");
        Boolean fim = false;

        while (!fim) {
            arquivoTexto.print(t); 
        }
        arquivoTexto.close();
    } catch (Exception e) {
        System.out.println(e.getMessage());
    }
        try {
            Scanner leitor = new Scanner(new File("C:/_projetos/java/2sem-uni1/"));
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public static void main(String[] args) {
        new ArquivoEx();
    }
}
