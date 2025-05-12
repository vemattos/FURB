package Prova2;

public class FilaVetor<T> implements Fila<T> {
    private T info[];
    private int limite;
    private int tamanho;
    private int inicio;
    

    @SuppressWarnings("unchecked")
    public FilaVetor(int limite) {
        this.limite = limite;
        this.info = (T[]) new Object[limite] ;
        this.tamanho = 0;
        this.inicio = 0;
    }
    
    public int getLimite() {
        return limite;
    }

    @Override
    public void inserir(T valor) {
        if (this.tamanho == this.limite) {
            throw new FilaCheiaException();
        }
        int posicaoInserir = (inicio + tamanho) % limite;
        info[posicaoInserir] = valor;
        tamanho += 1;
    }

    @Override
    public boolean estaVazia() {
        if (this.tamanho == 0) {
            return true;
        }
        return false;
    }

    @Override
    public T peek() {
        if (estaVazia()) {
            throw new FilaVaziaException();
        }
        return info[inicio];
    }

    @Override
    public void liberar() {
        while (tamanho > 0) {
            this.retirar();
        }
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

    public String toString(){
        String str = "[";
        for (int i = 0; i < tamanho; i++) {
            str += this.info[(inicio + i) % limite] + ", ";
        }
        return str + "]";
    }

    public FilaVetor<T> criarFilaConcatenada(FilaVetor<T> f2){
        FilaVetor<T> novaFila = new FilaVetor<>(this.limite + f2.limite);
        for (int i = 0; i < this.tamanho; i++) {
            novaFila.inserir(this.info[(inicio + i) % limite]);
        }
        for (int i = 0; i < f2.tamanho; i++) {
            novaFila.inserir(f2.info[(inicio + i) % limite]);
        }
        return novaFila;
    }

    @SuppressWarnings("unchecked")
    public void encolher(){
        T[] filaMenor = (T[]) new Object[(this.tamanho)]; //cria um novo vetor para encolher uma fila
        for (int i = 0; i < this.tamanho; i++) {
            filaMenor[i] = this.info[(inicio + i) % limite]; //inserir os dados da fila "maior" no novo vetor usando a formula que calcula a proxima posição
        }
        this.limite = this.tamanho; //define que o limite da fila encolhida agora é igual ao seu tamanho
        this.inicio = 0; //define que o ponteiro de inicio vai apontar pro inicio do novo vetor
        this.info = filaMenor; //muda a referência da fila "maior" para o novo vetor encolhido
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
        System.out.println(fila4.toString());
        System.out.println(fila4.getLimite());

        fila4.retirar();
        System.out.println(fila4.toString());
        System.out.println(fila4.getLimite());

        fila4.encolher();
        System.out.println(fila4.toString());
        System.out.println(fila4.getLimite());

        
    }
}