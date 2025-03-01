# ✍️ Adição de Texto ao Arquivo - Java

## 🔍 Descrição
Este programa solicita ao usuário um texto e adiciona ao final do arquivo `saida.txt`, sem sobrescrever o conteúdo anterior.

## 📂 Funcionalidades
### **1. Entrada de Dados**
- O usuário pode digitar várias linhas para adicionar ao arquivo.
- O programa pergunta se deseja adicionar outra linha antes de finalizar.

### **2. Escrita no Arquivo**
- O texto digitado é **adicionado** ao final do arquivo `saida.txt`.
- Se o arquivo não existir, ele será criado automaticamente.

### **3. Tratamento de Erros**
- Se houver problemas na escrita, uma mensagem de erro é exibida.
- Garante que apenas respostas válidas (`s/n`) sejam aceitas.

## 🎯 Conceitos Praticados
- Manipulação de arquivos com `FileWriter` no modo de adição (`append = true`).
- Entrada e validação de dados com `Scanner`.
- Uso de loops (`do-while`) para permitir múltiplas entradas.
- Tratamento de exceções (`IOException`) para lidar com falhas na escrita do arquivo.
