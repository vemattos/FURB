package RevisaoProva;

public class ListaGenerica1<T> {
    private T[] info;
    private int tamanho;

    @SuppressWarnings("unchecked")
    public ListaGenerica1(){
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
            str += info[i] + ", ";
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
        ListaGenerica1<Integer> lista = new ListaGenerica1<Integer>();

        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
        
        System.out.println("Dados na lista: ");
        System.out.println(lista.toString());
        System.out.println("Tamanho da lista: ");
        System.out.println(lista.getTamanho());
        System.out.println("Buscar dado na lista: ");
        System.out.println(lista.buscar(15));
        System.out.println("Buscar dado fora da lista: ");
        System.out.println(lista.buscar(30));

        ListaGenerica1<Integer> lista2 = new ListaGenerica1<Integer>();

        lista2.inserir(5);
        lista2.inserir(10);
        lista2.inserir(15);
        lista2.inserir(20);

        System.out.println("Nova lista criada: ");
        System.out.println(lista2.toString());
        System.out.println("Retirar elemento da lista: ");
        lista2.retirar(10);
        System.out.println("Lista com valor alterado: ");
        System.out.println(lista2.toString());
        System.out.println(lista2.getTamanho());

        System.out.println("Obter elemento: ");
        System.out.println(lista.obterElemento(3));
        // System.out.println("Obter elemento fora da lista: ");
        // System.out.println(lista.obterElemento(5));
        System.out.println("Testar liberar e verificar se esta vazia: ");
        lista.liberar();
        System.out.println(lista.estaVazia());

        ListaGenerica1<Integer> lista3 = new ListaGenerica1<Integer>();

        lista3.inserir(1);
        lista3.inserir(2);
        lista3.inserir(3);
        lista3.inserir(4);
        lista3.inserir(5);
        lista3.inserir(6);
        lista3.inserir(7);
        lista3.inserir(8);
        lista3.inserir(9);
        lista3.inserir(10);
        lista3.inserir(11);
        lista3.inserir(12);
        lista3.inserir(13);
        lista3.inserir(14);
        lista3.inserir(15);

        System.out.println("Lista redimensionada");
        System.out.println(lista3.toString());
        System.out.println(lista3.getTamanho());

        ListaGenerica1<Integer> lista4 = new ListaGenerica1<Integer>();
        lista4.inserir(5);
        lista4.inserir(10);
        lista4.inserir(15);
        lista4.inserir(20);
        System.out.println("Lista Generica 1: ");
        System.out.println(lista4.toString());
        lista4.inverter();
        System.out.println("Inverter lista:");
        System.out.println(lista4.toString());

        ListaGenerica1<Integer> lista5 = new ListaGenerica1<Integer>();
        lista5.inserir(5);
        lista5.inserir(10);
        lista5.inserir(15);
        lista5.inserir(20);
        lista5.inserir(25);
        System.out.println("Lista Generica2 : ");
        System.out.println(lista5.toString());
        lista5.inverter();
        System.out.println("Inverter lista:");
        System.out.println(lista5.toString());
    }

    
}
