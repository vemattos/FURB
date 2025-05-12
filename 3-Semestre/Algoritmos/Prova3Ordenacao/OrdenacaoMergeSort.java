package Prova3Ordenacao;

public class OrdenacaoMergeSort<T extends Comparable<T>> extends OrdenacaoAbstract<T> {

    public OrdenacaoMergeSort(T[] info) { /* Construtor que chama o construtor da classe pai para inicializar o array*/
        super(info);
    }

    @Override /* Método para ordenar os elementos usando o algoritmo de ordenação mergesort */
    public void ordenar() {
        mergeSort(0, info.length - 1); /* Chamada inicial para o mergesort */
    }

    private void mergeSort(int inicio, int fim) { /* Método recursivo para ordenar o array usando o algoritmo de ordenação mergesort */
        if (inicio < fim) {
            int meio = (inicio + fim) / 2; /* Encontra o meio do array */ 
            mergeSort(inicio, meio); /* Ordena a metade esquerda do array */
            mergeSort(meio + 1, fim); /* Ordena a metade direita do array */
            merge(inicio, fim, meio); /* Combina as duas metades ordenadas */
        }
    }

    @SuppressWarnings("unchecked")
    private void merge(int inicio, int fim, int meio) { /* Método para combinar as duas metades ordenadas do array */
        int tamEsquerda = meio - inicio + 1; /* Tamanho da metade esquerda */
        T[] esquerda = (T[]) new Comparable[tamEsquerda]; /* Cria array temporário para a metade esquerda */
        for (int i = 0; i < tamEsquerda; i++) {
            esquerda[i] = info[inicio + i]; /* Copia os elementos da metade esquerda */
        }

        int tamDireita = fim - meio; /* Tamanho da metade direita */
        T[] direita = (T[]) new Comparable[tamDireita]; /*  Cria array temporário para a metade direita */
        for (int i = 0; i < tamDireita; i++) {
            direita[i] = info[meio + 1 + i]; /* Copia os elementos da metade direita */
        }

        int cEsq = 0; /* Índice inicial para a metade esquerda */
        int cDir = 0; /* Índice inicial para a metade direita */
        int i = inicio; /* Índice inicial para o array combinado */ 

        /* Combina os arrays temporários na ordem correta */
        while (cEsq < tamEsquerda && cDir < tamDireita) {
            if (esquerda[cEsq].compareTo(direita[cDir]) <= 0) {
                info[i] = esquerda[cEsq];
                cEsq++;
            } else {
                info[i] = direita[cDir];
                cDir++;
            }
            i++;
        }
        /* Copia os elementos restantes da metade esquerda, se houver */
        while (cEsq < tamEsquerda) {
            info[i] = esquerda[cEsq];
            cEsq++;
            i++;
        }
        /* Copia os elementos restantes da metade direita, se houver */
        while (cDir < tamDireita) {
            info[i] = direita[cDir];
            cDir++;
            i++;
        }
    }


}