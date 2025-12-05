package parteII.Aula03.carro;
//anatomia de uma Classe no Java

public class Carro {
    // Parte 1 da Classe
    //atributos --> características --> variáveis
    String cor;
    String modelo;
    int ano;
    boolean ligado;

    //Parte 2 da Classe
    //construtor da classe: a sua função é inicializar o objeto deixar ele pronto para ser criado
    public Carro(String corDoCarro, String modeloDoCarro, int anoDoCarro) {
        System.out.println("Construindo um carro novo!");
        cor = corDoCarro;
        modelo = modeloDoCarro;
        ano = anoDoCarro;
        ligado = false;
    }

    //Parte 3 da Classe
    //métodos: ações, operações, comportamentos.
    //Funções que definem o que o carro PODE FAZER!

    //Metodo para ligar o carro
    public void ligar() {
        if (ligado) {
            System.out.println("O " + modelo + " já está ligado!");
        } else {
            ligado = true;
            System.out.println("O " + modelo + " ligou e roncou o motor!!");
        }
    }

    //metodo para desligar o carro
    public void desligar() {
        if (ligado) {
            ligado = false;
            System.out.println("O " + modelo + " desligou!");
        } else {
            System.out.println("O " + modelo + " já está desligado!!");
        }
    }

    //metodo para mostrar as informações do carro
    public void mostraInformacoes() {
        System.out.println("-------- Informações do Carro ---------");
        System.out.println("Modelo: " + modelo);
        System.out.println("Cor: " + cor);
        System.out.println("Ano: " + ano);

        if (ligado) {
            System.out.println("Estado: ligado");
        } else {
            System.out.println("Estado: desligado");
        }
        System.out.println("----------------------------------------------");
    }

}
