package ParteIII.Aula07.collections.hasmap;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // criando um dicionário (Map) de funcionários
        // o Map cada item possui uma etiqueta única --> chave
        Map<String, Funcionario> funcionarios = new HashMap<>();

        Funcionario funcionario1 = new Funcionario("001", "Ana Banana", 10550.00);
        Funcionario funcionario2 = new Funcionario("002", "Pafúncio Pereira", 5550.00);
        Funcionario funcionario3 = new Funcionario("003", "Bia Souza", 7550.00);

        //metodo put (.put(chave, valor)
        funcionarios.put(funcionario1.getId(), funcionario1);
        funcionarios.put(funcionario2.getId(), funcionario2);
        funcionarios.put(funcionario3.getId(), funcionario3);

        System.out.println("Lista de funcionários:");
        for (Map.Entry<String, Funcionario> entry : funcionarios.entrySet()) {
            System.out.println(entry.getValue());
        }

        Funcionario f = funcionarios.get("002");
        if (f != null) {
            f.setSalario(7000.00);
            System.out.println("Novo salário de " + f.getNome() + ": " + f.getSalario());
        }

        //remover
        funcionarios.remove("003");
        System.out.println("Lista de funcionários após a remoção:");
        for (Map.Entry<String, Funcionario> entry : funcionarios.entrySet()) {
            System.out.println(entry.getValue());
        }
    }
}

