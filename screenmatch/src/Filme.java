public class Filme {
    String nome;
    int duracaoEmMinutos;
    double avaliacao;
    boolean incluidoNoPlano;
    int anoDeLancamento;

    void exibeFichaTecnica(){
        System.out.println("Nome do Filme: " + nome);
        System.out.println("Ano de Lancamento: " + anoDeLancamento);
    }
}
