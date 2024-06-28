package br.senai.sp.jandira.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CalculoTabuada {
    private int multiplicando;
    private int multiplicadorMin;
    private int multiplicadorMax;

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

    public List<String> calcularTabuada() {
        List<String> linhasTabuada = new ArrayList<>();
        for (int i = multiplicadorMin; i <= multiplicadorMax; i++) {

            int resultado = multiplicando * i;
            linhasTabuada.add(multiplicando + " x " + i + " = " + resultado);

        }
        return linhasTabuada;
    }
}
