package Prova3Busca;

public class ArvoreBinaria<T> extends ArvoreBinariaAbstract<T> {

    @Override
    public NoArvoreBinaria<T> buscar(T info) { /* Método para buscar um nó com a informação especificada na árvore */
        return buscar(this.raiz, info);
    }

    public void setRaiz() { /* Método para definir a raiz da árvore */
        super.setRaiz(raiz); /* Chama o método setRaiz da classe pai */
    }

    private NoArvoreBinaria<T> buscar(NoArvoreBinaria<T> no, T info) { /* Método recursivo para buscar um nó com a informação especificada */
        if (no == null) {
            return null; /* Retorna null se o nó atual for null */
        }
        if (no.getInfo().equals(info)) {
            return no; /* Retorna o nó se a informação do nó for igual à informação buscada */
        }
        /* Busca recursivamente nos nós da esquerda e direita */
        NoArvoreBinaria<T> noEncontrado = buscar(no.getEsquerda(), info);
        if (noEncontrado != null) {
            return noEncontrado; /* Retorna o nó encontrado na subárvore esquerda */
        }
        return buscar(no.getDireita(), info);/* Retorna o nó encontrado na subárvore direita ou null */
    }
}