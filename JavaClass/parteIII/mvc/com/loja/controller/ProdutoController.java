package parteIII.mvc.com.loja.controller;
// aqui é controlador - o maestro

// IMPORTANTE!!
// A IMPORTAÇÃO ESTÁ SENDO FEITA ASSIM PQ ESTAMOS DENTRO DE UM PROJETO
// DE CÓDIGO DE AULA
import parteIII.mvc.com.loja.service.ProdutoService;
import parteIII.mvc.com.loja.view.ProdutoView;

public class ProdutoController {

    private ProdutoService service = new ProdutoService();
    private ProdutoView view = new ProdutoView();

    public void iniciarSistema() {
        // relatório de vitrine
        view.mostrarTitulo("VITRINE DE ROUPAS (Barato -> Caro)");
        var vitrine = service.obterVitrineRoupas();
        view.listarItens(vitrine);

        // relatório de categorias
        view.mostrarTitulo("ESTOQUE POR CATEGORIA");
        var categorias = service.obterProdutosPorCategoria();
        view.listarAgrupado(categorias);

        // relatório financeiro
        view.mostrarTitulo("FINANCEIRO");
        double total = service.calcularTotalEstoqueAtivo();
        view.mostrarTotal(total);

        // testando a busca com optional
        view.mostrarTitulo("BUSCA DE PRODUTOS");
        buscarEExibir("Calça Jeans"); // existe
        buscarEExibir("PlayStation 5"); // não existe
    }

    private void buscarEExibir(String nome) {
        // usa o Optional do service
        service.buscarPorNome(nome)
                .ifPresentOrElse(
                        produto -> view.mostrarResultadoBusca(nome, produto), // se achou
                        () -> view.mostrarResultadoBusca(nome, null)          // se não achou
                );
    }
}
