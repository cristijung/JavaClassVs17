package parteII.Aula05.calculadoraScanner;

import java.util.Scanner;

public class CalculadoraApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // polimorfismo: a variável é do tipo Pai, mas receberá um objeto Filho
        OperacaoMatematica operacao = null;

        System.out.println("=== CALCULADORA JAVA (Arquivos Separados) ===");

        // entrada de dados
        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        // menu
        System.out.println("\nQual operação deseja realizar?");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        System.out.print("Opção: ");
        int opcao = scanner.nextInt();

        // a lógica
        switch (opcao) {
            case 1:
                operacao = new Soma(num1, num2);
                break;
            case 2:
                operacao = new Subtracao(num1, num2);
                break;
            case 3:
                operacao = new Multiplicacao(num1, num2);
                break;
            case 4:
                operacao = new Divisao(num1, num2);
                break;
            default:
                System.out.println("Opção inválida!");
                System.exit(0);
        }

        // cálculo
        if (operacao != null) {
            System.out.println("--------------------------------");
            // aqui ocorre o Polimorfismo: o Java chama o calcular() da classe específica
            System.out.println("RESULTADO: " + operacao.calcular());
            System.out.println("--------------------------------");
        }

        scanner.close();
    }
}