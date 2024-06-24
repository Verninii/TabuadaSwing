package br.senai.sp.jandira.model;

public class CalculoTabuada {
    private double multiplicando ;
    private double multiplicadorMin ;
    private double multiplicadorMax ;
    private double resultado ;

    public double getMultiplicando() {
        return multiplicando;
    }

    public void setMultiplicando(double multiplicando) {
        this.multiplicando = multiplicando;
    }

    public double getMultiplicadorMin() {
        return multiplicadorMin;
    }

    public void setMultiplicadorMin(double multiplicadorMin) {
        this.multiplicadorMin = multiplicadorMin;
    }

    public double getMultiplicadorMax() {
        return multiplicadorMax;
    }

    public void setMultiplicadorMax(double multiplicadorMax) {
        this.multiplicadorMax = multiplicadorMax;
    }

    public double getResultado() {
        while(this.multiplicadorMin <= this.multiplicadorMax){
            this.resultado = this.multiplicando * this.multiplicadorMin;
            this.multiplicadorMin++;
        }
        return resultado;
    }
}