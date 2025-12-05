package parteIII.Aula07.generics.exemplos;
//exemplo sintaxe de um metodo genérico
public class Util {
    public static <T> void imprimirArray(T[] array) {
        for (T elemento : array) {
            System.out.println(elemento);
        }
    }
}
