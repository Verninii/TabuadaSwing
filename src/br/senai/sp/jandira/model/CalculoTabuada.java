package br.senai.sp.jandira.model;

import java.util.ArrayList;
import java.util.List;
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
    public List<Integer> calcular(int multiplicando, int multiplicadorMin, int multiplicadorMax) {
        List<Integer> resultados = new ArrayList<>();


        for (int i = multiplicadorMin; i <= multiplicadorMax; i++) {
            int resultado = multiplicando * i;
            resultados.add(resultado);
        }


        return resultados;
    }
}
