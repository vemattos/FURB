package RevisaoProva2.Fila;

public class FilaCheiaException extends RuntimeException{
    @Override
    public String getMessage() {
        return super.getMessage() + "Erro: Fila está cheia.";
    }
}
