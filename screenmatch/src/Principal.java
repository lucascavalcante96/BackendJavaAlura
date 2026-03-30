public class Principal {
    static void main() {
        Filme meuFilme = new Filme();
        meuFilme.nome = "O poderoso chefão";
        meuFilme.duracaoEmMinutos = 180;
        meuFilme.anoDeLancamento = 1970;

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);

        System.out.println(meuFilme.somaDasAvaliacoes);
        System.out.println(meuFilme.totalDeAvaliacoes);
        System.out.println(meuFilme.pegaMedia());
    }
}
