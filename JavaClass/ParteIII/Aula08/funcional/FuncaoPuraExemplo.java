package ParteIII.Aula08.funcional;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FuncaoPuraExemplo {

    //função pura que calcula o quadrado de um número
    public static int calcularQuadrado(int n) {
        return n * n;
    }

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        //usando a função pura com a API de Streams
        List<Integer> quadrados = numeros.stream()
                .map(FuncaoPuraExemplo::calcularQuadrado)
                .collect(Collectors.toList());

        System.out.println(quadrados);
    }
}


