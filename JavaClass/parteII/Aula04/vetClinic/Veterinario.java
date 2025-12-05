package parteII.Aula04.vetClinic;
// Classe comsobrecarga de metodos
// Conceito de assinatura do metodo: NOME DO METODO + LISTA DE TIPOS DE PARÂMETROS
// assinatura dos métodos desta classe
// metodo 1 --> realizarConsulta(Animal)
// metodo 2 --> realizarConsulta(Animal, String)
// metodo 3 --> realizarConsulta(Animal, String, String)
public class Veterinario {
    private String nome;
    public Veterinario(String nome) {
        this.nome = nome;
    }

    // Sobrecarga - ex1: apenas o animal
    public void realizarConsulta(Animal animal) {
        System.out.println("-----------------------------------------------------------");
        System.out.println("MedVet " + this.nome + " atendendo.");
        System.out.println("Paciente " + animal.getNome());

        // se for o Cao
        if (animal instanceof Cao) {
            Cao tempCao = (Cao) animal; // é um casting - é uma conversão explícita
            System.out.println("Específico: Cão de porte " + tempCao.getPorte());
        }

        // se for o Gato
        if (animal instanceof Gato) {
            Gato tempGato = (Gato) animal;
            System.out.println("Específico: Gato de pelagem " + tempGato.getCorPelagem());
        }

        System.out.println("Diagnóstico: check-up realizado com sucesso!");
    }

    // Sobrecarga - ex 2 - realizar consulta - Overloading
    public void realizarConsulta(Animal animal, String procedimento) {
        System.out.println("-----------------------------------------------------------");
        System.out.println("Paciente: " + animal.getNome());
        System.out.println("Realizando: " + procedimento);
    }

    // Sobrecarga 3
    public void realizarConsulta(Animal animal, String procedimento, String medicamento) {
        System.out.println("-----------------------------------------------------------");
        System.out.println("Paciente: " + animal.getNome());
        System.out.println("Procedimento: " + procedimento + " | Receita: " + medicamento);
    }

    // Sobrecarga 4
    public void realizarConsulta(Animal animal, int idade) {
        System.out.println("Consulta com Idade: O animal tem " + idade + " anos");
        if(idade >= 10) {
            System.out.println("Cuidado: Animal idoso!");
        }
    }
}
