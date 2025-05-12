package ManipularArquivo;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ManipulacaoArquivoBinario {
    public static void main(String[] args) throws IOException {
        //definindo diretorio e nome de arquivo a ser criado e gravado
        File f = new File("c://temp//exemplo.dat");
        //criando arquivo que permita gravar algo
        FileOutputStream fos = new FileOutputStream(f);

        //gravando algo nos arquivos
        fos.write(90);
        fos.write(100);
        fos.write(200);
        fos.write(400);
        fos.write(1000);

        //fechando o arquivo
        fos.close();

        //abrindo o arquivo para realizar a leitura das informações
        FileInputStream fis = new FileInputStream(f);

        int dado;

        while (true) {
            //lendo cada byte
            dado = fis.read();
            //verificando se não chegou ao final do arquivo
            if (dado != -1) {
                System.out.println("Dado");
            } else {
                break;
            }
        }
    }
}
