import java.util.Scanner;

public class LoopWhile {
    static void main() {
        Scanner leitura = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;
        int totalDeNotas = 0;

        while (nota != -1) {
            System.out.println("Digite a nota ou -1 para sair: ");
            nota = leitura.nextDouble();
            if (nota != -1) {
                mediaAvaliacao += nota;
                totalDeNotas++;
            }
        }
        mediaAvaliacao = mediaAvaliacao / totalDeNotas;

        if (totalDeNotas == 0) {
            System.out.println("Filme não avaliado!");
        } else {
            System.out.println("Média Avaliacao: " + mediaAvaliacao);
        }

    }
}
