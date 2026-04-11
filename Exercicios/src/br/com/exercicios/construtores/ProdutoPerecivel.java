package br.com.exercicios.construtores;

public class ProdutoPerecivel extends Produto {
    private String dataValidade;

    public ProdutoPerecivel(String nome) {
        super(nome);
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }

    static void main() {
        var produtoPerecivel = new ProdutoPerecivel("Salgadinho");
    }
}
