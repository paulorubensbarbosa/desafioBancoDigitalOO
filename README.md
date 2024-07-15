# Desafio de Projeto: Criando um Banco Digital com Java e Orientação a Objetos

## Bootcamp Desenvolvimento Java com IA, GFT

### Features Adicionadas

- **Método para Listar Clientes do Banco:**
  - Utilização de Streams para ordenar alfabeticamente e remover duplicações, retornando uma lista alfabética única de todos os clientes do banco.

- **Adição do Lombok:**
  - Uso do Lombok para facilitar a legibilidade do código.

- **Método Autenticar:**
  - Exige que o cliente forneça a sua senha. Somente se a senha estiver correta, as ações "Sacar" e "Transferir" podem ser executadas.

- **Classe de Exceção: SaldoInsuficienteException:**
  - Impede que o cliente saque ou transfira um valor maior do que o seu saldo disponível.
