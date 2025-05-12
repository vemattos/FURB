package Prova3Ordenacao;

public class PrincipalOrdenacao {
    public static void main(String[] args) {
        // Ordenação pelo método Bolha
        Integer[] vetor1 = {70, 2, 88, 15, 90, 30};
        OrdenacaoAbstract<Integer> ordenacaoBolha = new OrdenacaoBolha<>(vetor1.clone());
        ordenacaoBolha.ordenar();
        System.out.print("Ordenação pelo método Bolha: ");
        imprimirVetor(ordenacaoBolha.getInfo());

        // Ordenação pelo método Bolha Otimizada
        Integer[] vetor2 = {70, 2, 88, 15, 90, 30};
        OrdenacaoAbstract<Integer> ordenacaoOtimizada = new OrdenacaoBolhaOtimizada<>(vetor2.clone());
        ordenacaoOtimizada.ordenar();
        System.out.print("Ordenação pelo método Bolha Otimizada: ");
        imprimirVetor(ordenacaoOtimizada.getInfo());

        // Ordenação pelo método Quicksort
        Integer[] vetor3 = {70, 2, 88, 15, 90, 30};
        OrdenacaoAbstract<Integer> quicksort = new OrdenacaoQuickSort<>(vetor3.clone());
        quicksort.ordenar();
        System.out.print("Ordenação pelo método Quicksort: ");
        imprimirVetor(quicksort.getInfo());

        // Ordenação pelo método MergeSort
        Integer[] vetor4 = {70, 2, 88, 15, 90, 30};
        OrdenacaoAbstract<Integer> mergeSort = new OrdenacaoMergeSort<>(vetor4.clone());
        mergeSort.ordenar();
        System.out.print("Ordenação pelo método MergeSort: ");
        imprimirVetor(mergeSort.getInfo());
    }

    private static void imprimirVetor(Integer[] vetor) {
        // Percorre todos os elementos do array
        for (int num : vetor) {
            // Imprime cada elemento separado por vírgula
            System.out.print(num + ", ");
        }
        // Imprime uma nova linha após imprimir todos os elementos
        System.out.println();
    }
}
