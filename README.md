# 📚 Library Management System

This project is focus on construct a management system for libraries and focus in get better Java concepts

## 🚀 Techonologies
- **Linguagem:** Java
- **Banco de Dados (atual):** Arrays em memória
- **Banco de Dados (futuro):** SQL
- **Outros:**


## 📂 Project Structure

models/
├── Book.java
├── User.java
└── Borrow.java

services/
├── BookService.java
├── UserService.java
└── BorrowService.java

controllers/
├── BookController.java
├── UserController.java
└── BorrowController.java

## ⚙️ Features:
- Book Registry
- Borrow Registry
- Search for Available books
- Returned Books


## 📝 Features Accomplishing:
- [x] Ajuste para Livros com mais de um exemplar. Hoje não existe a regra, caso tenha mais de um livro exemplar, automaticamente todos ficam indisponíveis.
---
### _1. Gerenciamento de Usuários_
  - [x] Cadastrar usuários (nome, ID, tipo: aluno, professor, visitante, etc.).
  - [x] Remover usuários.
  - [x] Listar todos os usuários.
  - [x] Atualizar dados de usuários.
---
### _2. Controle de empréstimo_
  - [ ] Definir prazo de devolução (ex.: 7 dias).
  - [ ] Marcar empréstimos atrasados. 
  - [ ] Calcular multa por atraso. 
  - [ ] Permitir renovar o empréstimo (se não houver reserva).
  - [ ] Histórico de empréstimos.
---
### _3. Sistema de Reservas_
  - [ ] Usuário pode reservar um livro se todos os exemplares estiverem emprestados.
  - [ ] Quando um exemplar é devolvido, o próximo da fila de reservas é notificado (simulado).
---
### _4. Busca Avançada_
  - [ ] Título
  - [ ] Autor
  - [ ] Assunto
  - [ ] Ano de publicação
  - [ ] Usar equalsIgnoreCase() e contains() para treinar filtragem de strings.
---
### _5. Relatórios_
  - [ ] Quantos livros existem no acervo.
  - [ ] Quantos exemplares estão disponíveis vs. emprestados. 
  - [ ] Quantos empréstimos cada usuário já fez. 
  - [ ] Livros mais emprestados.
---
### _6. Persistência em Arquivo_
  - [ ] Salvar os dados em arquivo (.txt ou .csv) para não perder tudo ao fechar o programa. 
  - [ ] Ler os dados na inicialização do sistema. 
  - [ ] Depois, evoluir para usar MySQL/SQLite (quando quiser praticar banco de dados).
---
### _7. Herança/Polimorfismo para Usuários_
  - Diferenciar Usuário em subclasses:
  - [ ] Aluno → pode pegar até 3 livros por vez.
  - [ ] Professor → pode pegar até 5.
  - [ ] Visitante → só pode ler dentro da biblioteca. 
  - OBS: Treinar sobreposição de métodos (@Override) para regras diferentes de empréstimo.
---
### _8. Tratamento de Exceções_
- Lidar com erros como:
- [ ] Usuário não encontrado. 
- [ ] Livro inexistente. 
- [ ] Tentativa de devolver um livro que não foi emprestado. 
- [ ] Criar exceções personalizadas (LivroNaoEncontradoException, UsuarioNaoRegistradoException).
-------
### _Funcionalidades Futuras_
- [ ] Sistema de autenticação e login de usuários
- [ ] Controle de diferentes perfis (Administrador, Bibliotecário, Leitor)
- [ ] Histórico de empréstimos por usuário
- [ ] Relatórios (livros mais emprestados, usuários ativos, etc.)
- [ ] Notificações por e-mail para prazos de devolução
- [ ] Migração do armazenamento em memória para banco de dados **(SQL)**
- [ ] Integração com API externa de livros (ex.: Google Books)
- [ ] Refatorar para Spring Web
- [ ] Testes automatizados
- [ ] Deploy em servidor na nuvem
- [ ] Interface web amigável (WEB)
