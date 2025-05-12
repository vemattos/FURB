package Prova;

public class ListaDupla<T> {
    private NoListaDupla<T> primeiro;

    public ListaDupla() {
        primeiro = null;
    }

    public NoListaDupla<T> getPrimeiro() {
        return primeiro;
    }

    public void inserir(T info) {
        NoListaDupla<T> novoNo = new NoListaDupla<>();
        novoNo.setInfo(info);
        novoNo.setProximo(primeiro);
        novoNo.setAnterior(null);

        if (primeiro != null) {
            primeiro.setAnterior(null);
        }
        primeiro = novoNo;
    }

    public NoListaDupla<T> buscar(T valor) {
        NoListaDupla<T> noAtual = primeiro;
        while (noAtual != null) {
            if (noAtual.equals(valor)) {
                return noAtual;
            }
            noAtual = noAtual.getProximo();
        }
        return null;
    }

    public void retirar(T valor) {
        NoListaDupla<T> no = new NoListaDupla<>();
        if (primeiro == no) {
            primeiro = no.getProximo();
        } else {
            no.getAnterior().setProximo(no.getProximo());
        }

        if (no.getProximo() != null) {
            no.getProximo().setAnterior(no.getAnterior());
        }
    }

    private NoListaDupla<T> getUltimo(){
        NoListaDupla<T> noAtual = primeiro;
        while (noAtual.getProximo() != null) {
            noAtual = noAtual.getProximo();
        }
        return noAtual;
    }

    @SuppressWarnings("rawtypes")
    public String exibirOrdemInversa(){
        NoListaDupla noAtual = getUltimo();
        String dados = "";
        while (noAtual != null) {
            dados += noAtual.toString() + " ";
            noAtual = noAtual.getAnterior();
        }
        return dados;
    }

    public void liberar(){
        NoListaDupla<T> noAtual = primeiro;
        while (noAtual.getProximo() != null) {
            noAtual.setAnterior(null);
            NoListaDupla<T> noAuxiliar = noAtual.getProximo();
            noAtual.setProximo(null);
            noAtual = noAuxiliar;
        }
        if (noAtual.getProximo() == null) {
            noAtual.setAnterior(null);
        }
        if (primeiro != null) {
            primeiro = null;
        }
    }

    public String toString(){
        NoListaDupla<T> noAtual = primeiro;
        String dados = "";
        while (noAtual != null) {
            dados += noAtual.getInfo().toString() + ", ";
            noAtual = noAtual.getProximo();
        }
        return dados;
    }

    public ListaDupla<T> criarSubLista(int inicio, int fim) {
        if (inicio < 0 || inicio > fim) {
            throw new IndexOutOfBoundsException();
        }
        ListaDupla<T> novaLista = new ListaDupla<>();
        NoListaDupla<T> noAtual = this.getPrimeiro();
        int posicao = 0;
        while (noAtual != null) {
            if (posicao >= inicio && posicao <= fim) {
                novaLista.inserir(noAtual.getInfo());
            }
            noAtual = noAtual.getProximo();
            posicao++;
        }
        return novaLista;
}

    public static void main(String[] args) {
        ListaDupla<Integer> lista1 = new ListaDupla<>();
        lista1.inserir(70);
        lista1.inserir(60);
        lista1.inserir(50);
        lista1.inserir(40);
        lista1.inserir(30);
        lista1.inserir(20);
        lista1.inserir(10);

        System.out.println(lista1.toString());

        ListaDupla<Integer> lista2;
        lista2 = lista1.criarSubLista(2, 5); 
        System.out.println(lista2.toString());
    }
}


