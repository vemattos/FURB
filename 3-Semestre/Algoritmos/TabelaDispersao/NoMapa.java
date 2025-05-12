package TabelaDispersao;

public class NoMapa<T> {

    private String chave;
    private T info;

    public String getChave() {
        return chave;
    }

    public void setChave(String chave) {
        this.chave = chave;
    }

    public T getInfo() {
        return info;
    }

    public void setInfo(T info) {
        this.info = info;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NoMapa<?> noMapa = (NoMapa<?>) o;
        return chave.equals(noMapa.chave);
    }
}
