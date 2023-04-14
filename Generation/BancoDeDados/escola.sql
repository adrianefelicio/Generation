CREATE DATABASE db_escola;

USE db_escola;

CREATE TABLE tb_estudantes(
id BIGINT AUTO_INCREMENT PRIMARY KEY,
nome VARCHAR (255),
idade INT,
turma VARCHAR (255),
nota DECIMAL (4,2),
ano INT
);

INSERT INTO tb_estudantes (nome, idade, turma, nota, ano)
VALUES("Maria", 18, "C", 10.00, "3° ano");

