package parteII.Aula05.calculadoraScanner;

public class Multiplicacao extends OperacaoMatematica {

    public Multiplicacao(double n1, double n2) {
        super(n1, n2);
    }

    @Override
    public double calcular() {
        return getNumero1() * getNumero2();
    }
}