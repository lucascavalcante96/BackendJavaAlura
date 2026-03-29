import java.util.Scanner;

public class Leitura {
    static void main() {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite seu filme favorito: ");
        String nome = leitura.nextLine();

        System.out.println("Digite o ano de lançamento: ");
        int anoLancamento = leitura.nextInt();

        System.out.println("Digite sua avaliação: ");
        double avaliacao = leitura.nextDouble();

        System.out.println("Seu filme favorito é:" + nome);
        System.out.println("O ano de lançamento foi: " + anoLancamento);
        System.out.println("O avaliacao foi: " + avaliacao);
    }
}
