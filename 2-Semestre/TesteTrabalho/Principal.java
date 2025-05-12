package ZZteste;

public class Principal {
    public static void main(String[] args) {
        Advogado advogado1 = new Advogado("adv1", "aaaaaaaa", "aaaa");
        Advogado advogado2 = new Advogado("adv2", "bbbbbb", "bbbb");

        Secretaria secretaria1 = new Secretaria("sec1", "cccccc", "dddd");
        Secretaria secretaria2 = new Secretaria("dddd", "dddd", "ddddd");

        Juridica empresa = new Juridica("empresaaaaa", "aaaaa");
        Pessoa pessoa = new Fisica("vinciis", "1231");

        Tribunal tribunal = new Tribunal("tribunal", null);

        Vara vara1 = new Vara("vara1", null);
        Vara vara2 = new Vara("vara2", null);

        Audiencia audiencia1 = new Audiencia(12, null);

        Processo processo1 = new Processo(1, "processo", tribunal, vara1, null, pessoa, empresa, advogado1, secretaria2, null);
        

    }
}
