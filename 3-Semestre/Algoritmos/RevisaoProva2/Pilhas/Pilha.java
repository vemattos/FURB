package RevisaoProva2.Pilhas;

public interface Pilha<T> {
    void push(T info);
    T pop();
    T peek();
    boolean estaVazia();
    void liberar();
}
