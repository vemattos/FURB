package Prova3Ordenacao;

public abstract class OrdenacaoAbstract<T extends Comparable<T>> {
    protected T[] info; /* Array que armazena os elementos */
    
    public OrdenacaoAbstract(T[] info) {
        this.info = info; /* Construtor que inicializa o array */
    }

    public T[] getInfo() { /* Construtor que inicializa o array */
        return info;
    }

    public void setInfo(T[] info) { /* Metodo set da variável info */
        this.info = info;
    }

    protected void trocar(int pos1, int pos2) { /* Método para trocar os elementos de posição no array */
        T temp = info[pos1]; /* Coloca a infomação da posição 1 em uma variável temporária */
        info[pos1] = info[pos2]; /* Coloca a informação da posição dois no lugar da posição 1 */
        info[pos2] = temp;  /* Coloca na posição a informação armazenada na variável temporaria */
    }
    
    public abstract void ordenar(); /* Método abstrato que vai realizar a ordenação nas classes concretas */
}
