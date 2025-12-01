package ParteII.Aula04.vetClinic;
// Subclasse ou Classe Filha
public class Cao extends Animal {
    // Atributo específico da Classe Cao
    private String porte;

    public Cao(String nome, int idade, String porte) {
        super(nome, idade);
        this.porte = porte;
    }

    public String getPorte() {
        return porte;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }
    @Override
    public void emitirSom() {
        System.out.println("Au, AU!! (Latido forte e vigoroso!)");
    }
}
