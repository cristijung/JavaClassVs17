package parteIII.mvc.com.loja.model;

// seriam os dados do BD
import java.util.Arrays;
import java.util.List;

public class ProdutoRepository {
    // Aqui temos a simulação do banco de dados
    public List<Produto> buscarTodos() {
        return Arrays.asList(
                new Produto("Camiseta Básica", "Roupas", 29.90, true),
                new Produto("Calça Jeans", "Roupas", 120.00, true),
                new Produto("Tênis Esportivo", "Calçados", 250.00, true),
                new Produto("Relógio", "Acessórios", 150.00, false), // inativo
                new Produto("Meias", "Roupas", 15.00, true),
                new Produto("Boné", "Acessórios", 35.00, true)
        );
    }
}