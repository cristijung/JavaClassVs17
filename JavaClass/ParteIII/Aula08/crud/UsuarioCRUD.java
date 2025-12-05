package ParteIII.Aula08.crud;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class UsuarioCRUD {

    private List<Usuario> usuarios = new ArrayList<>();
    private int currentId = 1;

    public static void main(String[] args) {
        UsuarioCRUD crud = new UsuarioCRUD();
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            System.out.println("1. Cadastrar usuário");
            System.out.println("2. Listar usuários");
            System.out.println("3. Editar usuário");
            System.out.println("4. Remover usuário");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    crud.createUsuario(scanner);
                    break;
                case 2:
                    crud.readUsuarios();
                    break;
                case 3:
                    crud.updateUsuario(scanner);
                    break;
                case 4:
                    crud.deleteUsuario(scanner);
                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (option != 5);

        scanner.close();
    }

    //criar
    public void createUsuario(Scanner scanner) {
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Senha: ");
        String senha = scanner.nextLine();

        Usuario usuario = new Usuario(currentId++, nome, email, senha);
        usuarios.add(usuario);
        System.out.println("Usuário criado: " + usuario);
    }

    //ler
    public void readUsuarios() {
        System.out.println("Lista de usuários:");
        for (Usuario usuario : usuarios) {
            System.out.println(usuario);
        }
    }

    //atualizar
    public void updateUsuario(Scanner scanner) {
        System.out.print("ID do usuário a ser editado: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        Optional<Usuario> usuarioOpt = usuarios.stream()
                .filter(u -> u.getId() == id)
                .findFirst();

        if (usuarioOpt.isPresent()) {
            Usuario usuario = usuarioOpt.get();
            System.out.print("Novo nome: ");
            String nome = scanner.nextLine();
            System.out.print("Novo email: ");
            String email = scanner.nextLine();
            System.out.print("Nova senha: ");
            String senha = scanner.nextLine();

            usuario.setNome(nome);
            usuario.setEmail(email);
            usuario.setSenha(senha);
            System.out.println("Usuário atualizado: " + usuario);
        } else {
            System.out.println("Usuário com ID " + id + " não encontrado.");
        }
    }

    //deletar
    public void deleteUsuario(Scanner scanner) {
        System.out.print("ID do usuário a ser removido: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        boolean removed = usuarios.removeIf(u -> u.getId() == id);

        if (removed) {
            System.out.println("Usuário com ID " + id + " deletado.");
        } else {
            System.out.println("Usuário com ID " + id + " não encontrado.");
        }
    }
}
