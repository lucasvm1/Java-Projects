# 🔎 Busca de Palavra em Arquivo - Java

## 🔍 Descrição
Este programa permite que o usuário busque uma palavra dentro de um arquivo `entrada.txt` e informa quantas vezes ela aparece no texto.

## 📂 Funcionalidades
### **1. Entrada do Usuário**
- O usuário digita a palavra que deseja buscar no arquivo.

### **2. Leitura e Processamento do Arquivo**
- O arquivo `entrada.txt` é lido e seu conteúdo é processado.
- A busca não diferencia maiúsculas e minúsculas (`case-insensitive`).
- A contagem de ocorrências da palavra no arquivo é feita corretamente.

### **3. Tratamento de Erros**
- Se o arquivo não for encontrado, exibe uma mensagem apropriada.
- Se houver falhas na leitura, captura a exceção e informa ao usuário.

## 🎯 Conceitos Praticados
- Leitura de arquivos com `BufferedReader`.
- Manipulação de strings para busca com `equalsIgnoreCase()`.
- Uso de `split("\s+")` para segmentação precisa das palavras.
- Tratamento de exceções com `FileNotFoundException` e `IOException`.
