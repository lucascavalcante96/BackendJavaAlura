package br.com.exercicios.interfaces;

public class Produto implements Vendavel {
    double preco;
    double valorTotal;

    @Override
    public double precoTotal(int quantidade) {
         valorTotal = preco * quantidade;
         return valorTotal;
    }

    @Override
    public double descontoTotal(double percentDesconto) {
        return valorTotal -= valorTotal* (percentDesconto / 100.0);
    }
}


