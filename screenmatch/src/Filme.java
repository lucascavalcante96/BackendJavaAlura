public class Filme {
    String nome;
    int duracaoEmMinutos;
    double somaDasAvaliacoes;
    boolean incluidoNoPlano;
    int anoDeLancamento;
    int totalDeAvaliacoes;

    void exibeFichaTecnica(){
        System.out.println("Nome do Filme: " + nome);
        System.out.println("Ano de Lancamento: " + anoDeLancamento);
    }

    void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes ++;
    }
    double pegaMedia(){
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }
}
