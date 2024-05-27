 CREATE TABLE tbl_trafegos(
    numero_trafego BIGINT(20) NOT NULL AUTO_INCREMENT ,
    nome_local VARCHAR(100) NOT NULL,
    data_ocorrido DATE NULL,
    status_trafego VARCHAR(20) NOT NULL,
    PRIMARY KEY (numero_trafego)
 );