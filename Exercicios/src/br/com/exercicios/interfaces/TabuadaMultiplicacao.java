package br.com.exercicios.interfaces;

public class TabuadaMultiplicacao implements Tabuada {
    private int valor;
    private int count = 1;

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    @Override
    public int mostrarTabuada() {
        while (count <= 10) {
            int resultado;
            resultado = valor * count;
            System.out.println(valor + " X " + count + " = " + resultado);
            count++;
        }
        return 0;
    }
}
