package Projetos;
//Vinicius Mattos

import java.text.DecimalFormat;

public class Teste {
    public static void main(String[] args) {
        DecimalFormat df_2 = new DecimalFormat("0.00");

        Telhado[] telhado = new Telhado[2];
        telhado[0] = new Telhado(8, 7.20);
        telhado[1] = new Telhado(8, 4.50);

        System.out.println(df_2.format(telhado[0].calcularVazao()) + " litros por segundo");
        System.out.println("O diâmetro da calha deve ser " + telhado[0].cachas() + " mm");
        System.out.println(telhado[0].areaTelhado() + " metros");
        System.out.println(df_2.format(telhado[1].calcularVazao()) + " litros por segundo");
        System.out.println("O diâmetro da calha deve ser " + telhado[1].cachas() + " mm");
        System.out.println(telhado[1].areaTelhado() + " metros");
        //System.out.println(telhado[2].maiorTelhado()); metodo não deu certo
        if (telhado[0].areaTelhado() > telhado[1].areaTelhado()) {
           System.out.println("O telhado com " + telhado[0].areaTelhado() + " metros, tem a maior área");
        } else {
           System.out.println("O telhado " + telhado[1].areaTelhado() + " metros, tem a maior área");
        }
    }
}

