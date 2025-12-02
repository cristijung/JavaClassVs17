package ParteII.Aula05.calculadora;

// subclasse CONCRETA: SOMA --> herança
class Soma extends Operacao {

    // reutilizando o construtor da mãe
    public Soma(double a, double b) {
        super(a, b);
    }

    public Soma() {
        super();
    }

    // --- POLIMORFISMO --> Sobrescrita / @Override ---
    // a Soma define sua própria versão de 'calcular'
    @Override
    public double calcular() {
        return getValorA() + getValorB();
    }
}
