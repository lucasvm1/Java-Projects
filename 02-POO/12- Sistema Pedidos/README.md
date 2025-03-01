# 🛍️ Sistema de Pedidos em Java

## 🔍 Descrição
Este projeto implementa um sistema de pedidos utilizando **Programação Orientada a Objetos (POO)** em Java. Ele permite gerenciar clientes, adicionar itens a pedidos e calcular o valor total da compra.

## 📚 Classes Implementadas
### **1. `Cliente`**
Classe que representa um cliente do sistema.

**Atributos:**
- `idCliente` (int) - Identificação do cliente.
- `nome` (String) - Nome do cliente.

**Métodos:**
- `getIdCliente()`: Obtém o ID do cliente.
- `getNome()`, `setNome(String nome)`: Obtém e define o nome do cliente.

### **2. `Item`**
Classe que representa um item disponível para compra.

**Atributos:**
- `nome` (String) - Nome do item.
- `quantidade` (int) - Quantidade do item no pedido.
- `preco` (double) - Preço unitário do item.

**Métodos:**
- `getNome()`: Obtém o nome do item.
- `getQuantidade()`: Obtém a quantidade do item no pedido.
- `getPreco()`: Obtém o preço do item.
- `exibirInfo()`: Exibe as informações do item, incluindo o valor total.

### **3. `Pedido`**
Classe que representa um pedido realizado por um cliente.

**Atributos:**
- `numeroPedido` (int) - Número identificador do pedido.
- `cliente` (Cliente) - Cliente associado ao pedido.
- `itens` (ArrayList<Item>) - Lista de itens no pedido.

**Métodos:**
- `getNumeroPedido()`: Obtém o número do pedido.
- `getCliente()`, `setCliente(Cliente cliente)`: Obtém e define o cliente do pedido.
- `adicionarItem(Item item)`: Adiciona um item ao pedido.
- `removerItem(Item item)`: Remove um item do pedido.
- `calcularTotal()`: Calcula e exibe o valor total do pedido.

### **4. `Main`**
A classe principal que testa o sistema de pedidos:
- Cria um cliente e um pedido associado a ele.
- Adiciona e remove itens do pedido.
- Calcula e exibe o total da compra.

Este projeto demonstra o uso de **associação de classes**, **manipulação de listas** e **encapsulamento** para modelar um sistema de pedidos eficiente.
