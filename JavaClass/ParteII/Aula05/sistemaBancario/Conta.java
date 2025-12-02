package ParteII.Aula05.sistemaBancario;
// ABSTRAÇÃO
// A classe é 'abstract' pois serve de modelo (pai), não pode ser instanciada diretamente.
public abstract class Conta {

    // ENCAPSULAMENTO
    // 'private': Ninguém mexe no saldo diretamente, apenas via métodos.
    // 'protected': As classes filhas (Herança) podem acessar.
    private String titular;
    protected double saldo;

    public Conta(String titular) {
        this.titular = titular;
        this.saldo = 0.0;
    }

    // Metodo comum a todas as contas
    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado na conta de " + this.titular);
        }
    }

    // Metodo abstrato: Obriga as filhas a definirem COMO sacam (Polimorfismo virá aqui)
    public abstract void sacar(double valor);

    // Getter para ler o saldo (mas não alterar)
    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }
}