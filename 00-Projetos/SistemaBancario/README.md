# 🚀 Sistema de Gerenciamento de Usuários com Transferência de Saldo

Este projeto demonstra **meu conhecimento em Java**, aplicando conceitos essenciais de **banco de dados, transações e boas práticas de desenvolvimento**.  

Ele simula um sistema bancário simples, onde é possível gerenciar usuários e realizar **transferências seguras de saldo**, garantindo integridade dos dados com **transações (`COMMIT` e `ROLLBACK`)**.

---

## 📌 **Habilidades Demonstradas**
✅ **Programação Orientada a Objetos (POO) com Java**  
✅ **Conexão segura com banco de dados via JDBC**  
✅ **Implementação de CRUD com PreparedStatement**  
✅ **Gestão de transações com COMMIT e ROLLBACK**  
✅ **Tratamento de erros e logs para depuração eficiente**  
✅ **Boas práticas no uso do Git e versionamento de código**  

---

## 🔧 **Tecnologias Utilizadas**
- ☕ **Java 17+** (Orientação a Objetos, Exception Handling)
- 🛢 **MySQL** (Banco de dados relacional, Constraints, Transações)
- 🔗 **JDBC (Java Database Connectivity)** (Integração segura com banco de dados)
- 📝 **Logger (java.util.logging)** (Registro de logs para monitoramento)
- ⚙️ **Git e GitHub** (Controle de versão e organização de código)

---

## 🛠️ **Arquitetura e Organização do Código**
O projeto segue uma estrutura organizada, separando **responsabilidades** de maneira eficiente.

📂 **src/main/java/com/lucasvm**  
 ┣ 📂 **dao** *(Acesso ao banco de dados via JDBC)*  
 ┃ ┗ 🗄️ `DatabaseConnection.java`  
 ┣ 📂 **models** *(Representação dos dados - POO aplicada)*  
 ┃ ┗ 👤 `Usuario.java`  
 ┣ 📂 **main** *(Ponto de entrada do programa - Executável via CLI)*  
 ┃ ┗ 🎬 `Main.java`  

Essa organização **facilita a manutenção e escalabilidade** do projeto.

---

### **💾 Banco de Dados**
Antes de rodar o projeto, é necessário criar a base de dados no MySQL:

```sql
CREATE DATABASE mydb;
USE mydb;

CREATE TABLE usuarios (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(100),
    email VARCHAR(100) UNIQUE,
    idade INT,
    saldo DECIMAL(10,2) DEFAULT 0
);

CREATE TABLE transacoes (
    id INT PRIMARY KEY AUTO_INCREMENT,
    idOrigem INT,
    idDestino INT,
    valor DECIMAL(10,2),
    dataTransacao TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (idOrigem) REFERENCES usuarios(id),
    FOREIGN KEY (idDestino) REFERENCES usuarios(id)
);
```

Configurar a conexão no arquivo `DatabaseConnection.java`:
```java
DatabaseConnection connection = new DatabaseConnection("localhost", 3306, "mydb", "root", "sua_senha");
```

---

## 📌 **Principais Funcionalidades**
### **1️⃣ Cadastro e Gerenciamento de Usuários**
✔ **CRUD completo (Create, Read, Update, Delete)**  
✔ **Validação de dados e uso de PreparedStatement para evitar SQL Injection**  

### **2️⃣ Transferência de Saldo com Transações Seguras**
✔ **Débito e crédito entre contas com `COMMIT` e `ROLLBACK`**  
✔ **Prevenção de saldo negativo antes de confirmar a operação**  
✔ **Registro detalhado das transações na tabela `transacoes`**  

### **3️⃣ Tratamento de Erros e Logs Profissionais**
✔ **Verificação da conexão antes de cada operação**  
✔ **Mensagens claras para o usuário no console**  
✔ **Registro de logs (`java.util.logging`) para auditoria e depuração**  

---

## 📌 **Exemplo de Execução**
```bash
===== MENU =====
1️⃣ - Cadastrar usuário
2️⃣ - Listar usuários
3️⃣ - Buscar usuário por ID
4️⃣ - Atualizar usuário
5️⃣ - Excluir usuário
6️⃣ - Transferir saldo
7️⃣ - Sair
Escolha uma opção: _
```

Exemplo de **transferência de saldo**:
```
💰 Digite o ID do pagador: 1
💵 Digite o ID do recebedor: 2
💲 Digite o valor a ser transferido: 100.00
✅ Transferência de R$100,00 realizada com sucesso!
```

Se o saldo for insuficiente:
```
❌ Saldo insuficiente! Transferência cancelada.
```

