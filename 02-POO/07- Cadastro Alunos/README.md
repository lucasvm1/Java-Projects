# 🎓 Sistema de Gerenciamento de Alunos em Java

## 🔍 Descrição
Este projeto implementa um sistema simples de gerenciamento de alunos utilizando **Programação Orientada a Objetos (POO)** em Java. Ele permite cadastrar alunos, registrar notas e calcular a média final para determinar a aprovação.

## 📚 Classes Implementadas
### **1. `Aluno`**
Classe que representa um aluno e suas notas.

**Atributos:**
- `nome` (String) - Nome do aluno.
- `matricula` (String) - Código de matrícula do aluno.
- `notas` (ArrayList<Double>) - Lista de notas do aluno.

**Métodos:**
- `getNome()`, `setNome(String nome)`: Obtém e define o nome do aluno.
- `getMatricula()`: Obtém o código de matrícula do aluno.
- `adicionaNota(double nota)`: Adiciona uma nota à lista de notas do aluno.
- `calcularMedia()`: Calcula a média das notas do aluno.
- `verificarAprovacao()`: Retorna `true` se a média for **igual ou superior a 7**, indicando aprovação.

### **2. `Main`**
A classe principal que testa o sistema de alunos:
- Cria um `Aluno` e registra suas notas.
- Calcula a média final e verifica se o aluno foi aprovado.

Este projeto demonstra o uso de **encapsulamento** e **manipulação de listas** para gerenciar informações acadêmicas de forma eficiente.
