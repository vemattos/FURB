package Prova2;

public interface Fila<T> {
    void inserir(T valor);
    boolean estaVazia();
    T peek();
    T retirar();
    void liberar();
}
