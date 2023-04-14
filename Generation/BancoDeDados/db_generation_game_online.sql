CREATE DATABASE db_generation_game_online;
USE db_generation_game_online;

CREATE TABLE tb_personagens(
id BIGINT AUTO_INCREMENT PRIMARY KEY,

nome VARCHAR (255),
poder VARCHAR(255),
agilidade INT,
sorte INT,
classe_id BIGINT, 
FOREIGN KEY (classe_id) REFERENCES tb_classes(id)
);

CREATE TABLE tb_classes(
id BIGINT AUTO_INCREMENT PRIMARY KEY,

classe VARCHAR (255),
raca VARCHAR (255)

);

SELECT * FROM tb_personagens WHERE agilidade > 2000;
SELECT * FROM tb_personagens WHERE sorte BETWEEN 1000 and 2000;
SELECT * FROM tb_personagens WHERE  nome LIKE "%C%";
SELECT * FROM tb_personagens INNER JOIN tb_classes
ON  tb_personagens.classe_id = tb_classes.id;
SELECT * FROM tb_personagens INNER JOIN tb_classes
ON  tb_personagens.classe_id = tb_classes.id
WHERE tb_classes.id = 5;
