package ParteIII.Aula07.generics.exemplo;

public class Produto implements Comparable<Produto> {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Produto [nome= " + nome + ", preço= " + preco + "]";
    }

    @Override
    public int compareTo(Produto outroProduto) {
        return Double.compare(this.preco, outroProduto.getPreco());
    }
}
