package ListaEncadeada;

public class ListaDupla<T> {
    private NoListaDupla<T> primeiro;

    public ListaDupla() {
        primeiro = null;
    }

    public NoListaDupla<T> getPrimeiro() {
        return primeiro;
    }

    /* Deve armazenar o dado fornecido como argumento na estrutura de dados */
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

    /*
     * Deve procurar na lista encadeada se há um nó cujo conteúdo seja igual à
     * variável valor (utilizar
     * igualdade de valores). Caso seja localizado, deverá retornar este nó (objeto
     * da classe NoListaDupla). Se não for
     * localizado, deverá retornar null;
     */
    @SuppressWarnings("unchecked")
    public NoListaDupla<T> buscar(T valor) {
        NoListaDupla noAtual = primeiro;
        while (noAtual != null) {
            if (noAtual.equals(valor)) {
                return noAtual;
            }
            noAtual = noAtual.getProximo();
        }
        return null;
    }

    /*
     * Deve retirar um nó da lista que contenha o valor informado como parâmetro
     * para este método;
     */
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

    /*
     * deve exibir o conteúdo armazenado nos nós da lista encadeada de forma que
     * primeiro
     * seja exibido o valor do último nó da lista e por último seja exibido o valor
     * do primeiro nó da lista.
     */
    @SuppressWarnings("unchecked")
    private NoListaDupla<T> getUltimo(){
        NoListaDupla noAtual = primeiro;
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

    /*
     * Deverá limpar a estrutura de dados. Ao invés de simplesmente atribuir null
     * para a variável de
     * instância primeiro, remova todos os encadeamentos dos nós, isto é, atribua
     * null para a associação proximo e
     * anterior em todos os nós da lista;
     */
    public void liberar(){
        NoListaDupla noAtual = primeiro;
        while (noAtual.getProximo() != null) {
            noAtual.setAnterior(null);
            NoListaDupla noAuxiliar = noAtual.getProximo();
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
        NoListaDupla noAtual = primeiro;
        String dados = "";
        while (noAtual != null) {
            dados += noAtual.getInfo().toString() + ", ";
            noAtual = noAtual.getProximo();
        }
        return dados;
    }

    public static void main(String[] args) {

        ListaDupla<Integer> lista = new ListaDupla<>();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);


        System.out.println("Inserção - Ordem direta: " + lista.toString()); // Esperado: 20, 15, 10, 5,


        System.out.println("Inserção - Ordem inversa: " + lista.exibirOrdemInversa()); // Esperado: 5, 10, 15, 20
    

        ListaDupla<Integer> sla = new ListaDupla<>();
    

        // Buscar o elemento 20, que foi o último inserido (primeiro na lista)
        NoListaDupla<Integer> no = lista.buscar(20);
        
        String resultado;
        if (no != null) {
            resultado = "Elemento encontrado: " + no;
        } else {
            resultado = "Elemento não encontrado";
        }
        
        System.out.println(resultado); // Esperado: Elemento encontrado: 20

          
        lista.retirar(20);

        // Exibindo a lista após remover o elemento 20
        System.out.println("\nLista após remover o elemento 20:");
        System.out.println(lista.toString());


        lista.liberar();

        // Exibindo a lista após liberar os dados
        System.out.println("\nLista após liberar os dados:");
        System.out.println(lista.toString()); // Esperado: Lista vazia
    }
}

