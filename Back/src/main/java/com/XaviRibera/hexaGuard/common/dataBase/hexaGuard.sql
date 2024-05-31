CREATE DATABASE hexaGuard;

USE hexaGuard;

CREATE TABLE labels (
id INT NOT NULL PRIMARY KEY,
name VARCHAR(30) NOT NULL,
color_code VARCHAR(7) NOT NULL,
description VARCHAR(300)
);

CREATE TABLE records (
id INT NOT NULL PRIMARY KEY,
title VARCHAR(50) NOT NULL,
page_direction VARCHAR(200),
user_name VARCHAR(50),
password VARCHAR(50) NOT NULL,
description VARCHAR(300),
label_id int
);

ALTER TABLE records ADD CONSTRAINT fk_label_id_records FOREIGN KEY (label_id) REFERENCES labels(id);