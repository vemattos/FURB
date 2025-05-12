package Prova3Ordenacao;

public class OrdenacaoBolhaOtimizada<T extends Comparable<T>> extends OrdenacaoAbstract<T> {

    public OrdenacaoBolhaOtimizada(T[] info) { /* Construtor que chama o construtor da classe pai para inicializar o array*/
        super(info);
    }

    private void ordenar(T[] info){ /* Método privado com a logica da ordenação bolha otimizada*/
        int n = info.length;
        boolean trocou; // Variável de controle para verificar se houve troca durante uma passagem
        for (int i = n - 1; i > 0; i--) { /* Percorre todo o array */
            trocou = false;
            for (int j = 0; j < i; j++) { /* Percorre os elementos que ainda não foram ordenados */
                if (info[j].compareTo(info[j + 1]) > 0) { /* Compara elementos vizinhos e os troca se estiverem na ordem errada */
                    trocar(j, j + 1); /* Metodo da classe pai para fazer a troca de lugar dos elementos */
                    trocou = true; /* Indica que houve troca durante a passagem */
                }
            }
            if (!trocou) { /* Verifica se não houveram trocas, se não o array ja está organizado */
                break;
            }
        }
    }

    @Override
    public void ordenar() { /* Implementação do método abstrato para realizar a ordenação */
        this.ordenar(getInfo());
    }
    
}
