CREATE DATABASE db_sacolao;

USE db_sacolao;  -- usar o banco de dados

-- Ceia a tabela tb_categorias 
CREATE TABLE tb_categorias(
id bigint AUTO_INCREMENT,   -- inicia uma contagem automática, vai acrescentando um no id 
descricao varchar(255) NOT NULL, -- varchar é STRING, campo NOT NULL (campo obrigatório, tem que ser preenchido)
PRIMARY KEY (id)
);

-- Cria a tabela tb_produtos
CREATE TABLE tb_produtos(
id bigint AUTO_INCREMENT,
nome varchar(255) NOT NULL,
quantidade int,
dtvalidade date NULL,
preco decimal (6,2),
categoria_id bigint,
PRIMARY KEY (id),
FOREIGN KEY (categoria_id) REFERENCES tb_categorias(id)
);