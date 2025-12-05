package parteIII.Aula07.collections.treemap;

import java.util.Comparator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {

        //Melhoria do código: 'e' o TreeMap a ordenar Strings numericamente
        //SE as matrículas forem "1", "10", "2", isso garante que o "2" venha antes do "10".
        TreeMap<String, Aluno> alunos = new TreeMap<>(new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                // tenta comparar como número, se falhar (tem letras), compara como texto normal
                try {
                    Long n1 = Long.parseLong(s1);
                    Long n2 = Long.parseLong(s2);
                    return n1.compareTo(n2);
                } catch (NumberFormatException e) {
                    return s1.compareTo(s2);
                }
            }
        });

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- SISTEMA DE ALUNOS (Ordenado) ---");
            System.out.println("1. Adicionar aluno");
            System.out.println("2. Atualizar nota do aluno");
            System.out.println("3. Remover aluno");
            System.out.println("4. Listar todos os alunos");
            System.out.println("5. Sair");
            System.out.print("Escolha: ");

            // tratamento de erro simples para entrada não numérica
            int opcao;
            try {
                opcao = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Por favor, digite um número válido.");
                continue;
            }

            switch (opcao) {
                case 1:
                    System.out.print("Digite a matrícula: ");
                    String matricula = scanner.nextLine();

                    // validando: não permitir sobrescrever matrícula existente no "Adicionar"
                    if (alunos.containsKey(matricula)) {
                        System.out.println("ERRO: Já existe um aluno com essa matrícula!");
                    } else {
                        System.out.print("Digite o nome: ");
                        String nome = scanner.nextLine();
                        System.out.print("Digite a nota: ");
                        try {
                            double nota = Double.parseDouble(scanner.nextLine());
                            Aluno novoAluno = new Aluno(matricula, nome, nota);
                            alunos.put(matricula, novoAluno);
                            System.out.println("Aluno adicionado!");
                        } catch (NumberFormatException e) {
                            System.out.println("Nota inválida.");
                        }
                    }
                    break;

                case 2:
                    System.out.print("Digite a matrícula para editar: ");
                    matricula = scanner.nextLine();

                    // metodo .get() é muito rápido no TreeMap (O(log n)) =)
                    Aluno alunoParaEditar = alunos.get(matricula);

                    if (alunoParaEditar != null) {
                        System.out.println("Aluno encontrado: " + alunoParaEditar.getNome());
                        System.out.print("Nova nota: ");
                        try {
                            double novaNota = Double.parseDouble(scanner.nextLine());
                            alunoParaEditar.setNota(novaNota);
                            System.out.println("Nota atualizada!");
                        } catch (NumberFormatException e) {
                            System.out.println("Nota inválida.");
                        }
                    } else {
                        System.out.println("Aluno não encontrado.");
                    }
                    break;

                case 3:
                    System.out.print("Digite a matrícula para remover: ");
                    matricula = scanner.nextLine();
                    if (alunos.remove(matricula) != null) {
                        System.out.println("Aluno removido com sucesso!");
                    } else {
                        System.out.println("Aluno não encontrado para remoção.");
                    }
                    break;

                case 4:
                    System.out.println("\n--- Lista de Alunos (Ordenada por Matrícula) ---");
                    if (alunos.isEmpty()) {
                        System.out.println("Nenhum aluno cadastrado.");
                    } else {
                        for (Map.Entry<String, Aluno> entry : alunos.entrySet()) {
                            // entry.getKey() é a matrícula
                            // entry.getValue() é o objeto Aluno
                            System.out.println(entry.getValue());
                        }
                    }
                    break;

                case 5:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}