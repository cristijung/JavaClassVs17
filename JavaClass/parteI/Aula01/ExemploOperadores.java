package parteI.Aula01;

import java.util.Scanner;

public class ExemploOperadores {
    public static void main(String[] args) {

        int a = 10;
        int i = a++;
        int j = ++a;

        System.out.println("Valor de a: " + a); // print de 11
        System.out.println("Valor de i: " + i); // print de 10
        System.out.println("Valor de j: " + j);

        System.out.println("----------------------------");

        Scanner ler = new Scanner(System.in); //classe Scanner
        System.out.println("Digite a sua idade: ");
        int idade = ler.nextInt();

        String status = (idade >= 18) ? "Adulto" : "Menor";
        System.out.println("Quai a idade? " + idade + " anos");
        System.out.println("Classificação da idade: " + status);
    }

}
