package parteIII.mvc.com.loja;


import parteIII.mvc.com.loja.controller.ProdutoController;


public class AppLoja {
    public static void main(String[] args) {
        System.out.println("Iniciando Sistema E-commerce Moda Java...");

        ProdutoController controller = new ProdutoController();
        controller.iniciarSistema();
    }
}