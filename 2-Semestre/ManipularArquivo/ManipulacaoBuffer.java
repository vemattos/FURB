package ManipularArquivo;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class ManipulacaoBuffer {
    public static void main(String[] args) throws FileNotFoundException {
        //Fluxo de saida de um arquivo
        OutputStream os = new  FileOutputStream("c://temp//fileB.dat");
        Writer wr = new OutputStreamWriter(os);  //criação
        BufferedWriter br = new BufferedWriter(wr); //adiciona

        String m[][] = {{"Jõao","Blumenau","20"},{"Maria","Gaspar","23"}};
    }
}
