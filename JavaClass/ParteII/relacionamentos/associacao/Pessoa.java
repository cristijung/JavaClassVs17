package ParteII.relacionamentos.associacao;
// esta classe possui os atributos nome e Carro que vem
// por meio de associação da classe Carro
public class Pessoa {
    private final String nome;
    private final Carro CARRO; // associação: uma pessoa PODE TER UM CARRO

    public Pessoa(String nome, Carro CARRO) {
        this.nome = nome;
        this.CARRO = CARRO;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        if (CARRO != null) {
            System.out.println("Carro: " + CARRO.getModelo() + " - " + CARRO.getCor());
        } else {
            System.out.println("Sem Carro associado!!");
        }
    }
}
