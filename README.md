```
# 📦 API de Pagamento de Hospedagem - Java Spring Boot

Seja bem-vindo(a) ao meu projeto de estudo em **Java com Spring Boot**! 🚀  
Aqui desenvolvi uma API REST para gerenciamento de pagamentos de hospedagem, onde o sistema calcula automaticamente valores de hospedagem, total de diárias e o valor individual por pessoa.

---

## 📑 Descrição

Este projeto simula o controle de pagamentos de hospedagem para um hotel fictício em Recife, onde é possível cadastrar hospedagens informando:
- Nome do responsável
- Origem e destino da viagem
- Data de início e término
- Quantidade de pessoas
- Valor da diária

A API calcula automaticamente:
- Total de diárias
- Valor total da hospedagem
- Valor por pessoa

---

## 🛠️ Tecnologias e Ferramentas

- **Java 17**
- **Spring Boot 3**
- **Spring Data JPA**
- **Hibernate**
- **Jakarta Validation**
- **Banco de Dados MySQL**
- **Lombok**
- **Postman** (para testes da API)
- **Maven**

---

## 📚 Funcionalidades

✅ Cadastro de pagamento de hospedagem  
✅ Cálculo automático de diárias baseado em datas  
✅ Cálculo do valor total das diárias  
✅ Cálculo do valor da hospedagem por pessoa  
✅ Persistência no banco de dados  
✅ API RESTful estruturada em camadas (Controller, Service, Repository, Entity)

---

## 📦 Como executar o projeto

1️⃣ Clone este repositório:
```bash
git clone https://github.com/seu-usuario/nome-do-repositorio.git
```

2️⃣ Acesse o projeto:
```bash
cd nome-do-repositorio
```

3️⃣ Execute o projeto:
```bash
./mvnw spring-boot:run
```

4️⃣ Acesse a API via:
```
http://localhost:8080/pagamento
```

Para testar via **Postman**, envie um POST para:
```
http://localhost:8080/pagamento
```
Com o corpo JSON, por exemplo:
```json
{
  "nome": "João Silva",
  "origemViagem": "Recife",
  "destinoViagem": "Fernando de Noronha",
  "dataInicioViagem": "2024/04/21",
  "dataFimViagem": "2024/04/25",
  "quantidadePessoas": 2,
  "valorDiaria": 250.00
}
```

---

## 📝 Melhorias Futuras

- ✅ Implementar autenticação com Spring Security  
- ✅ Adicionar testes unitários e de integração  
- ✅ Documentar a API com Swagger  
- ✅ Deploy em nuvem (Heroku, Render ou Railway)

---

## 👨‍💻 Autor

Desenvolvido com ❤️ por **Magno Souza**  
🔗 [Seu LinkedIn](www.linkedin.com/in/magno-souza-dos-santos)  
🔗 [Seu GitHub](https://github.com/MSouza27)
