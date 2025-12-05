package parteI.Aula01;

public class PrimeiroExemploClasse {
    // método main é o método principal
    public static void main(String[] args) {
        // declarando as variáveis
        String nome = "Ana";
        String sobreNome = "Banana";
        int idade = 26;
        double altura = 1.70;
        boolean generoFeminino = true;

        // saída de dados
        System.out.println("=== Ficha do Aluno ===");
        System.out.println("Nome: " + nome + " " + sobreNome);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Altura: " + altura + "m");
        System.out.println("É gênero feminino? " + generoFeminino);

        // exemplo de operação simples
        int anoNascimento = 2025 - idade;
        System.out.println("Ano aproximado de nascimento: " + anoNascimento);
    }
}
