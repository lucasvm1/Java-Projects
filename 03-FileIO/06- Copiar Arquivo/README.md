# 📄 Cópia de Arquivo - Java

## 🔍 Descrição
Este programa copia o conteúdo de um arquivo `entrada.txt` para um novo arquivo `copia.txt`, garantindo que todo o conteúdo seja mantido.

## 📂 Funcionalidades
### **1. Leitura do Arquivo de Origem**
- O programa lê o conteúdo do arquivo `entrada.txt` linha por linha.
- Utiliza `BufferedReader` para otimizar a leitura.

### **2. Escrita no Arquivo de Destino**
- O conteúdo lido é copiado para o arquivo `copia.txt`.

### **3. Tratamento de Erros**
- Se o arquivo de origem não existir, exibe uma mensagem apropriada.
- Se ocorrer um erro na leitura ou escrita, captura a exceção e informa ao usuário.

## 🎯 Conceitos Praticados
- Manipulação de arquivos com `BufferedReader` e `FileWriter`.
- Processamento linha por linha para eficiência.
- Estrutura `try-with-resources` para gerenciamento de arquivos.
- Tratamento de exceções com `FileNotFoundException` e `IOException`.
