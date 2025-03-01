# 🚗 Sistema de Veículos em Java

## 🔍 Descrição
Este projeto implementa um sistema de veículos utilizando **Programação Orientada a Objetos (POO)** em Java. Ele permite representar diferentes tipos de veículos, como **carros** e **motos**, armazenando informações relevantes para cada tipo.

## 📚 Classes Implementadas
### **1. `Veiculo`**
Classe base que representa um veículo genérico.

**Atributos:**
- `marca` (String) - Marca do veículo.
- `modelo` (String) - Modelo do veículo.
- `ano` (int) - Ano de fabricação.

**Métodos:**
- `getMarca()`, `setMarca(String marca)`: Obtém e define a marca do veículo.
- `getModelo()`, `setModelo(String modelo)`: Obtém e define o modelo do veículo.
- `getAno()`, `setAno(int ano)`: Obtém e define o ano de fabricação.
- `toString()`: Retorna uma representação textual do veículo.

### **2. `Carro`**
Classe que estende `Veiculo` e representa um carro.

**Atributos:**
- `quantidadePortas` (int) - Número de portas do carro.

**Métodos:**
- `getQuantidadePortas()`, `setQuantidadePortas(int quantidadePortas)`: Obtém e define a quantidade de portas.
- `toString()`: Retorna uma representação textual do carro, incluindo suas portas.

### **3. `Moto`**
Classe que estende `Veiculo` e representa uma moto.

**Atributos:**
- `cilindrada` (int) - Cilindradas da moto.

**Métodos:**
- `getCilindrada()`, `setCilindrada(int cilindrada)`: Obtém e define a cilindrada da moto.
- `toString()`: Retorna uma representação textual da moto, incluindo sua cilindrada.

### **4. `Main`**
A classe principal que testa o sistema de veículos:
- Cria um `Carro` e uma `Moto` com atributos predefinidos.
- Exibe as informações de cada veículo no console.

Este projeto demonstra o uso de **herança** e **sobrescrita de métodos** para personalizar o comportamento das classes derivadas.
