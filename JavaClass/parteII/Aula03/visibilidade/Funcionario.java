package parteII.Aula03.visibilidade;

public class Funcionario {
    public String nome;
    //PROTECTED -- acesso restrito, visível somente dentro deste pacote
    protected double salarioBase;
    //PRIVATE + FINAL -- segurança máxima
    //private: só a classe funcionario enxerga
    //final: valor é atribuído UMA ÚNICA VEZ no construtor e torna-se IMUTÁVEL
    private final double valeRefeicao;

    public Funcionario(String nome, double salarioBase, double valeRefeicao) {
        this.nome = nome;
        this.salarioBase = salarioBase;
        this.valeRefeicao = valeRefeicao; //o valor é 'travado' aqui e não muda mais
    }

    //ENCAPSULAMENTOS
    //metodos acessores - Getter e Setters
    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        if (salarioBase > 0) {
            this.salarioBase = salarioBase;
        } else {
            System.out.println("Salário base inválido");
        }
    }

    public double getValeRefeicao() {
        return valeRefeicao;
    }

    public double calcularSalarioBruto() {
        return salarioBase + valeRefeicao;
    }

    public double calcularFerias(){
        // Atenção ao '1.0': Isso força o Java a fazer uma divisão decimal.
        // Se fosse (1/3), o Java dividiria inteiros e o resultado seria 0.
        return salarioBase * ( 1 + (1.0/3));
    }

    // Este metodo exige um dado externo (mesesTrabalhados) para funcionar
    public double calcularDecimoTerceiro(int mesesTrabalhados) {
        // Validação de Parâmetro: Protege a lógica contra dados absurdos (ex: mês 15)
        if (mesesTrabalhados > 0 && mesesTrabalhados <= 12) {
            return (salarioBase / 12) * mesesTrabalhados;
        } else {
            System.out.println("Número de meses inválidos.");
            return 0; // Retorna 0 para evitar erros em contas futuras
        }
    }
}

