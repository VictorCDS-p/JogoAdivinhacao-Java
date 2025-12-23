# 🎮 Jogo de Adivinhação 

Um desafio de lógica em Java focado em interatividade e validação de dados, onde o jogador deve descobrir um número secreto.

## 📝 Descrição do Projeto

O programa sorteia um número aleatório e desafia o usuário a acertá-lo em **5 tentativas**. Esta versão inclui um sistema de proteção que impede o desperdício de chances caso o usuário digite valores fora do intervalo permitido.

## 🚀 Funcionalidades Principais

* **Geração Aleatória:** Utiliza a classe `Random` para definir um número entre 0 e 99.
* **Validação de Entrada:** Um laço `while(true)` garante que apenas palpites entre 0 e 99 sejam processados, sem penalizar o jogador por erros de digitação.
* **Dicas Dinâmicas:** O sistema informa se o número secreto é maior ou menor que o palpite atual através de operadores relacionais.
* **Gestão de Recursos:** Implementação de `try-with-resources` para o fechamento automático do `Scanner`.

## 🛠️ Tecnologias e Conceitos Java

* **OpenJDK 25:** Compatível com as versões mais recentes da linguagem.
* **Operadores Lógicos:** Uso do operador `&&` (AND) para validar o intervalo numérico.
* **Controle de Fluxo:** Estruturas `for` para as tentativas e `if/else` para a lógica de acerto.
* **Tratamento de Strings:** Mensagens claras e interativas utilizando quebras de linha formatadas.


---
