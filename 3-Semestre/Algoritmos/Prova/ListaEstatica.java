package Prova;


public class ListaEstatica<T> {
    private T[] info;
    private int tamanho;

    @SuppressWarnings("unchecked")
    public ListaEstatica(){
        info = (T[]) new Object[10];
    }

    @SuppressWarnings("unchecked")
    private void redimensionar(){
        T[] novaLista = (T[]) new Object[info.length + 10];
        for (int i = 0; i < info.length; i++) {
            info[i] = (T) novaLista[i];
        }
        info = novaLista;
    }

    public void inserir(T valor){
        if (info.length == tamanho) {
            this.redimensionar();
        }
        info[tamanho] = valor;
        tamanho++;
    }

    public void inserir(int posicao, T valor) {
        if (posicao > tamanho || posicao < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (info.length == tamanho) {
            this.redimensionar();
        }
        for (int i = tamanho; i > posicao; i--) {
            info[i] = info[i - 1];
        }
        info[posicao] = valor;
        tamanho++;
    }

    public void exibir(){
        for (int i = 0; i < info.length; i++) {
            System.out.println(info[i]);
        }
    }

    public int buscar(T valor){
        for (int i = 0; i < info.length; i++) {
            if (valor == info[i]) {
                return i;
            }
        }
        return -1;
    }

    public void retirar(T valor){
        int posicao = this.buscar(valor);
        for (int i = posicao + 1; i < info.length; i++) {
            info[i - 1] = info[i];
        }
        tamanho--;
    }

    @SuppressWarnings("unchecked")
    public void liberar(){
        info = (T[]) new Object[10];
        tamanho = 0;
    }

    public T obterElemento(int posicao){
        if (posicao >= 0 && posicao < tamanho) {
            return info[posicao];
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    public boolean estaVazia(){
        if (tamanho == 0) {
            return true;
        }
        return false;
    }

    public int getTamanho() {
        return tamanho;
    }

    public String toString(){
        String str = "";
        for (int i = 0; i < info.length; i++) {
            str += i + "-" + info[i] + " , ";
        }
        return str;
    }

    public void inverter(){
        T temp = null;
        int trocas = tamanho / 2;
        int esquerda = 0;
        int direita = tamanho - 1;
        while (trocas > 0) {
            temp = info[esquerda];
            info[esquerda] = info[direita];
            info[direita] = temp;
            trocas--;
            esquerda++;
            direita--;
        }
    }

    public static void main(String[] args) {
        ListaEstatica<Integer> lista = new ListaEstatica<>();

        lista.inserir(10);
        lista.inserir(20);
        lista.inserir(30);
        lista.inserir(40);
        lista.inserir(50);
        lista.inserir(2, 99);
        lista.inserir(6, 88);

        System.out.println(lista.toString());
        System.out.println("Tamanho: " + lista.getTamanho());
    }

    
}
