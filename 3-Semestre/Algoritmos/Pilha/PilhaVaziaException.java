package Pilha;

public class PilhaVaziaException extends RuntimeException{
    
    public PilhaVaziaException(String string) {
        //TODO Auto-generated constructor stub
    }

    @Override
    public String getMessage(){
        return super.getMessage() + "Erro: a pilha está vazia.";
    }
}
