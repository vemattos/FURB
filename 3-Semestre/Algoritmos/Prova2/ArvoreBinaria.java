package Prova2;

public class ArvoreBinaria<T> {
    private NoArvoreBinaria<T> raiz;

    public ArvoreBinaria(){
        this.raiz = null;
    }

    public void setRaiz(NoArvoreBinaria<T> raiz) {
        this.raiz = raiz;
    }

    public boolean estaVazia(){
        if (raiz == null) {
            return true;
        }
        return false;
    }

    public boolean pertence(T info){
        return pertence(this.raiz, info);
    }

    private boolean pertence(NoArvoreBinaria<T> no ,T info){
        if (no == null) {
            return false;
        }
        if (no.getInfo().equals(info)) {
            return true;
        }
        return pertence(no.getEsquerda(), info) || pertence(no.getDireita(), info);
    }

    public int contarNos(){
        return contarNos(this.raiz);
    }

    private int contarNos(NoArvoreBinaria<T> no){
        if (no == null) {
            return 0;
        }
        return 1 + contarNos(no.getEsquerda()) + contarNos(no.getDireita());
    }

    
    public String toString(){
        return arvorePre(this.raiz);
    }

    private String arvorePre(NoArvoreBinaria<T> no){
        if (no == null) {
            return "<>";
        }
        return "<" + no.getInfo() + arvorePre(no.getEsquerda()) + arvorePre(no.getDireita()) + ">";
    }

    public int contarFolhas(NoArvoreBinaria<T> sa){
        if (sa == null) {
            return 0; //verifica se a subarvore existe
        }
        if (sa.getEsquerda() == null && sa.getDireita() == null) { //verificação para identificar as folhas(uma folha não possui filhos)
            return 1; //retorna 1 para fazer a soma
        }
        return contarFolhas(sa.getEsquerda()) + contarFolhas(sa.getDireita()); //percorre a arvore recursivamente somando cada folha encontrada e retorna ao percorrer a arvore inteira
    }


    public static void main(String[] args) {
        NoArvoreBinaria<Integer> raiz = new NoArvoreBinaria<Integer>(1);
        NoArvoreBinaria<Integer> no1 = new NoArvoreBinaria<Integer>(2);
        NoArvoreBinaria<Integer> no2 = new NoArvoreBinaria<Integer>(3);
        NoArvoreBinaria<Integer> no3 = new NoArvoreBinaria<Integer>(4);
        ArvoreBinaria<Integer> arvore = new ArvoreBinaria<Integer>();

        raiz.setDireita(no1);
        raiz.setEsquerda(no2);
        no1.setEsquerda(no3);

        arvore.setRaiz(raiz);

        System.out.println(arvore.pertence(4));
        System.out.println(arvore.contarNos());
        System.out.println(arvore.toString());

        arvore.contarFolhas(raiz);
        System.out.println(arvore.contarFolhas(raiz));

        NoArvoreBinaria<Integer> raiz1 = new NoArvoreBinaria<Integer>(1);
        NoArvoreBinaria<Integer> no4 = new NoArvoreBinaria<Integer>(2);
        NoArvoreBinaria<Integer> no5 = new NoArvoreBinaria<Integer>(3);
        NoArvoreBinaria<Integer> no6 = new NoArvoreBinaria<Integer>(4);
        NoArvoreBinaria<Integer> no7 = new NoArvoreBinaria<Integer>(5);
        NoArvoreBinaria<Integer> no8 = new NoArvoreBinaria<Integer>(6);
        NoArvoreBinaria<Integer> no9 = new NoArvoreBinaria<Integer>(7);
        ArvoreBinaria<Integer> arvore1 = new ArvoreBinaria<Integer>();

        arvore1.setRaiz(raiz1);
        raiz1.setEsquerda(no4);
        raiz1.setDireita(no5);
        no4.setEsquerda(no6);
        no4.setDireita(no7);
        no5.setEsquerda(no8);
        no5.setDireita(no9);

        System.out.println(arvore1.contarFolhas(raiz1));

    }
}
