package Prova3Busca;

public class Principal {
    public static void main(String[] args) {
        //Teste 1
        ArvoreBinariaBusca<Integer> arvore = new ArvoreBinariaBusca<>(); 
        arvore.inserir(50);
        arvore.inserir(30);
        arvore.inserir(70);
        arvore.inserir(40);
        arvore.inserir(25);
        arvore.inserir(75);
        arvore.inserir(65);
        arvore.inserir(35);
        arvore.inserir(60);

        System.out.println("Árvore após inserção dos dados:");
        System.out.println(arvore);

        //Teste 2
        ArvoreBinariaBusca<Integer> arvore2 = new ArvoreBinariaBusca<>();
        arvore2.inserir(50);
        arvore2.inserir(30);
        arvore2.inserir(25);
        arvore2.inserir(40);

        System.out.println("Árvore antes da remoção de 40:");
        System.out.println(arvore2);

        arvore2.retirar(40);

        System.out.println("Árvore após a remoção de 40:");
        System.out.println(arvore2);

        //Teste 3
        ArvoreBinariaBusca<Integer> arvore3 = new ArvoreBinariaBusca<>();
        arvore3.inserir(80);
        arvore3.inserir(52);
        arvore3.inserir(90);
        arvore3.inserir(48);
        arvore3.inserir(71);
        arvore3.inserir(63);
        arvore3.inserir(67);

        arvore3.retirar(71);

        System.out.println("Árvore após a remoção de 71:");
        System.out.println(arvore3);
      
        //Teste 4
        ArvoreBinariaBusca<Integer> arvore4 = new ArvoreBinariaBusca<>();
        arvore4.inserir(250);
        arvore4.inserir(38);
        arvore4.inserir(26);
        arvore4.inserir(72);
        arvore4.inserir(55);
        arvore4.inserir(90);
        arvore4.inserir(41);
        arvore4.inserir(60);
        arvore4.inserir(43);
        arvore4.inserir(78);
        arvore4.inserir(92);
        arvore4.inserir(74);

        arvore4.retirar(38);

        System.out.println("Árvore após a remoção de 38:");
        System.out.println(arvore4);
    }
}
