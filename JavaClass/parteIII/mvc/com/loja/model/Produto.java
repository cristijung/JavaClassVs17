package parteIII.mvc.com.loja.model;
public class Produto {
    private String nome;
    private String categoria;
    private double preco;
    private boolean isAtivo;

    public Produto(String nome, String categoria, double preco, boolean isAtivo) {
        this.nome = nome;
        this.categoria = categoria;
        this.preco = preco;
        this.isAtivo = isAtivo;
    }

    // getters
    public String getNome() { return nome; }
    public String getCategoria() { return categoria; }
    public double getPreco() { return preco; }
    public boolean isAtivo() { return isAtivo; }

    @Override
    public String toString() {
        return String.format("%s | %s | R$ %.2f", nome, categoria, preco);
    }
}