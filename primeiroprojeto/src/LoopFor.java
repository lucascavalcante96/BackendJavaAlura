import java.util.Scanner;

public class LoopFor {
    static void main() {
        Scanner leitura = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Digite a sua nota para o filme: ");
            nota = leitura.nextDouble();
            mediaAvaliacao += nota;
        }
        mediaAvaliacao = mediaAvaliacao / 3;
        System.out.println("A nota do filme é: " + mediaAvaliacao);
    }
}
