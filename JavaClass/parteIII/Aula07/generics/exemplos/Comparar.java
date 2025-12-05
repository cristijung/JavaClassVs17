package parteIII.Aula07.generics.exemplos;
//exemplo de sintaxe de interface genérica
public interface Comparar<T> {
    public int compareTo(T o);
}
// T e o parâmetro do metodo da Interface
// 'o' é o local que recebe o outro objeto --> será do mesmo tipo que o objeto da classe