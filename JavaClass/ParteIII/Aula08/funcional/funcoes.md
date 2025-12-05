# Java Funcional
O Java Funcional refere-se ao `estilo de programação que se tornou proeminente a partir do Java 8`, onde funções são tratadas como cidadãos de primeira classe. 

### Isso significa que podemos:
- Atribuir uma função a uma variável.
- Passar uma função como argumento para outro método.
- Fazer com que um método retorne uma função.
- A base para isso são as Expressões Lambda (como (a, b) -> a + b) e a Stream API, que permitem escrever um código mais declarativo ("o que fazer") em vez de imperativo ("como fazer"). O foco muda de controlar o fluxo de execução para descrever a transformação dos dados.

## Funções Puras: 
Uma Função Pura é um conceito central da programação funcional com duas regras estritas:
- Mesma entrada, mesma saída: Para os mesmos argumentos de entrada, ela sempre retornará o mesmo resultado. Ela não depende de nenhum estado externo ou variável que possa mudar (ex: variáveis globais, campos de um objeto, dados de um arquivo ou banco).
- Sem efeitos colaterais (side effects): A função não altera nada fora de seu escopo. Ela não modifica seus argumentos de entrada, não altera variáveis globais, não imprime no console, não escreve em arquivos, etc. Sua única missão é calcular e retornar um valor.
 
### Por que isso é importante?
Usar funções puras no contexto do Java Funcional (especialmente com a Stream API) torna o código:
- Previsível e fácil de testar: Sem surpresas, o resultado é sempre o mesmo para uma dada entrada.
- Seguro para paralelismo: Como não há efeitos colaterais, várias threads podem executar a função em paralelo sem risco de conflitos de dados.
- Mais fácil de entender e manter: Cada função é uma unidade isolada e autossuficiente.

## Funções Lambdas
As Expressões Lambda (ou apenas `lambdas`) são a peça central e a sintaxe mais visível do Java Funcional. Podemos pensar nelas como uma forma de escrever uma função anônima, ou seja, uma função sem nome, que você pode criar e usar de forma rápida e descartável.

### O Principal Objetivo: Simplificar o Código
O maior benefício das lambdas é a drástica redução da verbosidade. Antes do Java 8, para passar um bloco de código como argumento (por exemplo, uma lógica de comparação para ordenação), era preciso criar uma classe anônima, que era extremamente verbosa.