package parteIII.mvc.com.loja.view;

// aqui é a tela/impressão
import parteIII.mvc.com.loja.model.Produto; // de novo
import java.util.List;
import java.util.Map;

public class ProdutoView {

    public void mostrarTitulo(String titulo) {
        System.out.println("\n=== " + titulo + " ===");
    }

    public void listarItens(List<String> itens) {
        itens.forEach(System.out::println);
    }

    public void listarAgrupado(Map<String, List<Produto>> mapa) {
        mapa.forEach((categoria, lista) -> {
            System.out.println("> " + categoria.toUpperCase());
            lista.forEach(p -> System.out.println("  - " + p.getNome()));
        });
    }

    public void mostrarTotal(double total) {
        System.out.printf("Valor Total em Caixa: R$ %.2f%n", total);
    }

    public void mostrarResultadoBusca(String termo, Produto produto) {
        if (produto != null) {
            System.out.println("✅ Encontrado: " + produto);
        } else {
            System.out.println("❌ O produto '" + termo + "' não existe no estoque.");
        }
    }
}