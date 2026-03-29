import java.util.Random;
import java.util.Scanner;

public class Advinhacao {
    static void main() {
        Scanner input = new Scanner(System.in);
        int numeroGerado = new Random().nextInt(100);
        System.out.println("Digite um número entre 1 e 100: ");
        int numero = input.nextInt();
        for (int i = 0; i < 5; i++) {
            if (numero == numeroGerado) {
                System.out.println("Parabéns você acertou !!!");
            } else if (numero < numeroGerado) {
                System.out.println("O número que você digitou é menor do que o Número Correto!");
            } else {
                System.out.println("O número que você digitou é Maior que o Número Correto!");
            }
            numero = input.nextInt();
        }
        System.out.println(numeroGerado);
    }
}
