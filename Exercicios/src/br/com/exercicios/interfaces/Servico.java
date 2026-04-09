package br.com.exercicios.interfaces;

public class Servico implements Vendavel {
    double precoHora;
    double valorTotal;
    double horas;

    @Override
    public double precoTotal( int quantidade) {
        valorTotal = precoHora * quantidade;
        return valorTotal;
    }

    @Override
    public double descontoTotal(double percentDesconto) {
        return valorTotal -= valorTotal * (percentDesconto/100.0);
    }
}
