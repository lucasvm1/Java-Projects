# 📖 Leitura de Arquivo - Java

## 🔍 Descrição
Este programa lê o conteúdo de um arquivo `entrada.txt` e exibe seu conteúdo linha por linha no console.

## 📂 Funcionalidades
### **1. Verificação do Arquivo**
- O programa tenta abrir o arquivo `entrada.txt` no caminho especificado.
- Caso o arquivo não exista, uma mensagem amigável é exibida.

### **2. Leitura e Exibição**
- O conteúdo do arquivo é lido **linha por linha** e impresso no terminal.
- Utiliza `BufferedReader` para otimizar a leitura do arquivo.

### **3. Tratamento de Erros**
- Se o arquivo não for encontrado, o programa exibe um aviso específico.
- Se ocorrer outro erro, o programa captura a falha e evita a interrupção abrupta.

## 🎯 Conceitos Praticados
- Leitura de arquivos com `BufferedReader`.
- Uso de `FileReader` para abertura de arquivos.
- Estrutura `try-with-resources` para gerenciamento de recursos.
- Tratamento de exceções com `FileNotFoundException` e `IOException`.
