package parteIII.Aula07.generics.exemplo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProgramaProduto {

    public static void main(String[] args) {
        List<Produto> lista = new ArrayList<>();
        lista.add(new Produto("Notebook", 7899.99));
        lista.add(new Produto("Mouse", 129.99));
        lista.add(new Produto("Teclado", 234.99));
        lista.add(new Produto("Monitor", 1345.99));

        System.out.println("Lista antes de ordenar");
        System.out.println(lista);

        Collections.sort(lista);
        System.out.println("\nLista depois de ordenar (pelo preço): ");
        System.out.println(lista);

    }
}
