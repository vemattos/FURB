package Lista;

public class Principal {
    public Principal(){
        Pessoa p1 = new Pessoa("Vini", 18);
        Pessoa p2 = new Pessoa("Vinicius", 19);
        Pessoa p3 = new Pessoa("VVV", 20);

        ListaEstatica<Pessoa> listapessoas = new ListaEstatica<Pessoa>();
        listapessoas.inserir(p1);
        listapessoas.inserir(p2);
        listapessoas.inserir(p3);
        listapessoas.inserir(new Pessoa("Michele", 21));

        ListaEstatica<String> listapalavras = new ListaEstatica<String>();
        listapalavras.inserir("Exemplo1");
        listapalavras.inserir("Exemplo2");
        listapalavras.inserir("Exemplo3");

        System.out.println("Lista em ordem de inserção");
        System.out.println(listapessoas.toString());
        System.out.println(listapalavras.toString());

        System.out.println("Lista em ordem inversa");
        listapessoas.inverter();
        listapalavras.inverter();
        System.out.println(listapessoas.toString());
        System.out.println(listapalavras.toString());
    }
    public static void main(String[] args) {
        new Principal();
    }
}