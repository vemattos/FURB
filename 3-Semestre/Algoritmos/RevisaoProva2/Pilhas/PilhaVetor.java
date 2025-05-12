package RevisaoProva2.Pilhas;

public class PilhaVetor<T> implements Pilha<T>{
    private T info[];
    private int limite;
    private int tamanho;

    @SuppressWarnings("unchecked")
    public PilhaVetor(int limite) {
        this.limite = limite;
        this.tamanho = 0;
        this.info = (T[]) new Object[limite];
    }

    @Override
    public void push(T info) {
        if (tamanho == limite) {
            throw new PilhaCheiaException();
        }
        this.info[tamanho] = info;
        tamanho ++;
    }

    @Override
    public T pop() {
        if (estaVazia()) {
            throw new PilhaVaziaException();
        }
        T valor = info[tamanho - 1];
        valor = null;
        tamanho--;
        return valor;
    }

    @Override
    public T peek() {
        if (estaVazia()) {
            throw new PilhaVaziaException();
        }
        return info[tamanho - 1];
    }

    @Override
    public boolean estaVazia() {
        if (tamanho == 0) {
            return true;
        }
        return false;
    }

    @Override
    public void liberar() {
        while (!estaVazia()) {
            this.pop();
        }
    }

    public String toString(){
        String str = "";
        for (int i = 0; i < tamanho; i++) {
            str += info[i] + ", ";
        }
        return str;
    }

    public void concatenar(PilhaVetor<T> p){
        if (this.tamanho + p.tamanho > this.limite) {
            throw new PilhaCheiaException();
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
