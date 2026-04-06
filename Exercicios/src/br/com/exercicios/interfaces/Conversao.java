package br.com.exercicios.interfaces;

public class Conversao extends ConversorMoeda{
    static void main() {
        ConversorMoeda moeda = new ConversorMoeda();
        moeda.setDolar(5.6);
        moeda.setReal(50);

        System.out.println(moeda.converterDolarParaReal());
    }
}
