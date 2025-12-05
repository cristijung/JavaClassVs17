package parteI.Aula01;
// classe com variáveis primitivas
public class TiposDeDados {
    // variáveis primitivas
    // visibilidade -> tipo de dado -> nome da variável -> operadore de atribuição -> valor atribuído
    public byte varByte = 126; // 8 bits
    public  byte varShort = (byte) 326578; // 16 bits
    // sem a declaração de 'public' mesmo assim é public
    int varInt = 1226; //números inteiros, padrão do java
    public long varLong = 9569874236958172L; // do tipo long - L no final p avisar ao compilador q é um n grande
    public float varFloat = 3.56f; // do tipo float - precisão simples -- 32 bits
    double varDouble = 2.88; // precisão dupla e mais segura -- 64 bits
    public char varChar = 'A'; // aramazena somente um caracter e se usa aspas simples
    public boolean varBoolean = true; // usado para if/else e é true ou false

    // variáveis/atributos de referência
    String varString = "Olá mundoooo!!"; //do tipo de referência de texto -> String é uma classe - é um objeto que guarda uma sequência de caracteres e possui vários métodos
    Integer varIntegerer = 42; //do tipo Integer --> é uma classe e uma Classe wrapper para int

    //diferença entre Primitivos e Referência (wrappers)
    int numero = 1226; // armazena o valor real e é mais leve e não tem métodos específicos e não pode ser null (assume 0)
    Integer numeros = 42; // armazena um objeto completo, é mais pesado, possui métodos e pode ser null

    public void exibirValores() {
        System.out.printf("Variável byte: " + varByte);
        System.out.printf("Variável short: " + varShort);
        System.out.printf("Variável int: " + varInt);
        System.out.printf("Variável short: " + varString);

    }
}
