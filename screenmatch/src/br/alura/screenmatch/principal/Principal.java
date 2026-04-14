package br.alura.screenmatch.principal;

import br.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.alura.screenmatch.calculos.FiltroRecomendacao;
import br.alura.screenmatch.modelos.Epsodio;
import br.alura.screenmatch.modelos.Filme;
import br.alura.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    static void main() {
        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        meuFilme.setDuracaoEmMinutos(180);

        Serie lost = new Serie("Lost", 2000);
        lost.setTemperoda(10);
        lost.setEpsodiosPorTemporada(10);
        lost.setMinutosPorEpsodio(50);
        System.out.println("Duração da Serie " + lost.getDuracaoEmMinutos());

        Filme outroFilme = new Filme("Avatar", 2023);
        outroFilme.setDuracaoEmMinutos(200);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Epsodio epsodio = new Epsodio();
        epsodio.setNumero(1);
        epsodio.setSerie(lost);
        epsodio.setTotalVisualizacoes(300);

        filtro.filtra(epsodio);

        var novoFilme = new Filme("Dogville", 2003);
        novoFilme.setDuracaoEmMinutos(200);
        novoFilme.avalia(10);

        ArrayList<Filme> listaFilmes = new ArrayList<>();
        listaFilmes.add(novoFilme);
        listaFilmes.add(meuFilme);
        listaFilmes.add(outroFilme);
        System.out.println("tamanho da lista " + listaFilmes.size());
        System.out.println("Primeiro filme " +  listaFilmes.get(0).getNome());
        System.out.println(listaFilmes);
    }
}
