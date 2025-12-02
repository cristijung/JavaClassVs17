package ParteII.Aula05.calculadoraScanner;

public class Subtracao extends OperacaoMatematica {

    public Subtracao(double n1, double n2) {
        super(n1, n2);
    }

    @Override
    public double calcular() {
        return getNumero1() - getNumero2();
    }
}