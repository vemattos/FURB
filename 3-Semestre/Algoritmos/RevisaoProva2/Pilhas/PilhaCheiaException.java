package RevisaoProva2.Pilhas;

public class PilhaCheiaException extends RuntimeException {
    @Override
    public String getMessage() {
        return super.getMessage() + "Erro: a pilha está cheia.";
    }
}
