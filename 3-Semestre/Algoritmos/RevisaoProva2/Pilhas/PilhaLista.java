package RevisaoProva2.Pilhas;

import ListaEncadeada.ListaEncadeada;

public class PilhaLista<T> implements Pilha<T> {

    private ListaEncadeada lista;

    public PilhaLista(ListaEncadeada lista) {
        this.lista = new ListaEncadeada();
    }

    @Override
    public void push(T info) {
        lista.inserir(info);
    }

    @Override
    public T pop() {
        T valor;
        valor = peek();
        lista.retirar(valor);
        return valor;
    }

    @Override
    public T peek() {
        return (T) lista.getPrimeiro().getInfo();
    }

    @Override
    public boolean estaVazia() {
        return lista.estaVazia();
    }

    @Override
    public void liberar() {
        lista.liberar();
    }

    public static void main(String[] args) {
        PilhaLista<Integer> pilha = new PilhaLista<Integer>(null);

        pilha.push(10);
        pilha.push(20);
        pilha.push(30);

        System.out.println("Topo da pilha: " + pilha.peek()); // Deve imprimir 30

        System.out.println("Elemento removido: " + pilha.pop()); // Deve remover 30

        System.out.println("Topo da pilha: " + pilha.peek()); // Deve imprimir 20

        System.out.println("Pilha está vazia? " + pilha.estaVazia()); // Deve imprimir false

        pilha.liberar();
        System.out.println("Pilha está vazia após liberar? " + pilha.estaVazia()); // Deve imprimir true
    }
    
}
