DROP DATABASE Exemplo;
CREATE DATABASE Exemplo;
USE  Exemplo;
CREATE TABLE cliente(
cli_cod  integer  AUTO_INCREMENT NOT NULL ,
cli_nome  varchar(50) NOT NULL,
cli_end varchar(50) NOT NULL,
cli_tel  integer(15) NOT NULL,
PRIMARY KEY (cli_cod) );