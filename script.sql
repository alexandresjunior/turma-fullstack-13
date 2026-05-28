CREATE DATABASE treinarecife_db;

CREATE TABLE treinarecife_db.tb_alunos (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(50) NOT NULL,
    sobrenome VARCHAR(150) NOT NULL,
    email VARCHAR(255) NOT NULL,
    data_nascimento DATE
);

INSERT INTO treinarecife_db.tb_alunos 
VALUES (1, "Alexandre", "de Souza Jr.", "alex@gmail.com", NULL);