package parteII.Aula05.calculadoraScanner;

// CLASSE ABSTRATA
public abstract class OperacaoMatematica {
    private double numero1;
    private double numero2;

    // construtor
    public OperacaoMatematica(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    // encapsulamento (Getters)
    public double getNumero1() {
        return numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    // metodo Abstrato (Obriga os filhos a implementarem)
    public abstract double calcular();
}
