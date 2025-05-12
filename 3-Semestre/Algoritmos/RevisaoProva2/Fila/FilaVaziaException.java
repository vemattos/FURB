package RevisaoProva2.Fila;

public class FilaVaziaException extends RuntimeException{
    @Override
    public String getMessage() {
        return super.getMessage() + "Erro: Fila está vazia.";
    }
}
