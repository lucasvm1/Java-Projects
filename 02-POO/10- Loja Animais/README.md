# 🐾 Sistema de Animais em Java

## 🔍 Descrição
Este projeto implementa um sistema de representação de animais utilizando **herança** e **polimorfismo** em Java. Ele permite criar diferentes tipos de animais e fazer com que cada um emita seu próprio som.

## 📚 Classes Implementadas
### **1. `Animal` (Classe Abstrata)**
Classe base que representa um animal genérico.

**Atributos:**
- `nome` (String) - Nome do animal.
- `idade` (int) - Idade do animal.

**Métodos:**
- `getNome()`, `setNome(String nome)`: Obtém e define o nome do animal.
- `getIdade()`, `setIdade(int idade)`: Obtém e define a idade do animal.
- `emitirSom()`: Método abstrato que deve ser implementado por cada animal para emitir seu som característico.

### **2. `Cachorro`**
Classe que estende `Animal` e representa um cachorro.

**Comportamento:**  
- Quando o método `emitirSom()` é chamado, o cachorro **late**.

### **3. `Gato`**
Classe que estende `Animal` e representa um gato.

**Comportamento:**  
- Quando o método `emitirSom()` é chamado, o gato **mia**.

### **4. `Papagaio`**
Classe que estende `Animal` e representa um papagaio.

**Atributo Extra:**  
- `frase` (String) - Frase que o papagaio repete.

**Comportamento:**  
- Quando o método `emitirSom()` é chamado, o papagaio **fala a frase armazenada**.

### **5. `Main`**
A classe principal que testa o sistema de animais:
- Cria um `Cachorro`, um `Gato` e um `Papagaio`.
- Faz com que cada um emita seu som específico.

Este projeto demonstra o uso de **herança**, **polimorfismo** e **classes abstratas** para estruturar um sistema de modelagem de animais.
