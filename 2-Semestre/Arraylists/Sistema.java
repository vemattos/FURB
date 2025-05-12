package arraylists;

import java.util.HashMap;

public class Sistema {
    int numUsuarios;

    public Sistema() {
        this.numUsuarios = 0;
    }

    HashMap<Integer , Usuario > usuarios = new HashMap<Integer, Usuario>();

    public void adicionaUsuario(Usuario usuario){
        usuarios.put(numUsuarios, usuario);
        numUsuarios++;
    }

     public void imprimirUsuarios() {
        for (int i = 0; i < numUsuarios; i++) {
            Usuario u = usuarios.get(i);
            System.out.println(u.getNome()+ "\n");
        }
    }

    public String procuraUsuario(String cpf){
        String resposta = "Não está no sistema";
        for (int i = 0; i < usuarios.size(); i++) {
            Usuario u = usuarios.get(i);
            if (u.getCpf().equals(cpf)) {
                resposta = "Está no sistema";            }
        }
        return resposta;
    }
}
