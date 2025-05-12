package RevisaoProva;

public class ListaEstatica1 {
    private int info[];
    private int tamanho;
    
    public ListaEstatica1() {
        info = new int[10];
		tamanho = 0;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void inserir(int valor){
        if (tamanho == info.length) {
            this.redimensionar();
        }
        info[tamanho] = valor;
        tamanho++;
    }

    private void redimensionar(){
        int[] novo = new int[info.length + 10];
        for (int i = 0; i < info.length; i++) {
            novo[i] = info[i];
        }
        info = novo;
    }

    public void exibir(){
        for (int i = 0; i < info.length; i++) {
            System.out.println(info[i]);
        }
    }

    public void liberar(){
        info = new int[10];
        tamanho = 0;
    }

    public boolean estaVazia(){
        if (tamanho == 0) {
            return true;
        }
        return false;
    }

    public String toString(){
        String str = "";
        for (int i = 0; i < info.length; i++) {
            str += info[i] + ", ";
        }
        return str;
    }

    public int buscar(int valor){
        for (int i = 0; i < info.length; i++) {
            if (info[i] == valor) {
                return i;
            }
        }
        return -1;
    }

    public void retirar(int valor){
        int posicao = this.buscar(valor);
        if (posicao > -1) {
            for (int i = posicao + 1; i < info.length; i++) {
                info[i - 1] = info[i];
            }
            tamanho--;
        }
    }

    public int obterElemento(int posicao){
        if (posicao >= 0 && posicao < tamanho) { //entender
            return info[posicao];
        }
        throw new IndexOutOfBoundsException();
    }

    public static void main(String[] args) {
        ListaEstatica1 lista = new ListaEstatica1();

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

        ListaEstatica1 lista2 = new ListaEstatica1();

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

        ListaEstatica1 lista3 = new ListaEstatica1();

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
    }
}