package unidade1;
public class ListaEstatica {
	
	private int[] info;
	private int numElements;
	private enum tipos { tipoChar, tipoLong, tipoInt, tipoString };

	/**
	 * Cria uma lista vazia
	 */
	public ListaEstatica() {
		info = new int[10];
		numElements = 0;
	}
	
	
	/**
	 * Adiciona um valor na lista
	 * @param valor Dado a ser adicionado
	 */
	public void inserir(int valor) {
		if (numElements == info.length) {
			redimensionar();
		}
		info[numElements] = valor;
		numElements++;
	}
	

	/**
	 * Provoca um pseudo redimensionamento do vetor info
	 */
	private void redimensionar() {
		int[] novo = new int[info.length + 10];
		//copia do antigo array para o novo
		for (int i=0; i<info.length; i++) {
			novo[i] = info[i];
		}
		
		info = novo;
	}	
	
	
	/**
	 * Exibe o conteúdo da lista
	 */
	public void exibir() {
		for (int i=0; i<numElements; i++) {
			System.out.println(info[i]);
		}
	}
	
	
	/**
	 * Procura na lista um determinado valor
	 * @param valor Dado a ser pesquisado
	 * @return posição do valor na lista. Caso não seja encontrado
	 * retorna -1.
	 */
	public int buscarValor(int valor) {
		for (int i=0; i<numElements; i++) {
			if (info[i] == valor) {
				return i;
			}
		}
		
		return -1;
	}

		/**
	 * Procura na lista um determinado valor
	 * @param valor Dado a ser pesquisado
	 * @return posição do valor na lista. Caso não seja encontrado
	 * retorna -1.
	 */
	public int buscarPosicao(int posicao) {
		if (posicao > numElements) {
			return 999;
		}
		return info[posicao];
	}


	//a resposta completa é a posição inicial + enderecoPosicao (...)
	public int enderecoPosicao(int posicao, tipos tipoVar, int tamanhoString){
		// verifica o tamanho de cada elemento baseado no tipo
		switch (tipoVar) {
			case tipoChar:
				return posicao * 2;
			case tipoLong:
				return posicao * 8;
			case tipoInt:
				return posicao * 4;
			case tipoString:
				return posicao * tamanhoString;
			default:
				return -1;
		}
	}
	
	
	/**
	 * Retira um dado da lista
	 * @param valor Dado a ser removido
	 */
	public void retirar(int valor) {
		int posicao = buscarValor(valor);
		
		if (posicao > -1) {
			for (int i=posicao+1; i<numElements; i++) {
				//copia do anterior para a posicao do atual
				info[i-1] = info[i];
			}
			
			numElements--;
		}
	}
	
	
	/**
	 * limpa a estrutura de dados, de forma que a 
	 * lista esteja vazia
	 */
	public void liberar() {
		info = new int[10];
		numElements = 0;
	}
	
	
	/**
	 * Retorna o dado armazenado numa determinada posição
	 * da lista.
	 * @param posicao Posição do dado
	 * @return Dado localizado
	 */
	public int obterElemento(int posicao) {
		if (posicao >= 0 && (posicao < numElements)) {
			return info[posicao];
		} else {
			throw new IndexOutOfBoundsException();
		}
	}
	
	
	/**
	 * Avalia se a lista está vazia ou contem dados armazenados.
	 * @return true se a lista estiver vazia, senão false.
	 */
	public boolean estaVazia() {
		return numElements==0;
	}
	
	
	/**
	 * Retorna o numElements atual da lista, isto é,
	 * a quantidade de dados já armazenados na estrutura de dados
	 * @return Quantidade de dados armazenados
	 */
	public int getnumElements() {
		return numElements;
	}
	
	
	/**
	 * Retorna string contendo os dados armazenados na lista
	 */
	@Override
	public String toString() {
		String resultado = "";
		
		for (int i=0; i<numElements; i++) {
			if (i > 0) {
				resultado += ",";
			}
			resultado += info[i]; 
		}
		
		return resultado;
	}


}
