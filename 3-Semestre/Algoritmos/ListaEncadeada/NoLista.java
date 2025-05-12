package ListaEncadeada;

public class NoLista<T> {
    private T info;
    private NoLista proximo;

    public NoLista() {
        this.info = info;
        this.proximo = proximo;
    }

    public T getInfo() {
        return info;
    }

    public void setInfo(T info) {
        this.info = info;
    }

    public NoLista getProximo() {
        return proximo;
    }

    public void setProximo(NoLista proximo) {
        this.proximo = proximo;
    }

    @Override
    public String toString() {
        return "NoLista [info=" + info + ", proximo=" + proximo + "]";
    }
    
}
