# 🛒 Sistema de Carrinho de Compras em Java

## 🔍 Descrição
Este projeto implementa um sistema de carrinho de compras utilizando **Programação Orientada a Objetos (POO)** em Java. Ele permite que um usuário adicione e remova produtos do carrinho e calcule o total da compra.

## 📚 Classes Implementadas
### **1. `Produto`**
Classe que representa um produto disponível para compra.

**Atributos:**
- `nome` (String) - Nome do produto.
- `preco` (double) - Preço do produto.

**Métodos:**
- `getNome()`, `setNome(String nome)`: Obtém e define o nome do produto.
- `getPreco()`: Obtém o preço do produto.

### **2. `Usuario`**
Classe que representa um usuário do sistema.

**Atributos:**
- `id` (int) - Identificação do usuário.
- `nome` (String) - Nome do usuário.

**Métodos:**
- `getId()`, `setId(int id)`: Obtém e define o ID do usuário.
- `getNome()`, `setNome(String nome)`: Obtém e define o nome do usuário.

### **3. `CarrinhoCompras`**
Classe que representa um carrinho de compras associado a um usuário.

**Atributos:**
- `usuario` (Usuario) - Usuário dono do carrinho.
- `produtos` (ArrayList<Produto>) - Lista de produtos no carrinho.

**Métodos:**
- `adicionarProduto(Produto produto)`: Adiciona um produto ao carrinho.
- `removerProduto(Produto produto)`: Remove um produto do carrinho.
- `calcularPreco()`: Calcula e retorna o total da compra.

### **4. `Main`**
A classe principal que testa o sistema de carrinho de compras:
- Cria um usuário e um carrinho de compras.
- Adiciona e remove produtos do carrinho.
- Calcula e exibe o valor total da compra.

Este projeto demonstra o uso de **associação de classes**, **manipulação de listas** e **encapsulamento** para modelar um sistema de compras eficiente.
