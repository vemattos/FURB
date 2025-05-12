package Lista;

public class ListaEstatica<T> {
    private T[] lista;
    private int numElements;

    @SuppressWarnings("unchecked")
    public ListaEstatica(){
        lista = (T[]) new Object[10];
    }

    @SuppressWarnings("unchecked")
    private void redimensionar() {
        T[] novo = (T[]) new Object[lista.length + 10];
        for (int i = 0; i < lista.length; i++) {
            novo[i] = (T) lista[i];
        }
        lista = novo;
    }

    public void inserir(T valor){
        if (numElements == lista.length) {
            redimensionar();
        }
        lista[numElements] = valor;
        numElements++;
    }

    public void inverter(){
        int esquerda = 0;
        int direita = numElements -1;
        int trocas = numElements / 2;
        T temp = null;
        while (trocas > 0) {
            temp = lista[esquerda];
            lista[esquerda] = lista[direita];
            lista[direita] = temp;
            trocas--;
            esquerda++;
            direita--;
        }
    }

    public void exibir() {
        for (int i = 0; i < numElements; i++) {
            System.out.println(lista[i]);
        }
    }

    public int buscar(T valor) {  
        for (int i = 0; i < numElements; i++) {
            if (lista[i] == valor) {  
                return i;
            }
        }
        return -1;
    }

    public void retirar(T valor) {
        int posicao = buscar(valor);
        if (posicao > -1) {
            for (int i = posicao + 1; i < numElements; i++) {
                lista[i - 1] = lista[i];
            }
            numElements--;
        }
    }

    @SuppressWarnings("unchecked")
    public void liberar() {
        lista = (T[]) new Object[10];
        numElements = 0;
    }
    
    public T obterElemento(int posicao) { 
        if (posicao >= 0 && posicao < numElements) {
            return (T) lista[posicao]; 
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    public boolean estaVazia() {
        return numElements == 0;
    }

    public int getnumElements() {
        return numElements;
    }

	@Override
	public String toString() {
		String resultado = "";
		
		for (int i=0; i<numElements; i++) {
			if (i > 0) {
				resultado += ",";
			}
			resultado += lista[i].toString(); 
		}
		return resultado;
	}
}
