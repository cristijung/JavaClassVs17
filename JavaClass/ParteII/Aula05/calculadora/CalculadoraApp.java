package ParteII.Aula05.calculadora;

public class CalculadoraApp {
    public static void main(String[] args) {

        System.out.println("--- Testando Sobrecarga de Construtores --- ");

        // usando construtor com parâmetro
        Soma soma1 = new Soma(10, 22);
        System.out.println("Soma: " + soma1.calcular());

        // usando construtor vazio + encapsulamento
        Multiplicacao multi1 = new Multiplicacao();
        multi1.setValorA(228);
        multi1.setValorB(300);
        System.out.println("Multiplicação (usando o setters): " + multi1.calcular());

        System.out.println("\n --- Testando o polimorfismo ---");
        Operacao minhaConta;

        minhaConta = new Soma(120, 140);
        System.out.println("Polimorfismo (Soma): " + minhaConta.calcular());

        minhaConta = new Multiplicacao(2, 40);
        System.out.println("Polimorfismo (Multi): " + minhaConta.calcular());

        System.out.println("\n --- Testando sobrecarga de Métodos ---");
        System.out.println("Sobrecarga (passando valores novos): " + minhaConta.calcular(12, 24));
    }
}
