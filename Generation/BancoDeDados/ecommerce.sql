CREATE DATABASE db_ecommerce;

USE db_ecommerce;

CREATE TABLE tb_categorias(

id BIGINT AUTO_INCREMENT PRIMARY KEY,

descricao VARCHAR (255) NOT NULL

);

CREATE TABLE tb_produtos(
id BIGINT AUTO_INCREMENT PRIMARY KEY,

nome VARCHAR(255) NOT NULL,
marca VARCHAR(255),
quantidade INT,
dtvalidade date NULL,
preco DECIMAL(6,2),
categoria_id BIGINT,
FOREIGN KEY (categoria_id) REFERENCES tb_categorias(id)
);

INSERT INTO tb_produtos(nome, marca, quantidade, dtvalidade, preco)
VALUES("Diamante Negro", "lacta", 1, "2023-08-03", 8.50);

SELECT * FROM tb_produtos WHERE preco > 500;
SELECT * FROM tb_produtos WHERE preco < 500;


