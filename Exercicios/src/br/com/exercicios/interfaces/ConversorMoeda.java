package br.com.exercicios.interfaces;

public class ConversorMoeda implements ConversaoFinanceira {
    private double dolar;
    private double real;

    public double getDolar() {
        return dolar;
    }

    public void setDolar(double dolar) {
        this.dolar = dolar;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    @Override
    public double converterDolarParaReal() {
        return dolar * real;
    }
}
