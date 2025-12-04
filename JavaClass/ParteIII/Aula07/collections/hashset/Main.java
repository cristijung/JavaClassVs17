package ParteIII.Aula07.collections.hashset;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        //criação de uma coleção genérica de LibrariItems
        //é um polimorfismo pq permite misturar objetos diferentes (Book e Magazine)
        Set<LibraryItem> libraryItems = new HashSet<>();

        LibraryItem book1 = new Book("1984", "George Orwell");
        LibraryItem book2 = new Book("Drácula", "Bram Stoker");
        LibraryItem book3 = new Book("Drácula", "Bram Stoker");
        LibraryItem magazine1 = new Magazine("National Geographic", "Junho 2024");

        libraryItems.add(book1);
        libraryItems.add(book2);
        libraryItems.add(book3); // é rejeitado por causa do equals e hascode
        libraryItems.add(magazine1);


        LibraryItem bookDuplicate = new Book("1984", "George Orwell");
        boolean added = libraryItems.add(bookDuplicate);
        System.out.println("Livro duplicado adicionado: " + added);


        for (LibraryItem item : libraryItems) {
            item.checkOut();
        }


        for (LibraryItem item : libraryItems) {
            item.returnItem();
        }
    }
}
