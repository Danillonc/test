DROP TABLE IF EXISTS Usuario;
      
CREATE TABLE Usuario(
             id INT NOT NULL AUTO_INCREMENT,
             nome varchar(50) NOT NULL,
             sobrenome varchar(50) NOT NULL,
             email varchar(50) NOT NULL,
             senha varchar(20) NOT NULL,
             estado_civil varchar(30) NOT NULL,
             sexo varchar(10) NOT NULL,
             estado varchar(5) NOT NULL,
             PRIMARY KEY(id));