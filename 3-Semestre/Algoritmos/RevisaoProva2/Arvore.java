package RevisaoProva2;

public class Arvore<T> {
    private NoArvore<T>  raiz;

    public Arvore() {
        this.raiz = null;
    }

    public NoArvore<T> getRaiz() {
        return raiz;
    }

    public void setRaiz(NoArvore<T> raiz) {
        this.raiz = raiz;
    }

    public boolean estaVazia(){
        if (this.raiz == null) {
            return true;
        } 
        return false;
    }

    public boolean pertence(T info){
        return pertence(this.raiz, info);
    }

    public boolean pertence(NoArvore<T> no, T info){
        if (no == null) {
            return false;
        }
        if (no.getInfo() == info) {
            return true;
        }
        NoArvore<T> p = no.getPrimeiro();
        while (p != null) {
            if (this.pertence(p, info)) {
                return true;
            }
            p = p.getProximo();
        }
        return false;
    }

    public int contarNos(){
        return contarNos(this.raiz);
    }

    public int contarNos(NoArvore<T> no){
        if (no == null) {
            return 0;
        }
        int contador = 1;
        NoArvore<T> p = no.getPrimeiro();
        while (p != null) {
            contador += contarNos(p);
            p = p.getProximo();
        }
        return contador;
    }

    public String toString(){
        return obterRepresentacaoTextual(this.raiz);
    }

    public String obterRepresentacaoTextual(NoArvore<T> no){
        if (no == null) {
            return "<>";
        }
        String str = "<";
        str += no.getInfo();
        NoArvore<T> p = no.getPrimeiro();
        while (p != null) {
            str += obterRepresentacaoTextual(p);
            p = p.getProximo();
        }
        return str + ">";
    }

    public static void main(String[] args) {
        Arvore<Integer> arvore = new Arvore<Integer>();
        NoArvore<Integer> raiz = new NoArvore<Integer>(1);
        NoArvore<Integer> no1 = new NoArvore<Integer>(2);
        NoArvore<Integer> no2 = new NoArvore<Integer>(3);
        NoArvore<Integer> no3 = new NoArvore<Integer>(4);

        arvore.setRaiz(raiz);
        raiz.inserirFilho(no1);
        raiz.inserirFilho(no2);
        no2.inserirFilho(no3);

        System.out.println(arvore.pertence(4));
        System.out.println(arvore.contarNos());
        System.out.println(arvore.toString());
    }
}
