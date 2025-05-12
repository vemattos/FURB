package TabelaDispersao;

import ListaEncadeada.ListaEncadeada;
import ListaEncadeada.NoLista;

public class MapaDispersao<T> {

    public ListaEncadeada<NoMapa<T>>[] info;

    public MapaDispersao(int tamanho) {
        info = new ListaEncadeada[tamanho];
    }

    private int calcularHash(String chave) {
        return Math.abs(chave.hashCode() % info.length);
    }

    public void inserir(String chave, T dado) {
        int indice = calcularHash(chave);

        if (info[indice] == null) {
            info[indice] = new ListaEncadeada<>();
        }

        NoMapa<T> noExistente = buscarNo(indice, chave);
        if (noExistente != null) {
            if (noExistente.getInfo() instanceof Integer) {
                Integer novoValor = (Integer) noExistente.getInfo() + (Integer) dado;
                noExistente.setInfo((T) novoValor);
            } else {
                noExistente.setInfo(dado);
            }
        } else {
            NoMapa<T> no = new NoMapa<>();
            no.setChave(chave);
            no.setInfo(dado);
            info[indice].inserir(no);
        }
    }

    private NoMapa<T> buscarNo(int indice, String chave) {
        if (info[indice] != null) {
            NoLista<NoMapa<T>> noAtual = info[indice].getPrimeiro();
            while (noAtual != null) {
                if (noAtual.getInfo().getChave().equals(chave)) {
                    return noAtual.getInfo();
                }
                noAtual = noAtual.getProximo();
            }
        }
        return null;
    }

    public T buscar(String chave) {
        int indice = calcularHash(chave);
        if (info[indice] != null) {
            NoMapa<T> noMapa = new NoMapa<>();
            noMapa.setChave(chave);

            NoLista<NoMapa<T>> no;
            no = info[indice].buscar(noMapa);
            if (no != null) {
                return no.getInfo().getInfo();
            }
        }
        return null;
    }

    public void remover(String chave) {
        int indice = calcularHash(chave);

        if (info[indice] != null) {
            NoMapa<T> no = new NoMapa<>();
            no.setChave(chave);
            info[indice].retirar(no);
        }
    }

    public void realocarMapa(int novoTamanho) {
        ListaEncadeada<NoMapa<T>>[] antigo = info;
        info = new ListaEncadeada[novoTamanho];

        for (int i = 0; i < antigo.length; i++) {
            if (antigo[i] != null) {
                NoLista<NoMapa<T>> p = antigo[i].getPrimeiro();
                while (p != null) {
                    inserir(p.getInfo().getChave(), p.getInfo().getInfo());
                    p = p.getProximo();
                }
            }
        }
    }

    private boolean ehPrimo(int num) {
        int qtdeDivisores = 0;
        for (int i = 1; i <= num; i++) {
            if (num % 2 == 0) {
                qtdeDivisores++;
                if (qtdeDivisores > 2)
                    break;
            }
        }

        return qtdeDivisores == 2;
    }

    private int buscarProximoPrimo(int num) {
        while (!ehPrimo(num)) {
            num++;
        }
        return num;
    }

    public double calcularFatorCarga() {
        int quantidadeTotal = 0;
        for (int i = 0; i < info.length; i++) {
            if (info[i] != null) {
                quantidadeTotal += info[i].obterComprimento();
            }
        }

        return (1.0 * quantidadeTotal) / info.length;
    }
}
