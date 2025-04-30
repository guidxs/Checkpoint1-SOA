# 📦 Projeto Checkpoint 1 - API REST com Spring Boot

Este é um projeto desenvolvido para o **Checkpoint 1** da disciplina de *ARQUITETURA ORIENTADA A SERVIÇOS (SOA) E WEB SERVICE* na **FIAP**, com o objetivo de aplicar conceitos de desenvolvimento de API REST usando Spring Boot, banco de dados H2 e testes via Postman.

---

## ✅ Funcionalidades

A aplicação oferece gerenciamento de duas entidades:

### 👨‍💼 Funcionário
- GET /funcionarios → Lista todos os funcionários  
- GET /funcionarios/{id} → Busca um funcionário pelo ID  
- POST /funcionarios → Cadastra um novo funcionário  
- PUT /funcionarios/{id} → Atualiza um funcionário existente  
- DELETE /funcionarios/{id} → Remove um funcionário  

### 📦 Pedido
- GET /pedidos → Lista todos os pedidos  
- GET /pedidos/{id} → Busca um pedido pelo ID  
- POST /pedidos → Cadastra um novo pedido  
- PUT /pedidos/{id} → Atualiza um pedido existente  
- DELETE /pedidos/{id} → Remove um pedido  

---

## 🛠️ Tecnologias utilizadas

- Java 19  
- Spring Boot  
- Spring Web  
- Spring Data JPA  
- H2 Database  
- Maven  
- IntelliJ IDEA  
- Postman  

---

## ⚙️ Como executar o projeto

1. Clone o repositório:
```
git clone https://github.com/guidxs/Checkpoint1-SOA.git
```
2. Abra o projeto no IntelliJ IDEA  
3. Aguarde o Maven baixar todas as dependências automaticamente (elas estão configuradas no `pom.xml`)  
4. Rode a classe `Main`
5. A aplicação iniciará em `http://localhost:8080`

Você já pode testar os endpoints com o Postman ou acessar o console do banco de dados H2.

---

## 🗃️ Banco de Dados

A aplicação usa um banco em memória (H2), que é reiniciado sempre que o sistema é parado.

- URL do console H2: http://localhost:8080/h2-console  
- JDBC URL: jdbc:h2:mem:testdb  
- Username: sa  
- Password: *(deixe em branco)*

---

## 🧪 Testes com Postman

Você pode usar o Postman para testar os seguintes endpoints:

### Funcionário

- GET /funcionarios  
- GET /funcionarios/{id}  
- POST /funcionarios  

Exemplo de corpo:
{
  "nome": "Maria Silva",
  "cargo": "Gerente",
  "salario": 7500.00
}

- PUT /funcionarios/{id}  
- DELETE /funcionarios/{id}  

### Pedido

- GET /pedidos  
- GET /pedidos/{id}  
- POST /pedidos  

Exemplo de corpo:
{
  "produto": "Notebook",
  "quantidade": 1,
  "preco": 5500.00
}

- PUT /pedidos/{id}  
- DELETE /pedidos/{id}  

---

## 👨‍💻 Autor

**Guilherme Doretto Sobreiro**  
RM: 99674  
Turma: FIAP - 3ESPF

---

## 📝 Observação

Este projeto foi desenvolvido para fins acadêmicos, aplicando os conceitos vistos em aula com foco em boas práticas de desenvolvimento de APIs com Java e Spring Boot.
