package ClinicaPedrita;

import java.util.ArrayList;

public class Paciente extends Pessoa{
    private ArrayList<Plano> planos; //agregação passo 1

    public Paciente(String nome) {
        super(nome);
        planos = new ArrayList<Plano>();//agregação passo 2
    }

    //metodo para adicionar planos
    public void adicionarPlanos(Plano umPlano){
        planos.add(umPlano); //agregação passo 3
    }

    @Override
    public String toString(){
        String str = "";
        for (Plano umPlano : planos) {
            str += umPlano.toString(); //polimorfismo em relacao ao tipo de plano
        }
        return str;
    }
    
}
