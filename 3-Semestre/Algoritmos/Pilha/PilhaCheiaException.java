package Pilha;

public class PilhaCheiaException extends RuntimeException {
    
    public PilhaCheiaException(String string) {
        //TODO Auto-generated constructor stub
    }

    @Override
    public String getMessage(){
        return super.getMessage() + "Erro: a pilha está cheia.";
    }
}
