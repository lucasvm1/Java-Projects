# 🔢 Contagem de Caracteres em Arquivo - Java

## 🔍 Descrição
Este programa lê um arquivo de texto (`entrada.txt`) e conta o número total de caracteres, ignorando espaços em branco e quebras de linha.

## 📂 Funcionalidades
### **1. Leitura do Arquivo**
- O programa abre e lê o conteúdo do arquivo `entrada.txt`.
- Armazena todo o texto do arquivo para processamento.

### **2. Processamento dos Caracteres**
- Remove todos os espaços e quebras de linha.
- Conta o total de caracteres restantes e exibe o resultado no console.

### **3. Tratamento de Erros**
- Se o arquivo não for encontrado, exibe uma mensagem amigável.
- Se houver problemas na leitura do arquivo, informa o erro ao usuário.

## 🎯 Conceitos Praticados
- Leitura de arquivos com `BufferedReader`.
- Manipulação de strings com `StringBuilder` para eficiência.
- Uso de expressões regulares (`replaceAll("\s+", "")`) para remoção de espaços.
- Tratamento de exceções com `IOException`.
