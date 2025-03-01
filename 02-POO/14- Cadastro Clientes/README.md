# 📋 Sistema de Cadastro de Clientes em Java

## 🔍 Descrição
Este projeto implementa um sistema de cadastro de clientes utilizando **coleções (`HashMap`)** em Java. Ele permite adicionar, remover, buscar e listar clientes cadastrados.

## 📚 Classes Implementadas
### **1. `Cliente`**
Classe que representa um cliente do sistema.

**Atributos:**
- `idCliente` (int) - Identificação única do cliente.
- `nome` (String) - Nome do cliente.

**Métodos:**
- `getIdCliente()`: Obtém o ID do cliente.
- `getNome()`, `setNome(String nome)`: Obtém e define o nome do cliente.

### **2. `CadastroCliente`**
Classe que gerencia o cadastro de clientes utilizando um `HashMap`.

**Atributos:**
- `clientes` (HashMap<Integer, Cliente>) - Mapeia IDs de clientes para objetos `Cliente`.

**Métodos:**
- `cadastrarCliente(Cliente cliente)`: Adiciona um cliente ao cadastro.
- `removerCliente(int idCliente)`: Remove um cliente pelo ID, verificando se ele existe.
- `buscarCliente(int idCliente)`: Busca e exibe o nome de um cliente pelo ID, tratando casos onde o cliente não é encontrado.
- `listarClientes()`: Lista todos os clientes cadastrados, exibindo uma mensagem caso não haja clientes.

### **3. `Main`**
A classe principal que testa o sistema de cadastro de clientes:
- Cria clientes e os adiciona ao cadastro.
- Exibe a lista de clientes cadastrados.
- Busca um cliente pelo ID.
- Remove um cliente e exibe a lista atualizada.

Este projeto demonstra o uso de **coleções (`HashMap`)**, **manipulação de dados** e **gestão de clientes** de forma eficiente, com verificações adicionais para evitar erros de acesso a dados inexistentes.
