# Sistema de Gerenciamento de Usuários com Transferência de Saldo / User Management System with Balance Transfer

[Português](#português) | [English](#english)

---

<a id="português"></a>
## Português

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

---

<a id="english"></a>
## English

# 🚀 User Management System with Balance Transfer

This project demonstrates **my knowledge in Java**, applying essential concepts of **databases, transactions, and development best practices**.

It simulates a simple banking system, where it's possible to manage users and perform **secure balance transfers**, ensuring data integrity with **transactions (`COMMIT` and `ROLLBACK`)**.

---

## 📌 **Demonstrated Skills**
✅ **Object-Oriented Programming (OOP) with Java**  
✅ **Secure database connection via JDBC**  
✅ **CRUD implementation with PreparedStatement**  
✅ **Transaction management with COMMIT and ROLLBACK**  
✅ **Error handling and logs for efficient debugging**  
✅ **Best practices in Git usage and code versioning**  

---

## 🔧 **Technologies Used**
- ☕ **Java 17+** (Object Orientation, Exception Handling)
- 🛢 **MySQL** (Relational database, Constraints, Transactions)
- 🔗 **JDBC (Java Database Connectivity)** (Secure database integration)
- 📝 **Logger (java.util.logging)** (Log recording for monitoring)
- ⚙️ **Git and GitHub** (Version control and code organization)

---

## 🛠️ **Architecture and Code Organization**
The project follows an organized structure, separating **responsibilities** efficiently.

📂 **src/main/java/com/lucasvm**  
 ┣ 📂 **dao** *(Database access via JDBC)*  
 ┃ ┗ 🗄️ `DatabaseConnection.java`  
 ┣ 📂 **models** *(Data representation - Applied OOP)*  
 ┃ ┗ 👤 `Usuario.java`  
 ┣ 📂 **main** *(Program entry point - CLI executable)*  
 ┃ ┗ 🎬 `Main.java`  

This organization **facilitates maintenance and scalability** of the project.

---

### **💾 Database**
Before running the project, it's necessary to create the database in MySQL:

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

Configure the connection in the `DatabaseConnection.java` file:
```java
DatabaseConnection connection = new DatabaseConnection("localhost", 3306, "mydb", "root", "your_password");
```

---

## 📌 **Main Features**
### **1️⃣ User Registration and Management**
✔ **Complete CRUD (Create, Read, Update, Delete)**  
✔ **Data validation and use of PreparedStatement to prevent SQL Injection**  

### **2️⃣ Balance Transfer with Secure Transactions**
✔ **Debit and credit between accounts with `COMMIT` and `ROLLBACK`**  
✔ **Prevention of negative balance before confirming the operation**  
✔ **Detailed transaction recording in the `transacoes` table**  

### **3️⃣ Error Handling and Professional Logs**
✔ **Connection verification before each operation**  
✔ **Clear messages for the user in the console**  
✔ **Log recording (`java.util.logging`) for auditing and debugging**  

---

## 📌 **Execution Example**
```bash
===== MENU =====
1️⃣ - Register user
2️⃣ - List users
3️⃣ - Find user by ID
4️⃣ - Update user
5️⃣ - Delete user
6️⃣ - Transfer balance
7️⃣ - Exit
Choose an option: _
```

Example of **balance transfer**:
```
💰 Enter the payer ID: 1
💵 Enter the recipient ID: 2
💲 Enter the amount to be transferred: 100.00
✅ Transfer of $100.00 completed successfully!
```

If the balance is insufficient:
```
❌ Insufficient balance! Transfer canceled.
```
