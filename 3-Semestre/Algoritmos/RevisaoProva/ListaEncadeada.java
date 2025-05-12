package RevisaoProva;

public class ListaEncadeada<T> {

    private NoLista<T> primeiro;

    // Construtor
    public ListaEncadeada() {
        this.primeiro = null;
    }

    public NoLista<T> getPrimeiro() {
        return primeiro;
    }

    public void inserir(T info){
        NoLista<T> novo = new NoLista<>();
        novo.setInfo(info);
        novo.setProximo(this.getPrimeiro());
        this.primeiro = novo;
    }

    public boolean estaVazia(){
        if (this.getPrimeiro() == null) {
            return true;
        } return false;
    }

    @SuppressWarnings("unchecked")
    public NoLista<T> buscar(T info){
        NoLista<T> novoNo = getPrimeiro();
        while (novoNo != null) {
            if (novoNo.getInfo() == info) {
                return novoNo;
            }
            novoNo = novoNo.getProximo();
        }
        return null;
    }

    @SuppressWarnings("unchecked")
    public void retirar(T info){
        NoLista<T> anterior = null;
        NoLista<T> p = this.getPrimeiro();
        while (p != null && p.getInfo() != info) {
            anterior = p;
            p = p.getProximo();
        }
        if (p != null) {
            if (p == this.getPrimeiro()) {
                this.primeiro = p.getProximo();
            } else {
                anterior.setProximo(p.getProximo());
            }
        }
    }

    @SuppressWarnings("unchecked")
    public int obterComprimento() {
        NoLista<T> p = this.getPrimeiro();
        int contador = 0;
        while (p != null) {
            contador++;
            p = p.getProximo();
        }
        return contador;
    }

    @SuppressWarnings("unchecked")
    public NoLista<T> obterNo(int posicao){
        int tamanho = this.obterComprimento() - 1;
        int contador = 0;
        NoLista<T> p = this.getPrimeiro();
        if (posicao > tamanho || posicao < 0) {
            throw new IndexOutOfBoundsException();
        } while (p != null) {
            if (contador == posicao) {
                return p;
            }
            contador++;
            p = p.getProximo();
        }
        return p;
    }

    @SuppressWarnings("unchecked")
    public String toString(){
        NoLista<T> p = this.getPrimeiro();
        String str = "";
        if (p == null) {
            return "Lista Vazia";
        }
        while (p != null) {
            str += p.getInfo() + ", ";
            p = p.getProximo();
        }
        return str;
    }

    @SuppressWarnings("unchecked")
    public ListaEncadeada<T> copiar(){
        ListaEncadeada<T> novaLista = new ListaEncadeada<T>();
        NoLista<T> p = getPrimeiro();
        while (p != null) {
            novaLista.inserir(p.getInfo());
            p = p.getProximo();
        }
        return novaLista;
    }

    @SuppressWarnings("unchecked")
    public T pegar(int posicao){
        if (posicao < 0 || posicao > this.obterComprimento() - 1) {
            throw new IndexOutOfBoundsException();
        }
        NoLista<T> p = this.getPrimeiro();
        for (int i = 0; i < posicao; i++) {
            p = p.getProximo();
        }
        return p.getInfo();
    }

    public void juntar(ListaEncadeada<T> lista){
        for (int i = 0; i <= lista.obterComprimento() - 1; i++) {
            this.inserir(lista.pegar(i));
        }
    }

    public static void main(String[] args) {
        ListaEncadeada<Integer> lista = new ListaEncadeada<Integer>();
        System.out.println("Está vazia");
        System.out.println(lista.estaVazia());
        System.out.println(lista.toString());

        System.out.println("\nInserir");
        lista.inserir(1);
        lista.inserir(2);
        lista.inserir(3);
        System.out.println(lista.toString());
        System.out.println(lista.estaVazia());

        System.out.println("\nBuscar");
        System.out.println(lista.buscar(2).toString());

        System.out.println("\nRetirar");
        lista.retirar(2);
        System.out.println(lista.toString());

        System.out.println("\nComprimento e obter nó");
        System.out.println(lista.obterComprimento());
        System.out.println(lista.obterNo(1).toString());
        // System.out.println(lista.obterNo(-1));
        // System.out.println(lista.obterNo(3));

        System.out.println("\nCopiar");
        ListaEncadeada<Integer> var = lista.copiar();
        System.out.println(var);

        lista.inserir(5);
        lista.inserir(6);
        lista.inserir(7);
        System.out.println(lista.toString());

        System.out.println("\nPegar");
        System.out.println(lista.pegar(4));

        System.out.println("\nJuntar");
        System.out.println(var.toString());
        lista.juntar(var);
        System.out.println(lista.toString());

        System.out.println("\nLista String");
        ListaEncadeada<String> lista3 = new ListaEncadeada<String>();
        lista3.inserir("a");
        lista3.inserir("b");
        lista3.inserir("c");
        System.out.println(lista3.toString());

    }
}
