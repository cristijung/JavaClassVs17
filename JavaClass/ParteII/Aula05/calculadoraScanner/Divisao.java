package ParteII.Aula05.calculadoraScanner;

public class Divisao extends OperacaoMatematica {

    public Divisao(double n1, double n2) {
        super(n1, n2);
    }

    @Override
    public double calcular() {
        if (getNumero2() == 0) {
            System.out.println("Erro: Não é possível dividir por zero!");
            return 0; // retorna 0 ou poderia lançar uma Exception
        }
        return getNumero1() / getNumero2();
    }
}