package RevisaoProva2.Pilhas;

public class PilhaVaziaException extends RuntimeException{
    @Override
    public String getMessage() {
        return super.getMessage() + "Erro: a pilha está vazia.";
    }
}
