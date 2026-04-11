package br.com.exercicios.construtores;

import java.util.ArrayList;

public class TesteProduto extends Produto {
    static void main() {

        var iphone = new Produto();
        iphone.setNome("Iphone 17");
        iphone.setQuantidade(10);
        iphone.setPreco(6599);

        var samsung = new Produto();
        samsung.setNome("galaxy 26");
        samsung.setQuantidade(15);
        samsung.setPreco(6499);

        var xiaomi = new Produto();
        xiaomi.setNome("Poco X7");
        xiaomi.setQuantidade(9);
        xiaomi.setPreco(5999);

        ArrayList<Produto> lista = new ArrayList<>();
        lista.add(iphone);
        lista.add(samsung);
        lista.add(xiaomi);

        System.out.println("Atualmente temos " + lista.size() + " modelos de celulares");
        for (int i = 0; i < (lista.size()); i++) {
            System.out.println("Modelo: " + lista.get(i).getNome());
            System.out.println("Quantidade: " + lista.get(i).getQuantidade());
            System.out.println("Preco: " + lista.get(i).getPreco());
        }

        System.out.println(samsung);
    }
}
