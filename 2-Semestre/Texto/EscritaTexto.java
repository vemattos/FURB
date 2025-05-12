package Texto;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class EscritaTexto {
    public EscritaTexto(){
    try {
        File arquivo = new File("teste.aula");
        FileOutputStream fos = new FileOutputStream(arquivo, true);
        PrintWriter arquivoTexto = new PrintWriter(fos);

        arquivoTexto.print("Nome: ");
        arquivoTexto.print("Vinicius: ");
        arquivoTexto.println();
        arquivoTexto.print(true);
        arquivoTexto.print('A');
        arquivoTexto.print(8); 

        arquivoTexto.close();
    } catch (Exception e) {
        System.out.println(e.getMessage());
    }
}
    
    public static void main(String[] args) {
        new EscritaTexto();
    }
}
