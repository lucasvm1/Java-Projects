# 🔠 Contagem de Palavras em Arquivo - Java

## 🔍 Descrição
Este programa lê um arquivo de texto (`entrada.txt`) e conta o número total de palavras, considerando espaços, tabulações e quebras de linha como separadores.

## 📂 Funcionalidades
### **1. Leitura do Arquivo**
- O programa abre e lê o conteúdo do arquivo `entrada.txt`.
- Armazena todo o texto do arquivo em um `StringBuilder` para processamento.

### **2. Contagem de Palavras**
- Divide o texto em palavras utilizando `split("\s+")`, garantindo separação precisa.
- Exibe o total de palavras no console.
- Caso o arquivo esteja vazio, informa ao usuário.

### **3. Tratamento de Erros**
- Se o arquivo não for encontrado, exibe uma mensagem apropriada.
- Se houver problemas na leitura, captura a exceção e exibe uma mensagem.

## 🎯 Conceitos Praticados
- Leitura de arquivos com `BufferedReader`.
- Manipulação de strings com `StringBuilder` para eficiência.
- Uso de expressões regulares (`split("\s+")`) para dividir palavras corretamente.
- Tratamento de exceções com `FileNotFoundException` e `IOException`.
