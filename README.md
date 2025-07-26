# Extrator de Informações com Regex em Java Puro

Este é um projeto simples desenvolvido em **Java puro (sem frameworks)** para **extrair informações específicas** de arquivos de texto utilizando expressões regulares. As informações que podem ser extraídas incluem:

- Endereços de **e-mail**
- **Números de telefone**
- **CPFs**
- **Links HTTPS**
- **Expressões regulares personalizadas**

## ⚙️ Funcionamento

Ao executar o programa, ele realiza os seguintes passos:
---
### 1.Exibe no terminal as opções de extração:
   1. - Email
   2. - Telefone
   3. - CPFs
   4. - Links
   5. - Meu próprio Regex

### 2.Solicita o **caminho do arquivo de texto** de entrada
### 3.Solicita o **caminho da pasta de saída**, onde os resultados serão salvos como arquivos `.txt`.
---

## 📁 Estrutura de Pastas
src/

├── controller/
│ ├── abstracts/
│ ├── interfaces/
│

├── service/
│ ├── abstracts/
│ 
│ ├── interface/

├── views/
│ ├── telas/
│ │ └── (classes responsáveis por exibição e interação)
│ └── printColor/
│ └── (utilitários para impressão colorida no terminal)

## Exemplos de Regex Utilizados

    Email: [\\w\\.-]+@[\\w\\.-]+\\.\\w+

    Telefone (BR): \\(?\\d{2}\\)?\\s?9?\\d{4}-?\\d{4}

    CPF: \\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}

    HTTPS Link: https://[\\w\\.-/\\?=&#]+

    Regex Customizado: Fornecido pelo usuário no terminal

## 💡 Observações

    O projeto não depende de bibliotecas externas.

    Os arquivos de saída são salvos com nomes descritivos como emails.txt, cpfs.txt, etc.

    Requer Java 8+ para compilação e execução.

## Video 
[Video](Video/VideoProjeto.webm)

# 🧑‍💻 Autor

Desenvolvido por [Gabriel] — sinta-se à vontade para contribuir ou sugerir melhorias!