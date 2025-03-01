# 💳 Sistema de Pagamentos em Java

## 🔍 Descrição
Este projeto implementa um sistema de pagamentos utilizando **interfaces** e **polimorfismo** em Java. Ele permite simular pagamentos utilizando diferentes métodos, como **cartão de crédito, boleto e Pix**, aplicando taxas específicas para cada tipo.

## 📚 Classes Implementadas
### **1. `Pagamento` (Interface)**
Define o comportamento de qualquer método de pagamento.

**Métodos:**
- `pagar(double valor)`: Calcula o valor final do pagamento aplicando a taxa correspondente.

### **2. `CartaoCredito`**
Classe que representa um pagamento via cartão de crédito.

**Atributos:**
- `taxa` (double) - Taxa percentual aplicada ao pagamento.

**Métodos:**
- `pagar(double valor)`: Retorna o valor total a ser pago considerando a taxa.

### **3. `Boleto`**
Classe que representa um pagamento via boleto bancário.

**Atributos:**
- `taxa` (double) - Taxa percentual aplicada ao pagamento.

**Métodos:**
- `pagar(double valor)`: Retorna o valor total a ser pago considerando a taxa.

### **4. `Pix`**
Classe que representa um pagamento via Pix.

**Atributos:**
- `taxa` (double) - Taxa percentual aplicada ao pagamento.

**Métodos:**
- `pagar(double valor)`: Retorna o valor total a ser pago considerando a taxa.

### **5. `Main`**
A classe principal que testa o sistema de pagamentos:
- Cria três métodos de pagamento (`Cartão de Crédito`, `Pix` e `Boleto`) com taxas específicas.
- Calcula o valor final para um pagamento de **100** utilizando cada método.

Este projeto demonstra o uso de **interfaces**, **polimorfismo** e **métodos de cálculo de pagamento** para criar um sistema flexível e extensível.
