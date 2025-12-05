# Neste exemplo:

## A classe BankTransaction representa uma transação bancária.
- Quando uma nova transação é criada, a data e a hora atuais são registradas usando LocalDateTime.now().
- O método printTransactionDetails formata e imprime os detalhes da transação, incluindo a data e a hora.
- O método printElapsedTimeSinceTransaction calcula o tempo decorrido desde a transação até o momento atual usando Duration.between.
- No método main, criamos uma transação e imprimimos os detalhes, depois simulamos uma espera de 5 segundos (para ilustrar a passagem do tempo) e imprimimos o tempo decorrido desde a transação.


## Este exemplo mostra como a Java Time API pode ser usada em um cenário real de transações bancárias para registrar e manipular datas e horas de maneira eficiente e precisa.