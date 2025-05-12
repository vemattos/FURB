package RevisaoProva;

public class NoLista<T> {

    private T info;
    @SuppressWarnings("rawtypes")
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
    @SuppressWarnings("rawtypes")
    public NoLista getProximo() {
        return proximo;
    }
    @SuppressWarnings("rawtypes")
    public void setProximo(NoLista proximo) {
        this.proximo = proximo;
    }
    @Override
    public String toString() {
        return "NoLista [info=" + info + ", proximo=" + proximo + "]";
    }
    
}
