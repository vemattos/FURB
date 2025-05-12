package Prova3Busca;

public abstract class ArvoreBinariaAbstract<T> {
    protected NoArvoreBinaria<T> raiz; /* Raiz da árvore binária */

    public ArvoreBinariaAbstract() { /* Construtor que inicializa a raiz como null */
        this.raiz = null;
    }

    protected void setRaiz(NoArvoreBinaria<T> raiz) { /*  Método para definir a raiz da árvore */
        this.raiz = raiz;
    }

    public boolean estaVazia() { /* Método para verificar se a árvore está vazia */
        return raiz == null; /* Retorna true se a raiz for null, caso contrário, false */
    }

    public abstract NoArvoreBinaria<T> buscar(T info); /* Método abstrato para buscar um nó com a informação especificada */

    public boolean pertence(T info) { /* Método para verificar se a informação especificada pertence à árvore */
        return pertence(this.raiz, info);
    }

    private boolean pertence(NoArvoreBinaria<T> no, T info) { /* Método recursivo para verificar se a informação pertence à subárvore */
        if (no == null) {
            return false; /* Retorna false se o nó atual for null */
        }
        if (no.getInfo().equals(info)) {
            return true; /* Retorna true se a informação do nó for igual à informação especificada */
        }
        /* Verifica recursivamente nos nós da esquerda e direita */
        return pertence(no.getEsquerda(), info) || pertence(no.getDireita(), info);
    }

    /* Método para contar o número de nós na árvore */
    public int contarNos() {
        return contarNos(this.raiz);
    }

    /* Método privado recursivo para contar o número de nós na subárvore */
    private int contarNos(NoArvoreBinaria<T> no) {
        if (no == null) {
            return 0; /* Retorna 0 se o nó atual for null */
        }
        /* Retorna 1 (nó atual) + nós na subárvore esquerda + nós na subárvore direita */
        return 1 + contarNos(no.getEsquerda()) + contarNos(no.getDireita());
    }

    /* Método para retornar uma representação em string da árvore em pré-ordem */
    public String toString() {
        return arvorePre(this.raiz);
    }

    /* Método privado recursivo para gerar a representação em string da subárvore em pré-ordem */
    private String arvorePre(NoArvoreBinaria<T> no) {
        if (no == null) {
            return "<>"; /* Retorna "<>" se o nó atual for null */
        }
        /* Retorna a string com a informação do nó atual, subárvore esquerda e subárvore direita */
        return "<" + no.getInfo() + arvorePre(no.getEsquerda()) + arvorePre(no.getDireita()) + ">";
    }

    /* Método para contar o número de folhas na subárvore */
    public int contarFolhas(NoArvoreBinaria<T> sa) {
        if (sa == null) {
            return 0; /* Retorna 0 se o nó atual for null */
        }
        if (sa.getEsquerda() == null && sa.getDireita() == null) {
            return 1; /* Retorna 1 se o nó atual for uma folha (sem filhos) */
        }
        /* Retorna a soma das folhas nas subárvores esquerda e direita */
        return contarFolhas(sa.getEsquerda()) + contarFolhas(sa.getDireita());
    }
}
