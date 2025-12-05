package parteI.Aula02;

import java.util.Scanner;

public class ScannerExemplo {
    public static void main(String[] args) {
        //criação do objeto scanner - p ler a entrada do console
        Scanner ler = new Scanner(System.in);

        //leitura de uma string
        System.out.println("Digite uma palavra: ");
        String palavra = ler.next();
        System.out.println("Você digitou a palavra: " + palavra);

        //limpar o buffer de entrada
        ler.nextLine();

        //leitura de uma linha
        System.out.println("Digite uma frase: ");
        String linha = ler.nextLine();
        System.out.println("Você digitou uma frase inteira: " + linha);
        ler.nextLine();

        //leitura de um inteiro
        System.out.println("Digite um número: ");
        int num = ler.nextInt();
        System.out.println("Você digitou um número: " + num);
        ler.nextLine();

        //leitura de um double
        System.out.println("Digite um número decimal: ");
        double decimal = ler.nextDouble();
        System.out.println("Você digitou um número decimal: " + decimal);
        ler.nextLine();

        //leitura de um valor boolean
        System.out.println("Digite um valor true/false: ");
        boolean valor = ler.nextBoolean();
        System.out.println("Você digitou um valor booleano: " + valor);
        ler.nextLine();

        //fecha o scanner e finaliza todos os processos
        ler.close();

    }
}
