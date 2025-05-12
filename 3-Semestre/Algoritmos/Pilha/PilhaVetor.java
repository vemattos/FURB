package Pilha;


public class PilhaVetor<T> implements Pilha<T> {
    public T[] info;
    private int limite;
    public int tamanho;

    @SuppressWarnings("unchecked")
    public PilhaVetor(int limite) {
        this.limite = limite;
        this.info = (T[]) new Object[limite];
        this.tamanho = 0;
    }

    @Override
    public void push(T info) {
        String s = (String) info;
        if (s.length() <= 1) {
            return;
        }
        if (tamanho >= limite) {
            throw new PilhaCheiaException("A pilha está cheia.");
        }
        this.info[tamanho] = info;
        tamanho++;
    }

    @Override
    public T pop() {
        if (estaVazia()) {
            throw new PilhaVaziaException("A pilha está vazia.");
        }
        T valor = info[tamanho - 1];
        info[tamanho - 1] = null;
        tamanho--;
        return valor;
    }

    @Override
    public T peek() {
        if (estaVazia()) {
            throw new PilhaVaziaException("A pilha está vazia.");
        }
        return info[tamanho - 1];
    }

    @Override
    public boolean estaVazia() {
        return tamanho == 0;
    }

    @Override
    public void liberar() {
        while (!estaVazia()) {
            this.pop();
        }
    }

    @Override
    public String toString() {
        String resultado = "";
        for (int i = 0; i < tamanho; i++) {
            resultado += info[i];
            if (i < tamanho - 1) {
                resultado += ",";
            }
        }
        return resultado;
    }

    public void concatenar(PilhaVetor<T> p) {
        if (this.tamanho + p.tamanho > this.limite) {
            throw new PilhaCheiaException("Não há capacidade suficiente para concatenar as pilhas.");
        }
        for (int i = 0; i < p.tamanho; i++) {
            this.push(p.info[i]);
        }
    }

    public static void main(String[] args) {
        PilhaVetor<Integer> pilha1 = new PilhaVetor<>(5);
        PilhaVetor<Integer> pilha2 = new PilhaVetor<>(5);

        pilha1.push(1);
        pilha1.push(2);
        pilha1.push(3);

        pilha2.push(4);
        pilha2.push(5);

        System.out.println("Pilha 1: " + pilha1);
        System.out.println("Pilha 2: " + pilha2);

        pilha1.concatenar(pilha2);

        System.out.println("Pilha 1 após concatenação: " + pilha1);

        pilha1.pop();
        System.out.println("Pilha 1 após pop: " + pilha1);

        System.out.println("Topo da Pilha 1: " + pilha1.peek());

        pilha1.liberar();
        System.out.println("Pilha 1 após liberar: " + pilha1);
    }
}