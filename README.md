# Gerenciamento de Produtos com Spring Boot

Este projeto é uma aplicação de gerenciamento de produtos construída com Spring Boot. Ele fornece operações CRUD (Criar, Ler, Atualizar, Excluir) para gerenciar informações de produtos.

## Tecnologias Utilizadas

- **Spring Boot:** Framework Java para desenvolvimento de aplicativos.
- **Spring Data JPA:** Facilita o acesso a dados usando o JPA.
- **Lombok:** Reduz a verbosidade do código Java.
- **ModelMapper:** Facilita o mapeamento entre objetos DTO e entidades de modelo.
- **RESTful API:** Utiliza métodos HTTP para interações.
- **Validação de Entrada:** Garante dados válidos com validação de entrada.
- **Injeção de Dependência:** Usa injeção de dependência para gerenciar componentes.
- **Banco de Dados:** Armazena informações de produtos.

## Endpoints da API

A API fornece os seguintes endpoints para gerenciamento de produtos:

- **Criação de Produto (POST):** Crie um novo produto enviando um JSON no corpo da solicitação para `/products`. O produto é criado com base nos dados fornecidos, incluindo nome, descrição e preço. O produto é marcado como disponível por padrão.

- **Recuperação de Produtos (GET):** Recupere a lista de todos os produtos fazendo uma solicitação GET para `/products`. Isso retornará uma lista de produtos existentes no banco de dados.

- **Recuperação de Produto por ID (GET):** Recupere um produto específico fornecendo seu ID em uma solicitação GET para `/products/{id}`.

- **Atualização de Produto por ID (PUT):** Atualize um produto existente fornecendo seu ID em uma solicitação PUT para `/products/{id}`. Envie os novos dados do produto, como nome, descrição e preço, no corpo da solicitação.

- **Desativação de Produto (DELETE):** Desative um produto existente fornecendo seu ID em uma solicitação DELETE para `/products/deactivate/{id}`. O produto será marcado como indisponível.

- **Ativação de Produto (DELETE):** Ative um produto desativado fornecendo seu ID em uma solicitação DELETE para `/products/activate/{id}`. O produto será marcado como disponível novamente.

## Uso

Para usar a API, você pode fazer solicitações HTTP aos endpoints mencionados acima, dependendo da operação desejada (POST, GET, PUT, DELETE). Certifique-se de incluir os dados necessários no corpo da solicitação, no formato JSON, conforme especificado nas operações.

Aqui está um exemplo de solicitação POST para criar um novo produto:

```http
POST /products
Content-Type: application/json

{
  "name": "Nome do Produto",
  "description": "Descrição do Produto",
  "price": 19.99
}
