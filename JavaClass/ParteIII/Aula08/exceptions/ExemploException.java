package ParteIII.Aula08.exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExemploException {
    public static void main(String[] args) {
        try {
            FileReader file = new FileReader("arquivo.txt");
            BufferedReader fileInput = new BufferedReader(file);

            // ler a primeira linha do arquivo
            System.out.println(fileInput.readLine());
            fileInput.close();
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado: " + e);
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e);
        } finally {
            System.out.println("Execução do bloco finally.");
        }
    }
}

