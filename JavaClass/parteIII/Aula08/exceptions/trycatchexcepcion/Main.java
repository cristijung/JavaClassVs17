package parteIII.Aula08.exceptions.trycatchexcepcion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        //caminho do arquivo dentro do projeto
        String fileName = "./data.txt";

        //usar try-with-resources para garantir que o recurso seja fechado
        try (InputStream inputStream = Main.class.getResourceAsStream(fileName);
             BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))) {

            if (inputStream == null) {
                throw new IOException("Arquivo não encontrado: " + fileName);
            }

            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
