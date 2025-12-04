package ParteIII.Aula07.collections.arraylist.simples;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSimples {
    public static void main(String[] args) {
        // criando um ArrayList para armazenar Strings (nomes de frutas)
        ArrayList<String> frutas = new ArrayList<>();

        // adicionando elementos ao ArrayList
        frutas.add("Maçã");
        frutas.add("Banana");
        frutas.add("Laranja");
        frutas.add("Manga");

        // exibindo a lista completa
        System.out.println("Lista de frutas: " + frutas);

        // acessando um elemento pelo seu índice (posição)
        // A contagem de índices começa em 0
        String primeiraFruta = frutas.get(0);
        System.out.println("A primeira fruta da lista é: " + primeiraFruta);

        // alterando um elemento em uma posição específica
        frutas.set(1, "Morango"); // Substitui "Banana" por "Morango"
        System.out.println("Lista após a alteração: " + frutas);

        // removendo um elemento
        frutas.remove("Laranja"); // Remove o elemento "Laranja"
        System.out.println("Lista após a remoção: " + frutas);

        // verificando o tamanho da lista
        System.out.println("Tamanho atual da lista: " + frutas.size());

        // percorrendo a lista com um loop "for-each"
        System.out.println("Percorrendo a lista com um loop:");
        for (String fruta : frutas) {
            System.out.println("- " + fruta);
        }

        // ordenando a lista em ordem alfabética
        Collections.sort(frutas);
        System.out.println("Lista ordenada: " + frutas);
    }
}