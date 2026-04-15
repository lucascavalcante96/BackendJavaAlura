package br.alura.screenmatch.principal;

import br.alura.screenmatch.modelos.Filme;
import br.alura.screenmatch.modelos.Serie;
import br.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;

public class PrincipalComListas {
    static void main() {
        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        meuFilme.avalia(9);

        Filme outroFilme = new Filme("Avatar", 2023);
        outroFilme.avalia(6);

        var novoFilme = new Filme("Dogville", 2003);
        novoFilme.avalia(10);

        Serie lost = new Serie("Lost", 2000);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(novoFilme);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);

        for (Titulo item : lista) {
            System.out.println(item.getNome());
            if (item instanceof Filme filme){
                System.out.println("Classificação " + filme.getClassificacao());
            }
        }

        ArrayList<String> buscaPorArtista =  new ArrayList<>();
        buscaPorArtista.add("Adam sandler");
        buscaPorArtista.add("Henry cavill");
        buscaPorArtista.add("Ben affleck");
        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);
        System.out.println("Depois da ordenação");
        System.out.println(buscaPorArtista);

//        lista.forEach(titulo -> System.out.println(titulo));
    }
}
