package br.senai.sp.jandira.model;

import java.util.Scanner;

public class CalculoTabuada {
    private int multiplicando;
    private int multiplicadorMin;
    private int multiplicadorMax;
    private int resultado;

    Scanner scanner = new Scanner(System.in);

    public int getMultiplicando() {
        return multiplicando;
    }

    public void setMultiplicando(int multiplicando) {
        this.multiplicando = multiplicando;
    }

    public int getMultiplicadorMin() {
        return multiplicadorMin;
    }

    public void setMultiplicadorMin(int multiplicadorMin) {
        this.multiplicadorMin = multiplicadorMin;
    }

    public int getMultiplicadorMax() {
        return multiplicadorMax;
    }

    public void setMultiplicadorMax(int multiplicadorMax) {
        this.multiplicadorMax = multiplicadorMax;
    }

    public int getResultado() {
        return resultado;
    }
    public int calcular(int multiplicando,int multiplicadorMin,int multiplicadorMax){
        int resultado = 0;
        for (int i =multiplicadorMin;i <= multiplicadorMax;i++){
            resultado = multiplicando * i;
        }
        System.out.println(resultado);
        return resultado;
    }
}

    //public int calcular(int multiplicando,int multiplicadorMin,int multiplicadorMax){
    //int resultado = 0;
    //for (int i =multiplicadorMin;i <= multiplicadorMax;i++){
        //resultado = multiplicando * i;
    //}
    //System.out.println(resultado);
    //return resultado;