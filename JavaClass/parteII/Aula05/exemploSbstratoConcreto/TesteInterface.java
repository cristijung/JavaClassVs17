package parteII.Aula05.exemploSbstratoConcreto;

// 1- A INTERFACE --> o Contrato
// qualquer coisa que implemente isso OBRIGATORIAMENTE tem que ter o metodo imprimir()
interface Imprimivel {
    void imprimirResultado();
}

// 2- A CLASSE ABSTRATA --> a base/família, por exemplo
abstract class OperacaoMatematica {
    protected double n1;
    protected double n2;

    public OperacaoMatematica(double n1, double n2) {
        this.n1 = n1;
        this.n2 = n2;
    }
    public abstract double calcular();
}

// 3- A CLASSE CONCRETA --> juntando tudo
// lemos assim: "A Soma é UMA OperacaoMatematica e é Imprimivel"
class Soma extends OperacaoMatematica implements Imprimivel {

    public Soma(double n1, double n2) {
        super(n1, n2);
    }

    @Override
    public double calcular() {
        return n1 + n2;
    }

    // obrigatório por causa da interface 'Imprimivel'
    @Override
    public void imprimirResultado() {
        System.out.println(">>> IMPRIMINDO NO PAPEL: " + calcular() + " <<<");
    }
}

// 4- TESTE
public class TesteInterface {
    public static void main(String[] args) {
        Soma s = new Soma(10, 20);

        // usando o metodo da herança
        System.out.println("Cálculo normal: " + s.calcular());

        // usando o metodo da interface
        s.imprimirResultado();
    }
}