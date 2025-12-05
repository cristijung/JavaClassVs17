package parteII.Aula05.sistemaBancario;
// HERANÇA: 'extends Conta' (Herda titular, saldo e depositar)
// INTERFACE: 'implements Autenticavel' (Assina o contrato de segurança)
public class ContaCorrente extends Conta implements Autenticavel {

    private String senha;

    public ContaCorrente(String titular, String senha) {
        super(titular); // Chama o construtor da classe pai (Conta)
        this.senha = senha;
    }

    // POLIMORFISMO
    // Reescrevemos (Override) o método sacar.
    // Na Corrente, cobramos uma taxa de R$ 0.50.
    @Override
    public void sacar(double valor) {
        double valorComTaxa = valor + 0.50;

        if (this.saldo >= valorComTaxa) {
            this.saldo -= valorComTaxa;
            System.out.println("Saque de R$" + valor + " (Taxa R$0.50) realizado.");
        } else {
            System.out.println("Saldo insuficiente para saque + taxas.");
        }
    }

    // Implementação da Interface Autenticavel
    @Override
    public boolean autenticar(String senhaInput) {
        return this.senha.equals(senhaInput);
    }
}