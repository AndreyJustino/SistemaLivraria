# Sistema de Empréstimo de Livros

## Sobre o Desafio

Este projeto tem como objetivo desenvolver um sistema básico para gerenciar o empréstimo de livros em uma biblioteca. O foco principal será a listagem de livros disponíveis e a funcionalidade de realizar empréstimos de forma interativa através do console.

O sistema permitirá ao usuário visualizar os livros disponíveis, escolher um livro para empréstimo, e registrar o nome do leitor, finalizando com uma mensagem de sucesso. Em caso de encerramento da aplicação, o sistema exibirá uma mensagem informativa.

---

## Funcionalidades do Sistema

### 1. Listagem de Livros Disponíveis
- O sistema exibe todos os livros disponíveis para empréstimo.
- Cada livro será identificado por um **ID** único.

### 2. Empréstimo de Livro
- O usuário escolhe o ID do livro que deseja emprestar.
- Após selecionar o livro, o sistema solicitará o nome do usuário que está realizando o empréstimo.
- Uma mensagem de sucesso será exibida confirmando o empréstimo do livro.

### 3. Encerramento da Aplicação
- Caso o usuário opte por não realizar nenhuma ação, o sistema será encerrado.
- Uma mensagem será exibida informando o término da aplicação.

---

## Tecnologias Utilizadas
- **Java**: Linguagem de programação principal para o desenvolvimento do sistema.

---

## Como Executar o Sistema
1. Clone este repositório em sua máquina.
2. Certifique-se de que o [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html) está instalado.
3. Compile e execute o programa a partir do terminal ou IDE de sua preferência.

```bash
# Compilação
javac SistemaEmprestimoLivros.java

# Execução
java SistemaEmprestimoLivros
```

## Estrutura do Código

1. Classe Principal (SistemaEmprestimoLivros): Contém o ponto de entrada da aplicação (main).
2. Métodos Auxiliares:
   - Método para exibir os livros disponíveis.
   - Método para registrar um empréstimo.
   - Método para encerrar a aplicação com uma mensagem.

---

Feito com 💻 e ☕️ por Andrey.
