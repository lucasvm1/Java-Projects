# 📝 Escrita em Arquivo - Java

## 🔍 Descrição
Este programa solicita um texto ao usuário e o grava em um arquivo chamado `texto.txt`. Se o arquivo já existir, ele será sobrescrito com o novo conteúdo.

## 📂 Funcionalidades
### **1. Entrada de Dados**
- O programa solicita ao usuário um texto via terminal.
- O texto digitado é armazenado para ser escrito em um arquivo.

### **2. Escrita no Arquivo**
- O texto fornecido pelo usuário é gravado em um arquivo `texto.txt`.
- Se o arquivo já existir, ele será sobrescrito.

### **3. Tratamento de Erros**
- Caso ocorra algum problema ao gravar o arquivo (ex.: falta de permissões ou erro no disco), o programa exibe uma mensagem de erro amigável.

## 🎯 Conceitos Praticados
- Manipulação de arquivos em Java com `FileWriter`.
- Entrada de dados do usuário com `Scanner`.
- Tratamento de exceções com `IOException`.
- Uso da estrutura `try-with-resources` para fechamento automático de arquivos.
