# Product - ms

## ENDpoints
- BaseURL: /products
- POST: create()
- GET: getAll()
- GET /{id}: getById()
- PUT /{id}: update()
- DELETE /{id} inactive()

## MODEL
```json
{
    "id":1,
    "name": "Iphone 13 Pro Max",
    "description": "Celular de ultima geração.",
    "price": 6999.90,
    "isAvaliable": true
}
```

## Business Rules
- Só é possível a criação de produtos com o preço positivo;
- Não é possível pesquisar produtos que não estão disponíveis;
- Não é possivel inserir descrições com menos de 50 caracteres;
