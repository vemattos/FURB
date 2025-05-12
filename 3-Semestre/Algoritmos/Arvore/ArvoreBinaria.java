package Arvore;

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

    public int contarFolhas(NoArvoreBinaria<T> sa) {
        if (sa == null) {
            return 0;
        }
        if (sa.getEsquerda() == null && sa.getDireita() == null) {
            return 1;
        }
        return contarFolhas(sa.getEsquerda()) + contarFolhas(sa.getDireita());
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

        System.out.println(arvore.contarFolhas(raiz));
    }























































    // private NoArvoreBinaria<T> raiz;

    // public ArvoreBinaria() {
    //     this.raiz = null;
    // }

    // public void setRaiz(NoArvoreBinaria<T> raiz) throws Exception {
    //     if (raiz == null) {
    //         throw new Exception("Toda árvore deve ter uma raiz");
    //     }
    //     this.raiz = raiz;
    // }

    // public boolean estaVazia() {
    //     return raiz == null;
    // }

    // public boolean pertence(T info) {
    //     return pertence(raiz, info);
    // }

    // private boolean pertence(NoArvoreBinaria<T> no, T info) {
    //     if (no == null) {
    //         return false;
    //     }
    //     if (no.getInfo().equals(info)) {
    //         return true;
    //     }
    //     return pertence(no.getEsquerda(), info) || pertence(no.getDireita(), info);
    // }

    // @Override
    // public String toString() {
    //     return arvorePre(raiz);
    // }

    // public String arvorePre(NoArvoreBinaria<T> no) {
    //     if (no == null) {
    //         return "";
    //     }
    //     StringBuilder sb = new StringBuilder();
    //     sb.append(no.getInfo().toString()).append(" ");
    //     sb.append(arvorePre(no.getEsquerda()));
    //     sb.append(arvorePre(no.getDireita()));
    //     return sb.toString();
    // }

    // public int contarNos() {
    //     return contarNos(raiz);
    // }

    // private int contarNos(NoArvoreBinaria<T> no) {
    //     if (no == null) {
    //         return 0;
    //     }
    //     return 1 + contarNos(no.getEsquerda()) + contarNos(no.getDireita());
    // }
}