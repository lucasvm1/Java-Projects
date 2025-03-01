# 💼 Sistema de Funcionários com Cargos em Java

## 🔍 Descrição
Este projeto implementa um sistema de funcionários que utiliza **enumerações (Enums)** para representar diferentes cargos e calcular o salário com bônus correspondente.

## 📚 Classes Implementadas
### **1. `Cargo` (Enum)**
Enumeração que define os cargos disponíveis para os funcionários:
- `Gerente`
- `Desenvolvedor`
- `Analista`

### **2. `Funcionario`**
Classe que representa um funcionário da empresa.

**Atributos:**
- `nome` (String) - Nome do funcionário.
- `salario` (double) - Salário base do funcionário.
- `cargo` (Cargo) - Cargo do funcionário (Gerente, Desenvolvedor ou Analista).

**Métodos:**
- `getNome()`, `setNome(String nome)`: Obtém e define o nome do funcionário.
- `getSalario()`, `setSalario(double salario)`: Obtém e define o salário base do funcionário.
- `getCargo()`, `setCargo(Cargo cargo)`: Obtém e define o cargo do funcionário.
- `calcularSalario()`: Aplica um bônus salarial baseado no cargo:
  - **Gerente**: 20% de bônus.
  - **Desenvolvedor**: 10% de bônus.
  - **Analista**: 5% de bônus.

### **3. `Main`**
A classe principal que testa o sistema de funcionários:
- Cria três funcionários com diferentes cargos.
- Calcula e exibe o salário final considerando o cargo e bônus.

Este projeto demonstra o uso de **enumerações (Enums)**, **estrutura condicional** e **cálculo de bônus salarial** para organizar a gestão de funcionários de maneira eficiente.
