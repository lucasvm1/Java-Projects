# 📜 Registro de Logs com Timestamps - Java

## 🔍 Descrição
Este programa permite registrar logs em um arquivo `log.txt`, adicionando uma nova linha a cada execução com a data e hora do evento.

## 📂 Funcionalidades
### **1. Entrada do Usuário**
- O usuário pode digitar mensagens que serão salvas no arquivo de log.
- O programa permite adicionar várias mensagens antes de encerrar.

### **2. Registro de Logs**
- Cada linha do `log.txt` contém um timestamp e a mensagem fornecida pelo usuário.
- O formato do log é:
  ```
  [YYYY/MM/DD HH:MM:SS]: Mensagem do usuário
  ```
- Os logs são **acrescentados** ao arquivo em vez de sobrescrevê-lo.

### **3. Tratamento de Erros**
- Se houver falha ao gravar no arquivo, o programa exibe uma mensagem de erro apropriada.

## 🎯 Conceitos Praticados
- Manipulação de arquivos com `FileWriter` no modo `append = true`.
- Uso de `LocalDateTime` e `DateTimeFormatter` para geração de timestamps.
- Entrada de dados do usuário com `Scanner`.
- Estrutura `try-with-resources` para garantir fechamento correto do arquivo.
- Tratamento de exceções com `IOException`.
