# 💼 Sistema Bancário em Java

## 🔍 Descrição
Este programa simula um sistema bancário simples utilizando **Programação Orientada a Objetos (POO)** em Java. Ele permite criar contas bancárias, realizar operações básicas como **depósitos e saques**, e armazenar contas em um banco que permite **buscar uma conta pelo número**.

## 📚 Classes Implementadas
### **1. `ContaBancaria`**
Representa uma conta bancária e possui os seguintes atributos:
- `numeroConta` (int) - Número da conta.
- `titular` (String) - Nome do titular da conta.
- `saldo` (double) - Saldo disponível na conta.

**Métodos:**
- `depositar(double valor)`: Adiciona saldo à conta.
- `sacar(double valor)`: Retira saldo, desde que haja saldo suficiente.
- `exibirSaldo()`: Exibe o saldo da conta.
- `toString()`: Retorna uma representação textual da conta.

### **2. `Banco`**
Gerencia um conjunto de contas bancárias e possui os seguintes atributos:
- `nome` (String) - Nome do banco.
- `contas` (ArrayList<ContaBancaria>) - Lista de contas cadastradas.

**Métodos:**
- `adicionarConta(ContaBancaria conta)`: Adiciona uma conta ao banco.
- `removerConta(ContaBancaria conta)`: Remove uma conta do banco.
- `buscarConta(int numeroConta)`: Busca uma conta pelo número e exibe as informações dela.

### **3. `Main`**
A classe principal que testa o sistema bancário:
- Cria três contas bancárias.
- Realiza um depósito e um saque.
- Exibe o saldo de uma conta.
- Adiciona as contas ao banco.
- Busca contas existentes e inexistentes no banco.
