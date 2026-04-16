//Crie um ArrayList de strings e utilize um loop foreach para percorrer e imprimir cada elemento da lista

package br.com.exercicios.listas;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class ExercicioLoop {
    static void main() {
        String nome;
        String continuar;
        Scanner leitor = new Scanner(System.in);

        ArrayList<String> lista = new ArrayList<>();
        while (true) {
            System.out.println("Digite um nome para adicionar:");
            nome = leitor.nextLine();
            lista.add(nome);
            System.out.println("Deseja adicionar outro nome? [S/N]");
            continuar = leitor.nextLine();
            continuar = continuar.toUpperCase(Locale.ROOT);
            if (continuar.equals("N")) {
                break;
            }
        }
        lista.forEach(System.out::println);
    }
}
