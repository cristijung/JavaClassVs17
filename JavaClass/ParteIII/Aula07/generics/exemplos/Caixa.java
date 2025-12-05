package ParteIII.Aula07.generics.exemplos;
//exemplo de classe genérica
public class Caixa<T> {
    private T conteudo;

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public static void main(String[] args) {
        Caixa<String> caixaDeString = new Caixa<>();
        caixaDeString.setConteudo("Olá Mundo!");
        System.out.println(caixaDeString.getConteudo());

        Caixa<Integer> caixaDeInteiro = new Caixa<>();
        caixaDeInteiro.setConteudo(123);
        System.out.println(caixaDeInteiro.getConteudo());
    }
}
