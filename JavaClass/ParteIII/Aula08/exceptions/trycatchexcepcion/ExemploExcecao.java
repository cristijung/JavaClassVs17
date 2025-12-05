package ParteIII.Aula08.exceptions.trycatchexcepcion;

public class ExemploExcecao {

    public static void main(String[] args) {
        try {
            //bloco TRY: colocamos aqui o código que PODE gerar um erro.
            //é aqui q colocamos o 'código perigoso', as linhas q tem potencial p lançar um erro ...
            System.out.println("Iniciando a execução do bloco try...");
            int numerador = 10;
            int denominador = 2; //alterar para 2 para ver o caminho sem erro

            int resultado = numerador / denominador; //esta linha vai lançar uma exceção

            //esta linha NUNCA será executada se o erro ocorrer
            System.out.println("O resultado da divisão é: " + resultado);

        } catch (ArithmeticException e) {
            //bloco CATCH: será executado APENAS SE uma ArithmeticException ocorrer.
            //é o nosso "plano B" para tratar o erro de forma controlada.
            System.out.println("Erro capturado! Não é possível dividir um número por zero.");
            //e.printStackTrace(); //é só descomentar para ver o "rastro" completo do erro

        } finally {
            //bloco FINALLY: Este bloco é executado SEMPREEEE,
            //independentemente de ter ocorrido um erro ou não.
            //é ideal para "limpar" recursos (ex: fechar arquivos, conexões).
            System.out.println("O bloco finally foi executado. Fim da operação.");
        }

        System.out.println("O programa continua após o tratamento da exceção.");
    }
}