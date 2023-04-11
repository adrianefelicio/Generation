select @@version;
CREATE DATABASE db_rh; -- precisa colocar letra maiúscula em comandos e o ponto e vírgula também é obrigatório. db significa database e não pode ter espaço e caracter especial

CREATE TABLE tb_colaboradores(
id BIGINT AUTO_INCREMENT, -- atributos da tabela
nome VARCHAR(255),
idade INT(2),
salario DECIMAL(6,2),
cargo VARCHAR(255),

 PRIMARY KEY (id)
);

INSERT INTO tb_colaboradores(nome, idade, salario, cargo)
VALUES("Chris", 25, 400.99, "Desenvolvedor");

SELECT * FROM tb_colaboradores;

SELECT * FROM tb_colaboradores WHERE salario > 2000;

SELECT * FROM tb_colaboradores WHERE salario <2000;

SELECT * FROM tb_colaboradores WHERE salario < 700;

-- BONUS

ALTER TABLE tb_colaboradores
MODIFY COLUMN salario DECIMAL(10,2);

UPDATE tb_colaboradores
SET salario = 8000.99
WHERE id=2