package Questão2;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;


public class Teste {
    
    public Teste(){
        Scanner s = new Scanner(System.in);

        System.out.println("Nome do professor");
        String nome = s.next();
        System.out.println("Área do professor");
        String area = s.next();

        Professor p1 = new Professor(nome, area);

        System.out.println("N - artigo normal / I - artigo importante / S - sair");
        char tipo = s.next().toUpperCase().charAt(0);

        System.out.println("Título do artigo");
        String titulo = s.next();
        System.out.println("Periódico");
        String periodico = s.next();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date dataPublicacao = sdf.parse(s.next());
        System.out.println("Qualis");
        char qualis = s.next().charAt(0);

        switch (tipo) {
            case 'N':
                    Artigo aNormal = new Artigo(titulo, periodico, dataPublicacao, qualis);
                    p1.adicionarArtigo(aNormal);
                break;
        
            case 'I':
            System.out.println("Fator de impacto: ");
                    int fatorImpacto = s.nextInt();
                    ArtigoImportante aImportante = new ArtigoImportante(titulo, periodico, dataPublicacao, qualis, fatorImpacto);
                    p1.adicionarArtigo(aImportante);
                break;
            case 'S':
                break;
            default:
            System.out.println("Opção inválida");
        } while (tipo != 'S');

        System.out.println(p1.mostrarEstatistica());

        s.close();
    }
    public static void main(String[] args) throws ParseException{
        new Teste();
    }
}
