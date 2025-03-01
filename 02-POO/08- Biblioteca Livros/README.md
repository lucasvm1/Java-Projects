# 📚 Sistema de Biblioteca em Java

## 🔍 Descrição
Este projeto implementa um sistema de gerenciamento de biblioteca utilizando **Programação Orientada a Objetos (POO)** em Java. Ele permite cadastrar livros, controlar empréstimos e listar os livros disponíveis na biblioteca.

## 📚 Classes Implementadas
### **1. `Livro`**
Classe que representa um livro da biblioteca.

**Atributos:**
- `titulo` (String) - Título do livro.
- `autor` (String) - Autor do livro.
- `emprestado` (boolean) - Indica se o livro está emprestado.

**Métodos:**
- `getTitulo()`, `setTitulo(String titulo)`: Obtém e define o título do livro.
- `getAutor()`, `setAutor(String autor)`: Obtém e define o autor do livro.
- `isEmprestado()`, `setEmprestado(boolean emprestado)`: Verifica e define o status de empréstimo do livro.
- `emprestar()`: Marca o livro como emprestado, se disponível.
- `devolver()`: Marca o livro como disponível, se estiver emprestado.

### **2. `Biblioteca`**
Classe que gerencia os livros disponíveis e seus empréstimos.

**Atributos:**
- `nome` (String) - Nome da biblioteca.
- `livros` (ArrayList<Livro>) - Lista de livros cadastrados.

**Métodos:**
- `getNome()`, `setNome(String nome)`: Obtém e define o nome da biblioteca.
- `adicionarLivro(Livro livro)`: Adiciona um livro à biblioteca.
- `listarLivrosDisponiveis()`: Exibe os livros que não estão emprestados.

### **3. `Main`**
A classe principal que testa o sistema de biblioteca:
- Cria uma `Biblioteca` e adiciona livros.
- Realiza um empréstimo e verifica os livros disponíveis.

Este projeto demonstra o uso de **encapsulamento**, **manipulação de listas** e **gestão de empréstimos** para organizar um sistema de biblioteca funcional.
