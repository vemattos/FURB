package ManipularArquivo;
import java.io.File;

public class ManipulacaoArquivos {
    public static void main(String[] args) {
    // definindo diretorio
     File dir = new File ("c//temp/");
    // pegando a lista de arquivos e diretorios
     File conteudoDir[] = dir.listFiles();
     double total = 0.0;
    // varrendo o vetor que contém a lista de arquivos e diretorios
    for (File item: conteudoDir) {
        if(item.isDirectory()){
            System.out.println("<DIR> " + item.getName());
        }else{
           total += item.length(); 
            System.out.println(item.getName() + "\t" + item.length());
        }
    }

    System.out.println("Total arquivos:" + conteudoDir.length + "\t" );

    }
}
