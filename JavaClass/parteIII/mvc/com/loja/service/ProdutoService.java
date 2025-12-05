package parteIII.mvc.com.loja.service;
// Aqui vai a lógica
// StreamAPI - Java
// IMPORTANTE!!
// A IMPORTAÇÃO ESTÁ SENDO FEITA ASSIM PQ ESTAMOS DENTRO DE UM PROJETO
// DE CÓDIGO DE AULA
import parteIII.mvc.com.loja.model.Produto;
import parteIII.mvc.com.loja.model.ProdutoRepository;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class ProdutoService {

    private ProdutoRepository repository = new ProdutoRepository();

    // Filtrar e Transformar --> Stream
    public List<String> obterVitrineRoupas() {
        return repository.buscarTodos().stream()
                .filter(p -> p.getCategoria().equals("Roupas")) // apenas roupas
                .filter(Produto::isAtivo)                       // apenas ativos
                .sorted(Comparator.comparing(Produto::getPreco))// do menor para maior preço
                .map(p -> p.getNome() + " - R$ " + p.getPreco()) // transforma em String formatada
                .collect(Collectors.toList());
    }

    // Agrupar --> Stream
    public Map<String, List<Produto>> obterProdutosPorCategoria() {
        return repository.buscarTodos().stream()
                .collect(Collectors.groupingBy(Produto::getCategoria));
    }

    // Cálculo --> Stream
    public double calcularTotalEstoqueAtivo() {
        return repository.buscarTodos().stream()
                .filter(Produto::isAtivo)
                .mapToDouble(Produto::getPreco)
                .sum();
    }

    // Busca segura --> é optional
    public Optional<Produto> buscarPorNome(String nome) {
        return repository.buscarTodos().stream()
                .filter(p -> p.getNome().equalsIgnoreCase(nome))
                .findFirst();
    }
}

// quando vemos '::' chamamos de metodo de referência --> é uma forma mais resumida de escrever uma expressão lambda