create table produto(#Cardápio
	produto_id INT auto_increment,
    nome_do_produto varchar(100) not null,
    descricao_do_produto varchar(100) not null,
    preco decimal(10,2) not null,
    categoria varchar(30) not null,
    disponivel boolean,
    primary key(produto_id)
);

#Inserção dos produtos no cardápio
INSERT INTO produto (nome_do_produto, descricao_do_produto, preco, categoria, disponivel)
VALUES('Cachorro quente simples' ,'Pão, Salsicha e ketchup e mostarda.' ,9.90 , 'Lanche', TRUE),
('Batata frita P' ,'Batata frita tamanho pequena.' ,5.00 , 'Acompanhamento', TRUE),
('Coca Cola Zero 1L' ,'Coca Cola sem açucar' ,10.00 , 'Bebida', TRUE),
('Bolo de chocolate' ,'Bolo de chocolate' ,8.00 , 'Sobremesa', TRUE);

create table mesa(#mesa do restaurante
	mesa_id int auto_increment,
    numero_da_mesa int not null,
    senha_da_mesa varchar(10),
    primary key(mesa_id)
);

#Inserção de mesa para testes
INSERT INTO mesa (numero_da_mesa, senha_da_mesa)
VALUES (1, 'AC01');

create table pedido(
	mesa_id int not null,
    pedido_id int auto_increment not null,
    situacao enum(
		'EM_ESPERA',
        'EM_PREPARO',
        'PRONTO',
        'SAIU_PARA_ENTREGA',
        'ENTREGUE'
    ) not null,
    data_hora datetime default current_timestamp,
    total decimal(10,2),
    primary key(pedido_id),
    foreign key(mesa_id) references mesa(mesa_id)
);

create table item_pedido(
	item_pedido_id int auto_increment not null,
    produto_id int not null,
    pedido_id int not null,
    quantidade int not null,
    observacao varchar(100),
    primary key(item_pedido_id),
    foreign key(produto_id) references produto(produto_id),
    foreign key(pedido_id) references pedido(pedido_id)
);