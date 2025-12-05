package ParteIII.Aula07.generics.exemplos;
//exemplo sintaxe de um método genérico
public class Util {
    public static <T> void imprimirArray(T[] array) {
        for (T elemento : array) {
            System.out.println(elemento);
        }
    }
}
