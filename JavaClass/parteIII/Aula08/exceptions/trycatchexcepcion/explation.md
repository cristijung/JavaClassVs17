# Explicação
## Caminho do Arquivo: 
Definimos o caminho do arquivo dentro do projeto. O arquivo data.txt está localizado em src/main/resources.
## Leitura do Arquivo: 
Utilizamos getResourceAsStream para obter um InputStream para o arquivo. Isso facilita o acesso a arquivos de recursos que estão dentro do classpath.
## Bloco try-with-resources: 
Usamos o bloco try-with-resources para garantir que os recursos (InputStream e BufferedReader) sejam fechados corretamente após o uso.
## Tratamento de Exceções: 
Utilizamos catch (IOException e) para capturar e tratar quaisquer exceções de E/S que possam ocorrer durante a leitura do arquivo. A mensagem de erro é exibida no console.

### Com este código, qualquer problema que ocorrer durante a leitura do arquivo (como o arquivo não ser encontrado ou problemas de leitura) será tratado adequadamente, exibindo uma mensagem de erro e a pilha de exceções para ajudar na depuração.