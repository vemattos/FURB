package arraylists;

public class PrincipalCPF {
    public static void main(String[] args) {
        Usuario umUsuario = new Usuario("21", "MAURO");
        Usuario doisUsuario = new Usuario("31", "VINICIUS");

        Sistema sis = new Sistema();
        sis.adicionaUsuario(umUsuario);
        sis.adicionaUsuario(doisUsuario);

        sis.imprimirUsuarios();
        System.out.println(sis.procuraUsuario("11"));

        System.out.println(umUsuario);
    }
}
