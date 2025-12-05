package ParteIII.Aula07.collections;

import java.util.ArrayList;
import java.util.List;

// Classe do Objeto --> O "Item"
class Musica {
    private String titulo;
    private String artista;

    public Musica(String titulo, String artista) {
        this.titulo = titulo;
        this.artista = artista;
    }

    // toString facilita a impressão do objeto no console
    @Override
    public String toString() {
        return titulo + " - " + artista;
    }
}

// Classe que tem a Coleção --> O "Gerenciador"
class Playlist {
    private String nome;
    // AQUI ESTÁ A COLEÇÃO: Uma lista apenas de objetos 'Musica'
    private List<Musica> listaDeMusicas;

    public Playlist(String nome) {
        this.nome = nome;
        // inicializamos como ArrayList --> implementação padrão
        this.listaDeMusicas = new ArrayList<>();
    }

    public void adicionarMusica(Musica musica) {
        this.listaDeMusicas.add(musica);
        System.out.println("Adicionado: " + musica);
    }

    public void tocarTudo() {
        System.out.println("\n--- Tocando playlist: " + this.nome + " ---");

        if (listaDeMusicas.isEmpty()) {
            System.out.println("A playlist está vazia!");
        } else {
            // 'for-each' para percorrer a coleção
            for (Musica m : listaDeMusicas) {
                System.out.println("Tocando agora: " + m);
                // o 'm' aqui chama automaticamente o metodo toString()
            }
        }
        System.out.println("-----------------------------------");
    }

    public int getQuantidade() {
        return listaDeMusicas.size();
    }
}

// Classe Main
public class SistemaDeMusica {
    public static void main(String[] args) {
        // criando a Playlist --> O container
        Playlist minhaPlaylist = new Playlist("Músicas para Programar");

        // criando algumas músicas --> Os objetos
        Musica m1 = new Musica("Bohemian Rhapsody", "Queen");
        Musica m2 = new Musica("Billie Jean", "Michael Jackson");
        Musica m3 = new Musica("War Pigs", "Black Sabbath");

        // add os objetos dentro da coleção da classe
        minhaPlaylist.adicionarMusica(m1);
        minhaPlaylist.adicionarMusica(m2);
        minhaPlaylist.adicionarMusica(m3);

        // testando o comportamento
        System.out.println("Total de músicas: " + minhaPlaylist.getQuantidade());

        // listando todos os itens da coleção
        minhaPlaylist.tocarTudo();
    }
}