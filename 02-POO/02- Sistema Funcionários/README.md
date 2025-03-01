# 💼 Sistema de Funcionários em Java

## 🔍 Descrição
Este projeto implementa um sistema básico de funcionários utilizando **Programação Orientada a Objetos (POO)** em Java. Ele simula diferentes tipos de funcionários, aplicando **bônus salariais específicos** para cada cargo.

## 📚 Classes Implementadas
### **1. `Funcionario`**
Classe base que representa um funcionário genérico.

**Atributos:**
- `nome` (String) - Nome do funcionário.
- `salario` (double) - Salário base do funcionário.

**Métodos:**
- `getNome()`, `setNome(String nome)`: Obtém e define o nome do funcionário.
- `getSalario()`, `setSalario(double salario)`: Obtém e define o salário base do funcionário.

### **2. `Desenvolvedor`**
Classe que estende `Funcionario` e representa um desenvolvedor.

**Atributos:**
- `bonus` (double) - Bônus de 10% sobre o salário base.

**Métodos:**
- `getBonus()`, `setBonus(double bonus)`: Obtém e define o bônus.
- `getSalario()`: Retorna o salário já ajustado com o bônus.

### **3. `Gerente`**
Classe que estende `Funcionario` e representa um gerente.

**Atributos:**
- `bonus` (double) - Bônus de 15% sobre o salário base.

**Métodos:**
- `getBonus()`, `setBonus(double bonus)`: Obtém e define o bônus.
- `getSalario()`: Retorna o salário já ajustado com o bônus.

### **4. `Main`**
A classe principal que testa o sistema de funcionários:
- Cria um `Gerente` e um `Desenvolvedor`, ambos com salário base de **1000**.
- Exibe o salário final de cada um, considerando o bônus aplicado.


Este projeto demonstra o uso de **herança** e **sobrescrita de métodos** para personalizar o comportamento das classes derivadas.
