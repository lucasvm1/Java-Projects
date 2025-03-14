# Sistema de Cadastro de Usuários com ViaCEP / User Registration System with ViaCEP

[Português](#português) | [English](#english)

---

<a id="português"></a>
## Português

Esta API fornece um serviço para cadastro de usuários com integração à API ViaCEP para preenchimento automático dos dados de endereço, armazenando os dados em banco de dados.

### Estrutura do Projeto

O projeto segue uma arquitetura em camadas:

1. **Controllers**: Gerenciam as requisições HTTP e respostas
   - `UserController.java`: Implementa endpoint REST para criação de usuários
   - `AddressController.java`: Implementa endpoint REST para consulta de CEP

2. **Services**: Contém a lógica de negócio
   - `UserService.java`: Serviço responsável pelo cadastro de usuários
   - `CepService.java`: Serviço responsável por fazer a chamada à API externa ViaCEP

3. **DTOs (Data Transfer Objects)**: Definem os dados de entrada e saída da API
   - `UserDto.java`: Representa os dados para criação de um usuário
   - `AddressDto.java`: Representa os dados de endereço
   - `CepResponse.java`: Representa os dados retornados pela API ViaCEP

4. **Models**: Definem as entidades do banco de dados
   - `UserModel.java`: Representa a entidade de usuário
   - `AddressModel.java`: Representa a entidade de endereço

5. **Repositories**: Responsáveis pela comunicação com o banco de dados
   - `UserRepository.java`: Repositório para operações com usuários
   - `AddressRepository.java`: Repositório para operações com endereços

6. **Configs**: Configurações do projeto
   - `WebClientConfig.java`: Configuração do WebClient para chamadas à API ViaCEP

### Funcionalidades

A API oferece os seguintes endpoints:

- **POST /users**: Cadastra um novo usuário com seus dados pessoais e endereço
- **GET /buscar/{cep}**: Consulta informações de endereço a partir de um CEP

### Tecnologias Utilizadas

- Spring Boot
- Spring Web
- Spring Data JPA
- WebClient para requisições HTTP reativas
- Lombok para redução de código boilerplate
- Validação de dados com Jakarta Validation
- Banco de dados com JPA/Hibernate

### Como Usar

Para cadastrar um novo usuário, faça uma requisição POST para:

```
POST /users
```

Exemplo de corpo da requisição:

```json
{
  "firstName": "João",
  "lastName": "Silva",
  "email": "joao.silva@email.com",
  "phoneNumber": "11999998888",
  "cep": "01001000"
}
```

Exemplo de resposta:

```json
{
  "id": "a1b2c3d4-e5f6-7890-a1b2-c3d4e5f67890",
  "firstName": "João",
  "lastName": "Silva",
  "email": "joao.silva@email.com",
  "phoneNumber": "11999998888",
  "addresses": [
    {
      "id": "f1e2d3c4-b5a6-7890-f1e2-d3c4b5a67890",
      "cep": "01001-000",
      "region": "Sudeste",
      "state": "SP",
      "city": "São Paulo",
      "district": "Sé",
      "street": "Praça da Sé"
    }
  ],
  "createdAt": "2023-01-01"
}
```

Para consultar informações de um CEP, faça uma requisição GET para:

```
GET /buscar/01001000
```

Exemplo de resposta:

```json
{
  "cep": "01001-000",
  "region": "Sudeste",
  "state": "SP",
  "city": "São Paulo",
  "district": "Sé",
  "street": "Praça da Sé"
}
```

### Tratamento de Erros

Se ocorrer algum erro na comunicação com a API externa ou no processamento dos dados, a aplicação retornará um código de status apropriado ao cliente com informações sobre o erro.

---

<a id="english"></a>
## English

This API provides a service for user registration with integration to the ViaCEP API for automatic address data completion, storing data in a database.

### Project Structure

The project follows a layered architecture:

1. **Controllers**: Handle HTTP requests and responses
   - `UserController.java`: Implements REST endpoint for user creation
   - `AddressController.java`: Implements REST endpoint for ZIP code lookup

2. **Services**: Contain business logic
   - `UserService.java`: Service responsible for user registration
   - `CepService.java`: Service responsible for making calls to the external ViaCEP API

3. **DTOs (Data Transfer Objects)**: Define API input and output data
   - `UserDto.java`: Represents data for user creation
   - `AddressDto.java`: Represents address data
   - `CepResponse.java`: Represents data returned by the ViaCEP API

4. **Models**: Define database entities
   - `UserModel.java`: Represents the user entity
   - `AddressModel.java`: Represents the address entity

5. **Repositories**: Responsible for database communication
   - `UserRepository.java`: Repository for user operations
   - `AddressRepository.java`: Repository for address operations

6. **Configs**: Project configurations
   - `WebClientConfig.java`: WebClient configuration for ViaCEP API calls

### Features

The API offers the following endpoints:

- **POST /users**: Registers a new user with personal data and address
- **GET /buscar/{cep}**: Looks up address information from a ZIP code

### Technologies Used

- Spring Boot
- Spring Web
- Spring Data JPA
- WebClient for reactive HTTP requests
- Lombok for boilerplate code reduction
- Data validation with Jakarta Validation
- Database with JPA/Hibernate

### How to Use

To register a new user, make a POST request to:

```
POST /users
```

Example request body:

```json
{
  "firstName": "John",
  "lastName": "Smith",
  "email": "john.smith@email.com",
  "phoneNumber": "11999998888",
  "cep": "01001000"
}
```

Example response:

```json
{
  "id": "a1b2c3d4-e5f6-7890-a1b2-c3d4e5f67890",
  "firstName": "John",
  "lastName": "Smith",
  "email": "john.smith@email.com",
  "phoneNumber": "11999998888",
  "addresses": [
    {
      "id": "f1e2d3c4-b5a6-7890-f1e2-d3c4b5a67890",
      "cep": "01001-000",
      "region": "Sudeste",
      "state": "SP",
      "city": "São Paulo",
      "district": "Sé",
      "street": "Praça da Sé"
    }
  ],
  "createdAt": "2023-01-01"
}
```

To look up information for a ZIP code, make a GET request to:

```
GET /buscar/01001000
```

Example response:

```json
{
  "cep": "01001-000",
  "region": "Sudeste",
  "state": "SP",
  "city": "São Paulo",
  "district": "Sé",
  "street": "Praça da Sé"
}
```

### Error Handling

If an error occurs in communication with the external API or in data processing, the application will return an appropriate status code to the client with information about the error.