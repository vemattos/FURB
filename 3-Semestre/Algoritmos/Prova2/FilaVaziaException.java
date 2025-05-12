package Prova2;

public class FilaVaziaException extends RuntimeException{
    @Override
    public String getMessage() {
        return super.getMessage() + "Erro: Fila está vazia.";
    }
}
