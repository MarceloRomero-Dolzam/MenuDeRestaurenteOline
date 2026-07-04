CREATE TABLE produtos(--cardápio
    produto_ID INT AUTO_INCREMENT PRIMARY KEY,
    nomeDoProduto VARCHAR(100) NOT NULL,
    descricaoDoProduto VARCHAR(1000) NOT NULL,
    preco DECIMAL(10,2) NOT NULL,
    categoria VARCHAR(30) NOT NULL,
    disponivel BOOLEAN
);

--inserção dos produtos no carápio
INSERT INTO produtos (nomeDoProduto, descricaoDoProduto, preco, categoria, disponivel)
VALUES('Cachorro quente simples' ,'Pão, Salsicha e ketchup e mostarda.' ,9.90 , 'Lanche', TRUE);
INSERT INTO produtos (nomeDoProduto, descricaoDoProduto, preco, categoria, disponivel)
VALUES('Batata frita P' ,'Batata frita tamanho pequena.' ,5.00 , 'Acompanhamento', TRUE);
INSERT INTO produtos (nomeDoProduto, descricaoDoProduto, preco, categoria, disponivel)
VALUES('Coca Cola Zero 1L' ,'Coca Cola sem açucar' ,10.00 , 'Bebida', TRUE);
INSERT INTO produtos (nomeDoProduto, descricaoDoProduto, preco, categoria, disponivel)
VALUES('Bolo de chocolate' ,'Bolo de chocolate' ,8.00 , 'Sobremesa', TRUE);

--Tabela que representa as mesas do restaurante.
CREATE TABLE mesa(
    mesa_ID INT AUTO_INCREMENT PRIMARY KEY,
    numeroDaMesa INT NOT NULL,
    senhaDaMesa VARCHAR(10)
);

--inserção de uma mesa de teste
INSERT INTO mesa(numeroDaMesa, senhaDaMesa)
VALUES(1,'AC01');

--Tabela principal de pedidos
CREATE TABLE pedido(
    pedido_ID INT AUTO_INCREMENT PRIMARY KEY,
    situacao ENUM('EM_ESPERA', 'EM_PREPARO', 'PRONTO', 'ENTREGUE'),
    data_hora DATETIME DEFAULT CURRENT_TIMESTAMP,
    total DECIMAL(10,2)
);

--Tabela que liga pedidos com produtos. 
--Relação muitos-para-muitos.
CREATE TABLE item_pedido(
    itemPedido_ID INT AUTO_INCREMENT PRIMARY KEY,
    pedido_ID INT NOT NULL,
    produto_ID INT NOT NULL,
    quantidade INT NOT NULL,
    observacao VARCHAR(100),
    FOREIGN KEY(produto_ID) REFERENCES produtos(produto_ID),
    FOREIGN KEY(pedido_ID) REFERENCES pedido(pedido_ID) 
);
