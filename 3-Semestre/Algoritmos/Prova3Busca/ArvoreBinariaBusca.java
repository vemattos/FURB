package Prova3Busca;

public class ArvoreBinariaBusca<T extends Comparable<T>> extends ArvoreBinariaAbstract<T> {

    /* Método para inserir um novo nó com a informação especificada na árvore */
    public void inserir(T info) {
        NoArvoreBinaria<T> novo = new NoArvoreBinaria<>(info); /* Cria um novo nó com a informação */
        if (raiz == null) {
            raiz = novo; /* Define a raiz se a árvore estiver vazia */
        } else {
            NoArvoreBinaria<T> p = raiz;
            NoArvoreBinaria<T> pai = null;
            while (true) {
                pai = p;
                if (info.compareTo(p.getInfo()) < 0) {
                    p = p.getEsquerda();
                    if (p == null) {
                        pai.setEsquerda(novo); /* Insere o novo nó na subárvore esquerda */
                        return;
                    }
                } else {
                    p = p.getDireita();
                    if (p == null) {
                        pai.setDireita(novo); /* Insere o novo nó na subárvore direita */
                        return;
                    }
                }
            }
        }
    }
     
    /* Método para buscar um nó com a informação especificada na árvore */
    @Override
    public NoArvoreBinaria<T> buscar(T info) {
        return buscar(this.raiz, info);
    }
     
    /* Método recursivo para buscar um nó com a informação especificada */
    private NoArvoreBinaria<T> buscar(NoArvoreBinaria<T> no, T info) {
        if (no == null || no.getInfo().equals(info)) {
            return no; 
        }
        if (info.compareTo(no.getInfo()) < 0) {
            return buscar(no.getEsquerda(), info); 
        } else {
            return buscar(no.getDireita(), info); 
        }
    }

    /* Método para remover um nó com a informação especificada da árvore */
    public void retirar(T info) {
        setRaiz(retirar(this.raiz, info)); 
    }

    /* Método recursivo para remover um nó com a informação especificada */
    private NoArvoreBinaria<T> retirar(NoArvoreBinaria<T> no, T info) {
        if (no == null) {
            return null; 
        }
        if (info.compareTo(no.getInfo()) < 0) {
            no.setEsquerda(retirar(no.getEsquerda(), info));
        } else if (info.compareTo(no.getInfo()) > 0) {
            no.setDireita(retirar(no.getDireita(), info)); 
        } else {
            
            if (no.getEsquerda() == null) {
                return no.getDireita(); 
            } else if (no.getDireita() == null) {
                return no.getEsquerda();
            }
            
            no.setInfo(extrairSucessor(no.getDireita()));
            no.setDireita(retirar(no.getDireita(), no.getInfo()));
        }
        return no;
    }

    /* Método para encontrar e retornar a informação do sucessor do nó */
    private T extrairSucessor(NoArvoreBinaria<T> no) {
        T sucessorInfo = no.getInfo();
        while (no.getEsquerda() != null) {
            no = no.getEsquerda(); 
            sucessorInfo = no.getInfo(); 
        }
        return sucessorInfo; 
    }
}
