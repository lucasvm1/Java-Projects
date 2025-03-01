# ⚔️ Sistema de Batalha de Personagens em Java

## 🔍 Descrição
Este projeto implementa um sistema de combate entre personagens utilizando **herança** e **polimorfismo** em Java. Ele permite criar personagens com características distintas e simular batalhas entre eles.

## 📚 Classes Implementadas
### **1. `Personagem` (Classe Abstrata)**
Classe base que representa um personagem genérico.

**Atributos:**
- `nome` (String) - Nome do personagem.
- `vida` (int) - Quantidade de pontos de vida.
- `ataque` (int) - Força do ataque do personagem.

**Métodos:**
- `getNome()`, `setNome(String nome)`: Obtém e define o nome do personagem.
- `getVida()`, `setVida(int vida)`: Obtém e define os pontos de vida do personagem.
- `getAtaque()`, `setAtaque(int ataque)`: Obtém e define a força de ataque.
- `atacar(Personagem alvo)`: Realiza um ataque contra outro personagem, reduzindo sua vida.

### **2. `Guerreiro`**
Classe que estende `Personagem` e representa um guerreiro.

**Características:**
- Vida inicial: **150**
- Ataque: **15**

### **3. `Mago`**
Classe que estende `Personagem` e representa um mago.

**Características:**
- Vida inicial: **100**
- Ataque: **30**

### **4. `Main`**
A classe principal que testa o sistema de combate:
- Cria um `Mago` e um `Guerreiro` com nomes personalizados.
- Simula ataques entre os personagens até que um deles seja derrotado.

Este projeto demonstra o uso de **herança**, **métodos abstratos** e **sistema de combate por turnos** para criar uma dinâmica de RPG simples.
