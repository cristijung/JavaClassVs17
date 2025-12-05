package parteII.Aula03.visibilidade;


import java.text.DecimalFormat;

public class SistemaRH {

    public static void main(String[] args) {
        //criação do objeto funcionária
        Funcionario funcionaria = new Funcionario("Ana Banana", 4500, 599);
        System.out.println("Nome: " + funcionaria.nome);
        //criação do objeto decimalformat (df)
        DecimalFormat df = new DecimalFormat("#,##0.00");
        System.out.println("Salário Bruto: R$ " + df.format(funcionaria.calcularSalarioBruto()));

        funcionaria.setSalarioBase(8500);
        System.out.println("Novo Salário Bruto: R$ " + df.format(funcionaria.calcularSalarioBruto()));

        System.out.println("Férias: R$ " + df.format(funcionaria.calcularFerias()));
        System.out.println("Décimo Terceiro salário: R$ " + df.format(funcionaria.calcularDecimoTerceiro(12)));
    }
}