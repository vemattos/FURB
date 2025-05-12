package Prova3Ordenacao;

public class OrdenacaoBolha<T extends Comparable<T>> extends OrdenacaoAbstract<T> {
    public OrdenacaoBolha(T[] info) { /* Construtor que chama o construtor da classe pai para inicializar o array*/
        super(info);
    }

    private void ordenar(T[] info) { /* Método privado com a logica da ordenação bolha */
        int n = info.length;
        for (int i = n - 1; i > 0; i--) { /* Percorre todos os elementos do array */
            for (int j = 0; j < i; j++) { /* Percorre os elementos restantes não ordenados */
                if (info[j].compareTo(info[j + 1]) > 0) { /* Compara elementos vizinhos e os troca se estiverem na ordem errada */
                    trocar(j, j + 1); /* Metodo da classe pai para fazer a troca de lugar dos elementos */
                }
            }
        }
    }

    @Override 
    public void ordenar() { /* Implementação do método abstrato para realizar a ordenação */
        this.ordenar(getInfo());
    }
    
}
