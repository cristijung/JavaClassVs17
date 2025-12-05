package parteII.Aula05.calculadora;
// subclasse CONCRETA --> multiplicação
class Multiplicacao extends Operacao {
    // add o construtor vazio para permitir 'new Multiplicacao()'
    public Multiplicacao() {
        super();
    }
    // ---------------------

    public Multiplicacao(double a, double b) {
        super(a, b);
    }

    @Override
    public double calcular() {
        return getValorA() * getValorB();
    }
}