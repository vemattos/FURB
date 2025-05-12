package Prova3Ordenacao;

public class OrdenacaoQuickSort<T extends Comparable<T>> extends OrdenacaoAbstract<T> {

    public OrdenacaoQuickSort(T[] info) { /* Construtor que chama o construtor da classe pai para inicializar o array*/
        super(info);
    }

    @Override
    public void ordenar() { /* Método para ordenar os elementos usando o algoritmo de ordenação quicksort */
        int n = info.length - 1;
        quickSort(0, n); /* Chamada inicial para o quicksort */
    }

    private void quickSort(int inicio, int fim) { /* Método recursivo para ordenar o subarray usando o quicksort */
        if (inicio < fim) {
            int idxPivo = particionar(inicio, fim); /* Encontra a posição do pivô */
            quickSort(inicio, idxPivo - 1); /* Ordena a metade esquerda do pivô */
            quickSort(idxPivo + 1, fim); /* Ordena a metade direita do pivô */
        }
    }

    private int particionar(int inicio, int fim) { /* Método para particionar o subarray e encontrar a posição do pivô */
        int a = inicio; /* Índice do primeiro elemento */
        int b = fim + 1; /* Índice do último elemento */
        T pivo = info[inicio]; /* Define o primeiro elemento como pivô */

        /* Loop para encontrar a posição do pivô */
        while (true) {
            /* Encontra um elemento maior que o pivô */
            while (++a <= fim && info[a].compareTo(pivo) < 0);
            /* Encontra um elemento menor que o pivô */
            while (--b >= inicio && info[b].compareTo(pivo) > 0);
            /* Se os índices se cruzarem, termina a partição */
            if (a >= b) {
                break;
            }
            /* Troca os elementos nas posições a e b */
            trocar(a, b);
        }
        /* Coloca o pivô na posição correta, trocando com o elemento na posição b */
        trocar(b, inicio);

        return b; /* Retorna a posição do pivô */
    }
}
