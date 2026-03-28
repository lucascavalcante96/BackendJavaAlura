public class Desconto {
    static void main() {
        double precoOriginal = 135.50;
        double percentualDesconto = (double) 15 / 100;
        double valorDoDesconto = precoOriginal*percentualDesconto;

        System.out.println("Valor do desconto: " + valorDoDesconto);

        double precoFinal = precoOriginal-valorDoDesconto;
        System.out.println("Valor final: " + precoFinal);


    }
}
