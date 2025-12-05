package parteII.relacionamentos.dependencia;

public class Main {
    public static void main(String[] args) {
        Carro meuCarro = new Carro("Ferrari", "ABC-1234");
        Motorista motorista = new Motorista("Joãozinho da Silva Sauro");

        motorista.dirigir(meuCarro);
    }

}
