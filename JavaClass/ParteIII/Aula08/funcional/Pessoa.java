package ParteIII.Aula08.funcional;
//exemplo de classe imutável

public class Pessoa {
    private final String nome;
    private final int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("João", 30);
        System.out.println(pessoa);

        //tentar alterar os campos resultaria em erro de compilação
        //pessoa.nome = "Maria"; //erro de compilação
        //pessoa.idade = 25; //erro de compilação
    }
}
