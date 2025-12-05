package parteII.Aula05.calculadora;

// --- CLASSE ABSTRATA --- --> a base da herança
abstract class Operacao {
    private double valorA;
    private double valorB;

    // sobrecarga de construtores
    // ex1. construtor vazio
    public Operacao() {
    }

    // ex2. com parâmetros
    public Operacao(double valorA, double valorB) {
        this.valorA = valorA;
        this.valorB = valorB;
    }


    // metodos acessores
    public double getValorA() {
        return valorA;
    }

    public void setValorA(double valorA) {
        this.valorA = valorA;
    }

    public double getValorB() {
        return valorB;
    }

    public void setValorB(double valorB) {
        this.valorB = valorB;
    }

    // --- POLIMORFISMO ---
    // este metodo é ABSTRATO. A classe operação NÃO SABE COMO CALCULAR,
    // mas obriga quem herdar dela a explicar como faz
    public abstract double calcular();

    // --- SOBRECARGA DE METODO --> Method Overloading
    // temos um metodo 'calcular' (acima) sem parâmetros --> usa os atributos da classe
    // abaixo, temos um metodo que aceita novos valores na hora de executar
    public double calcular(double x, double y) {
        this.valorA = x;
        this.valorB = y;
        return calcular(); // chama a implementação específica da subclasse

    }
}
