package parteIII.Aula07.generics.exemplos;
//exemplo de classe genérica
public class Caixa<T> {
    private T conteudo; //é um atributo mutante

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public static void main(String[] args) {
        Caixa<String> caixaDeString = new Caixa<>();  //passa a ser tratado como private String conteudo
        caixaDeString.setConteudo("Olá Mundo!");
        System.out.println(caixaDeString.getConteudo());

        Caixa<Integer> caixaDeInteiro = new Caixa<>(); // passa a ser tratado como private Integer conteudo
        caixaDeInteiro.setConteudo(123);
        System.out.println(caixaDeInteiro.getConteudo());
    }
}
