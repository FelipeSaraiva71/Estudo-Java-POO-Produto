☕ Estudo Java - Cadastro de Produtos com POO
Repositório criado para praticar os fundamentos da Programação Orientada a Objetos (POO) em Java.
Este projeto implementa um sistema simples de cadastro de produtos com validação de dados, classificação por faixa de valor e formatação monetária no padrão brasileiro.

🛠️ Funcionalidades
✅ Cadastro de produtos via terminal: Usuário informa nome e valor com interação simples.

✅ Validação de dados:

O nome deve conter apenas letras e espaços.

O valor deve ser positivo e maior que zero.

✅ Classificação automática:

Produtos são categorizados como:

barato (até R$ 20)

caro (de R$ 20,01 a R$ 50)

muito caro (acima de R$ 50)

✅ Formatação monetária: Os valores são exibidos em formato R$, com separador decimal e de milhar brasileiros.

📜 Estrutura do Código
Produto.java – Classe que representa o produto, com construtor, encapsulamento, método toString() e classificação de faixa de valor.

Util.java – Classe com métodos estáticos para validação de nome e valor.

Main.java – Classe principal com entrada de dados via terminal, controle de fluxo e exibição dos produtos cadastrados.

🔮 Melhorias Futuras
💾 Salvar os produtos em um arquivo local ou banco de dados.

🖼️ Criar uma interface gráfica com Swing ou JavaFX.

✏️ Adicionar funcionalidades para editar e excluir produtos.

🧪 Implementar testes automatizados com JUnit.

✨ Autor
Desenvolvido por Felipe Saraiva
