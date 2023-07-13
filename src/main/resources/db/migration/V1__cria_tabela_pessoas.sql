CREATE TABLE pessoas(
  id bigint(20) NOT NULL AUTO_INCREMENT,
  nome varchar(255) NOT NULL,
  email varchar(255) NOT NULL,
  senha varchar(50) NOT NULL,
  telefone varchar(20) NOT NULL,
  
  primary key(id)
)