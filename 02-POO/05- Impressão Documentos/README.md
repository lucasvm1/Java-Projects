# 🖨️ Sistema de Impressão de Documentos em Java

## 🔍 Descrição
Este projeto implementa um sistema de impressão de documentos utilizando **interfaces** e **polimorfismo** em Java. Ele permite imprimir diferentes tipos de documentos, como **relatórios** e **contratos**.

## 📚 Classes Implementadas
### **1. `Imprimivel` (Interface)**
Define o comportamento de qualquer objeto que pode ser impresso.

**Métodos:**
- `imprimir()`: Método que deve ser implementado por todas as classes que desejam ser imprimíveis.

### **2. `Contrato`**
Classe que representa um contrato entre duas partes.

**Atributos:**
- `signatario1` (String) - Primeiro signatário do contrato.
- `signatario2` (String) - Segundo signatário do contrato.

**Métodos:**
- `imprimir()`: Exibe os nomes dos signatários do contrato.

### **3. `Relatorio`**
Classe que representa um relatório de texto.

**Atributos:**
- `conteudo` (String) - Conteúdo do relatório.

**Métodos:**
- `imprimir()`: Exibe o conteúdo do relatório.

### **4. `Main`**
A classe principal que testa o sistema de impressão:
- Cria uma lista de objetos imprimíveis (`Contrato` e `Relatorio`).
- Percorre a lista e imprime cada documento.

Este projeto demonstra o uso de **interfaces**, **polimorfismo** e **listas de objetos genéricos** para criar um sistema de impressão flexível.
