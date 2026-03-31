package br.com.alura.screenmatch.modelos;

public class Serie extends Titulo {
    private int temperoda;
    private int epsodiosPorTemporada;
    private boolean ativa;
    private int minutosPorEpsodio;

    public int getTemperoda() {
        return temperoda;
    }

    public void setTemperoda(int temperoda) {
        this.temperoda = temperoda;
    }

    public int getEpsodiosPorTemporada() {
        return epsodiosPorTemporada;
    }

    public void setEpsodiosPorTemporada(int epsodiosPorTemporada) {
        this.epsodiosPorTemporada = epsodiosPorTemporada;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public int getMinutosPorEpsodio() {
        return minutosPorEpsodio;
    }

    public void setMinutosPorEpsodio(int minutosPorEpsodio) {
        this.minutosPorEpsodio = minutosPorEpsodio;
    }

    @Override
    public int getDuracaoEmMinutos() {
        return temperoda * epsodiosPorTemporada * minutosPorEpsodio;
    }
}
