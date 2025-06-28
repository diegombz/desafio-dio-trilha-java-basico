# Desafio: Conta Banco

Este repositório contém a resolução de um desafio proposto pela [Digital Innovation One](https://www.dio.me/).

---

### Enunciado Original

**Sintaxe - Desafio**

Vamos exercitar todo o conteúdo apresentado no módulo de Sintaxe codificando o seguinte cenário:

1. Crie o projeto `ContaBanco` que receberá dados via terminal contendo as características de conta em banco conforme atributos abaixo:
2. Dentro do projeto, crie a classe `ContaTerminal.java` para realizar toda a codificação do programa.

---

###### Regras de declaração de variáveis

| Atributo      | Tipo    | Exemplo       |
|--------------|---------|---------------|
| Número       | Inteiro | 1021          |
| Agência      | Texto   | 067-8         |
| Nome Cliente | Texto   | MARIO ANDRADE |
| Saldo        | Decimal | 237.48        |

---

###### Terminal, main args e classe Scanner

O programa deverá solicitar os dados via terminal, exibindo mensagens para o usuário, por exemplo:

- Programa: "Por favor, digite o número da Agência!"
- Usuário: 1021 *(aperta ENTER para avançar)*

---

###### Concatenar Strings

Após inserir as informações, o sistema deverá exibir a mensagem:

> "Olá [Nome Cliente], obrigado por criar uma conta em nosso banco, sua agência é [Agência], conta [Número] e seu saldo [Saldo] já está disponível para saque."

Os campos entre colchetes [ ] devem ser substituídos pelos dados inseridos pelo usuário.
