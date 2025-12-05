package parteII.Aula05.sistemaBancario;
public class BancoMain {
    public static void main(String[] args) {

        // 1. Criando objetos (Instanciando)
        // Note que usamos a classe abstrata 'Conta' como referência (Polimorfismo)
        Conta cc = new ContaCorrente("Maria", "123456");
        Conta cp = new ContaPoupanca("João");
        System.out.println("---------------- Banco de Java --------------------");
        // 2. Testando Encapsulamento e Herança
        cc.depositar(1000); // Herdou de Conta
        cp.depositar(1000); // Herdou de Conta

        System.out.println("--- Testando Polimorfismo (Saques) ---");

        // O mesmo método 'sacar' se comporta de formas diferentes
        cc.sacar(100); // Vai cobrar taxa de 0.50 -> Saldo final: 899.50
        cp.sacar(100); // Não vai cobrar taxa -> Saldo final: 900.00

        System.out.println("Saldo Maria (CC): " + cc.getSaldo());
        System.out.println("Saldo João (CP): " + cp.getSaldo());

        System.out.println("--- Testando Interface ---");

        // Precisamos fazer um cast porque a referência 'cc' é do tipo 'Conta',
        // mas queremos usar um método de 'Autenticavel'
        if (cc instanceof Autenticavel) {
            boolean acesso = ((Autenticavel) cc).autenticar("123456");
            System.out.println("Acesso da Maria autorizado? " + acesso);
        }

        // cp.autenticar("..."); // ERRO! ContaPoupanca não implementa a interface.
    }
}