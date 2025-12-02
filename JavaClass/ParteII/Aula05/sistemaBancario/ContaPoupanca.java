package ParteII.Aula05.sistemaBancario;
// HERANÇA
public class ContaPoupanca extends Conta {

    public ContaPoupanca(String titular) {
        super(titular);
    }

    // POLIMORFISMO
    // Na Poupança, o comportamento é diferente: NÃO há taxa.
    @Override
    public void sacar(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado na poupança.");
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }
}