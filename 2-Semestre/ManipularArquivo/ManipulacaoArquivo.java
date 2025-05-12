package ManipularArquivo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ManipulacaoArquivo {
    public ManipulacaoArquivo() throws ClassNotFoundException, IOException{
        try {
            escreverArquivo();
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        e.printStackTrace();
        }
        lerArquivo();
    }
    private void escreverArquivo() throws IOException{
        File arquivo = new File("arqserielizado.bin");
        FileOutputStream fos = new FileOutputStream(arquivo, false);

        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject("Exemplo de gravação serielizada");
        oos.writeObject(new Pessoa("Vinicius", "123456789"));
        oos.writeObject(new Livro("Livro", 10));
        oos.close();
        fos.close();
    }
    private void lerArquivo() throws IOException, ClassNotFoundException{
    File arquivo = new File("arqserializado.bin");
    FileInputStream fis = new FileInputStream(arquivo);

    ObjectInputStream ois = new ObjectInputStream(fis);
        try {
            while (fis.available() !=0) {
                String frase = (String) ois.readObject();
                Pessoa pessoa = (Pessoa) ois.readObject();
                Livro livro = (Livro) ois.readObject();

                System.out.println("Frase: " + frase);
                System.out.println(pessoa.toString());
                System.out.println(livro.toString());
            }
        } catch (Exception eof) {
            // TODO: handle exception
        }
        ois.close();
        fis.close();

    }
}
