package ParteIII.Aula07.collections.hasmap;

public class Funcionario {
    private String id;
    private String nome;
    private double salario;

    public Funcionario(String id, String nome, double salario) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }

    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return """
                Funcionario{
                    id='%s',
                    nome='%s',
                    salario=%s
                }""".formatted(id, nome, salario);
    }
}

//Funcionario{id='', nome='', salario=''}
//        return "Funcionário{" +
//                "id-'" + id + '\'' +
//                ", nome='" + nome + '\'' +
//                ", salario= " + salario +
//                '}';
