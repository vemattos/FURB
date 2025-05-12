package ListaEncadeada;

public class NoListaDupla<T> {
    private T info;
    private NoListaDupla proximo;
    private NoListaDupla anterior;

    public T getInfo() {
        return info;
    }
    public void setInfo(T info) {
        this.info = info;
    }
    public NoListaDupla getProximo() {
        return proximo;
    }
    public void setProximo(NoListaDupla proximo) {
        this.proximo = proximo;
    }
    public NoListaDupla getAnterior() {
        return anterior;
    }
    public void setAnterior(NoListaDupla anterior) {
        this.anterior = anterior;
    }
    @Override
    public String toString() {
        return getInfo().toString();
    }
}
