package zProva;

import java.util.ArrayList;

public class Onibus {

    private String placa;
    private int qtPassageiros;
    private double tarifa = 5.30;

    ArrayList<Motorista> motoristas = new ArrayList<Motorista>();
    ArrayList<Passageiro> passageiros = new ArrayList<Passageiro>();
    ArrayList<Onibus> listaOnibus = new ArrayList<Onibus>();

    public Onibus(String placa, int qtPassageiros, double tarifa) {
        this.placa = placa;
        this.qtPassageiros = qtPassageiros;
        this.tarifa = tarifa;
    }
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public int getQtPassageiros() {
        return qtPassageiros;
    }
    public void setQtPassageiros(int qtPassageiros) {
        this.qtPassageiros = qtPassageiros;
    }
    public double getTarifa() {
        return tarifa;
    }
    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

    public void adicionaMotorista(Motorista motorista){
        motoristas.add(motorista);
    }
    public void adicionaPassageiros(Passageiro passageiro){
        passageiros.add(passageiro);
    }

    public ArrayList<Motorista> getMotoristas() {
        return motoristas;
    }

    public ArrayList<Passageiro> getPassageiros() {
        return passageiros;
    }

    public ArrayList<Onibus> getListaOnibus() {
        return listaOnibus;
    }

    public double calcularPreco() {
        double totalPagar = 0;

        for (Passageiro passageiro : passageiros) {
            if (passageiro instanceof Estudante) {
                totalPagar += tarifa / 2;
            } else if (passageiro instanceof Aposentado) {
                // Aposentados não pagam tarifa
            } else {
                totalPagar += tarifa;
            }
        }

        return totalPagar;
    }
    
    public int ContaAposentados(){
        int aposentados = 0;
        for (Passageiro passageiro : passageiros) {
            if (passageiro instanceof Aposentado) {
                aposentados ++;
            }
        }
        return aposentados;
    }

    @Override
    public String toString() {
        return "Placa: " + getPlaca() + "\nQuantidade de passageiros: " + getQtPassageiros() + "\nTarifa: " + getTarifa();
    }
}
