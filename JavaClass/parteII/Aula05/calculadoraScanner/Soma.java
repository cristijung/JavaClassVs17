package parteII.Aula05.calculadoraScanner;

public class Soma extends OperacaoMatematica {

    public Soma(double n1, double n2) {
        super(n1, n2);
    }

    @Override
    public double calcular() {
        return getNumero1() + getNumero2();
    }
}