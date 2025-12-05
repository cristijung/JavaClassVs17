package parteII.Aula03.carro;


public class ProgramaCarro {
    public static void main(String[] args) {
        System.out.println("Criando o primeiro carro ....");
        // criando o carro - ele é um OBJETO CÓPIA DA CLASSE CARRO
        Carro meuFusca = new Carro("Laranja", "Fusca", 1989);

        System.out.println("Criando o segundo carro ....");
        Carro meuPorsche = new Carro("Preto", "Carrera", 2000);

        //usando os objetos --> utilizaremos os métodos
        //ver as informações dos carros

        //fusca
        System.out.println("\n --- Ações do fusca ---");
        meuFusca.mostraInformacoes();
        meuFusca.ligar();
        meuFusca.mostraInformacoes();
        meuFusca.desligar();

        //porsche
        System.out.println("\n --- Ações do Porsche ---");
        meuPorsche.mostraInformacoes();
        meuPorsche.ligar();
        meuPorsche.mostraInformacoes();
        meuPorsche.desligar();
        meuPorsche.mostraInformacoes();

        System.out.println("\n --- Fim do Programa! ---");

    }
}
