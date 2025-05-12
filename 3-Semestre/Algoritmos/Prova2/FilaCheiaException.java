package Prova2;

public class FilaCheiaException extends RuntimeException{
    @Override
    public String getMessage() {
        return super.getMessage() + "Erro: Fila está cheia.";
    }
}

