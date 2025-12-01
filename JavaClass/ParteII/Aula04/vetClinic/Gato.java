package ParteII.Aula04.vetClinic;
// Subclasse ou Classe Filha
public class Gato extends Animal {
    // Atributos específicos da classe Gato
    private String corPelagem;

    public Gato(String nome, int idade, String corPelagem) {
        super(nome, idade);
        this.corPelagem = corPelagem;
    }

    public String getCorPelagem() {
        return corPelagem;
    }

    public void setCorPelagem(String corPelagem) {
        this.corPelagem = corPelagem;
    }

    @Override
    public void emitirSom() {
        System.out.println("Miau! (Miado suave!)");
    }
}
