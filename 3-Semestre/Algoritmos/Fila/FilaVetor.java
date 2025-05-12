package Fila;

public class FilaVetor<T> implements Fila<T>{
    private int limite;
    private int tamanho;
    private int inicio;
    private T[] info;

    @SuppressWarnings("unchecked")
    public FilaVetor(int limite){
       this.info = (T[]) new Object[limite];
       this.limite = limite;
       this.tamanho = 0;
       this. inicio = 0;
    }

    public int getLimite() {
        return limite;
    }

    @Override
    public void inserir(T valor) {
       if (this.tamanho == this.limite) {
        throw new RuntimeException("Fila está cheia");
       }
       int posicaoInserir = (inicio + tamanho) % limite;
       info[posicaoInserir] = valor;
       tamanho += 1;
    }

    @Override
    public boolean estaVazia() {
        return tamanho == 0;
    }

    @Override
    public T peek() {
        if (estaVazia()) {
            throw new RuntimeException("Pilha está vazia");
        }
        return info[inicio];
    }

    @Override
    public T retirar() {
        if (estaVazia()) {
            throw new RuntimeException("Pilha está vazia");
        }
        T valor;
        valor = peek();
        this.inicio = (inicio + 1) % limite;
        tamanho -= 1;
        return valor;
    }

    @Override
    public void liberar() {
        while (tamanho > 0) {
            this.retirar();
        }
    }

    public String toString(){
        String str = "[";
        for (int i = 0; i < tamanho; i++) {
            str += this.info[(inicio + i) % limite] + ", ";
        }
        return str + "]";
    }

    public FilaVetor<T> criarFilaConcatenada(FilaVetor<T> f2){
        FilaVetor<T> novaFila = new FilaVetor<T>(this.limite + f2.limite);
        for (int i = 0; i < this.tamanho; i++) {
            novaFila.inserir(this.info[(inicio + i) % limite]);
        }
        for (int i = 0; i < f2.tamanho; i++) {
            novaFila.inserir(f2.info[(f2.inicio + i) % f2.limite]);
        }
        return novaFila;
    }

    public void encolher() {
        Object[] vetor = new Object[tamanho];
        int indice = inicio;
        for (int i = 0; i < tamanho; i++) {
            if (info[indice] != null) {
                vetor[i] = info[indice];
                indice = (indice + 1) % limite;
            }
        }
        inicio = 0;
    }

    public static void main(String[] args) {
        FilaVetor<Integer> fila = new FilaVetor<Integer>(5);
        
        fila.inserir(1);
        fila.inserir(2);
        fila.inserir(3);
        fila.inserir(4);
        fila.inserir(5);

        System.out.println(fila.toString());

        fila.retirar();
        fila.inserir(6);
        System.out.println(fila.toString());

        System.out.println(fila.peek());

        System.out.println(fila.estaVazia());

        FilaVetor<Integer> fila2 = new FilaVetor<Integer>(5);
        fila2.inserir(1);
        fila2.inserir(2);
        fila2.inserir(3);
        fila2.inserir(4);
        fila2.inserir(5);

        System.out.println(fila2.toString());
        FilaVetor<Integer> fila3 = fila.criarFilaConcatenada(fila2);
        System.out.println(fila3.toString());

        fila3.liberar();
        System.out.println(fila3.toString());
        System.out.println(fila3.estaVazia());

        FilaVetor<Integer> fila4 = new FilaVetor<Integer>(9);
        fila4.inserir(1);
        fila4.inserir(2);
        fila4.inserir(3);
        fila4.inserir(4);
        fila4.retirar();
        fila4.retirar();
        fila4.retirar();
        fila4.retirar();
        fila4.inserir(5);
        fila4.inserir(6);
        fila4.inserir(7);
        fila4.inserir(8);

        System.out.println(fila4.toString());
        fila4.encolher();
        System.out.println(fila4.toString());
    }
}


