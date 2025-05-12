package RevisaoProva;

public class ListaDupla<T> {
    
    private NoListaDupla<T> primeiro;

    public ListaDupla() {
        this.primeiro = null;
    }

    public NoListaDupla<T> getPrimeiro() {
        return primeiro;
    }
    
    public void inserir(T info){
        NoListaDupla<T> novoNo = new NoListaDupla<>();
        novoNo.setInfo(info);
        novoNo.setProximo(this.getPrimeiro());
        novoNo.setAnterior(null);
        if (this.getPrimeiro() != null) {
            primeiro.setAnterior(novoNo);
        }
        this.primeiro = novoNo;
    }
    
    public NoListaDupla<T> buscar(T valor){
        NoListaDupla<T> noAtual = primeiro;
        while (noAtual != null) {
            if (noAtual == valor) {
                return noAtual;
            } noAtual = noAtual.getProximo();
        }
        return null;
    }

    public void retirar(T valor) {
        NoListaDupla<T> p = this.buscar(valor);
        if (p != null) {
            if (primeiro == p) {
                primeiro = p.getProximo();
            }
            p.getAnterior().setProximo(p.getProximo());
        }
        if (p.getProximo() != null) {
            p.getProximo().setAnterior(p.getAnterior());
        }
    }

    @SuppressWarnings("unchecked")
    private NoListaDupla<T> getUltimo(){
        NoListaDupla<T> noAtual = primeiro;
        while (noAtual.getProximo() != null) {
            noAtual = noAtual.getProximo();
        }
        return noAtual;
    }

    public String exibirOrdemInversa(){
        NoListaDupla<T> noAtual = this.getUltimo();
        String str = "";
        while (noAtual != null) {
            str += noAtual.toString() + ", ";
            noAtual = noAtual.getAnterior();
        }
        return str;
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


