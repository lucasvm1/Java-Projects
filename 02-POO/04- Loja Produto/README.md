# 🛒 Sistema de Controle de Estoque em Java

## 🔍 Descrição
Este projeto implementa um sistema simples de controle de estoque utilizando **Programação Orientada a Objetos (POO)** em Java. Ele permite gerenciar produtos, incluindo operações de **adição e remoção de estoque**.

## 📚 Classes Implementadas
### **1. `Produto`**
Classe que representa um produto no estoque.

**Atributos:**
- `nome` (String) - Nome do produto.
- `preco` (double) - Preço do produto.
- `quantidadeEstoque` (int) - Quantidade disponível no estoque.

**Métodos:**
- `getNome()`, `setNome(String nome)`: Obtém e define o nome do produto.
- `getPreco()`, `setPreco(double preco)`: Obtém e define o preço do produto.
- `getQuantidadeEstoque()`, `setQuantidadeEstoque(int quantidade)`: Obtém e define a quantidade disponível no estoque.
- `adicionaEstoque(int quantidade)`: Adiciona unidades ao estoque.
- `removerEstoque(int quantidade)`: Remove unidades do estoque, garantindo que a quantidade nunca fique negativa.

### **2. `Main`**
A classe principal que testa o sistema de estoque:
- Cria um `Produto` com nome, preço e quantidade inicial.
- Adiciona e remove itens do estoque, verificando a disponibilidade.

Este projeto demonstra o uso de **encapsulamento** e **métodos de controle de estoque** para gerenciar produtos de forma eficiente.
