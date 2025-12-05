# Explicação do Código:
## Classe Usuario: 
- Define a estrutura de dados para os usuários.

## Lista em Memória (usuarios): 
- Utilizamos uma lista para armazenar os usuários.

### Métodos CRUD:
- Create (createUsuario): Cria um novo usuário e o adiciona à lista. Solicita dados ao usuário via Scanner.
- Read (readUsuarios): Lê todos os usuários da lista e exibe seus detalhes.
- Update (updateUsuario): Atualiza as informações de um usuário específico na lista. Solicita novos dados ao usuário via Scanner.
- Delete (deleteUsuario): Remove um usuário específico da lista. Solicita o ID do usuário a ser removido via Scanner.

## Na Main - Interface de Console: 
- No método main, um menu de console é apresentado ao usuário, permitindo escolher operações CRUD através de um Scanner.

### Este exemplo permite que você execute operações CRUD interativamente através de um menu de console. Cada operação solicita os dados necessários ao usuário, permitindo cadastrar, listar, editar e remover usuários em tempo real.