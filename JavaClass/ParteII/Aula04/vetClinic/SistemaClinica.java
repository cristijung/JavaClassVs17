package ParteII.Aula04.vetClinic;


public class SistemaClinica {
    public static void main(String[] args) {
        Cao c1 = new Cao("Lina", 5, "Grande");
        Cao c2 = new Cao("Dobby", 10, "Pequeno");
        Gato g1 = new Gato("Luna", 3, "Preto, Branco e Amarelo");

        Veterinario vet1 = new Veterinario("Dra. Samanta");
        Veterinario vet2 = new Veterinario("Dr. Filomeno");

        // realizando consultas
        vet1.realizarConsulta(c1);
        vet1.realizarConsulta(c2);
        System.out.println("\n -- Primeira consulta --");

        vet2.realizarConsulta(g1);
        System.out.println("-------------------");

        System.out.println("\n --- Atualizando cadastro da gata ---");
        g1.setCorPelagem("Bicolor (Branco e Preto)");

        System.out.println("Consultando os valores da Gata");
        vet2.realizarConsulta(g1);

    }
}
