CREATE DATABASE hexaGuard;

USE hexaGuard;

CREATE TABLE user (
id INT NOT NULL PRIMARY KEY,
user_name CHAR(50) NOT NULL,
email CHAR(50) NOT NULL,
password CHAR(59) NOT NULL,
phone_number INT
);

CREATE TABLE labels (
id INT NOT NULL PRIMARY KEY,
name VARCHAR(30) NOT NULL,
color_code VARCHAR(7) NOT NULL,
description VARCHAR(30),
user_id int NOT NULL
);

CREATE TABLE records (
id INT NOT NULL PRIMARY KEY,
title VARCHAR(50) NOT NULL,
page_direction VARCHAR(200),
user_name VARCHAR(50),
password VARCHAR(50) NOT NULL,
description VARCHAR(300),
label_id int,
user_id int NOT NULL
);

ALTER TABLE labels ADD CONSTRAINT fk_user_id_labels FOREIGN KEY (user_id) REFERENCES user(id);
ALTER TABLE records ADD CONSTRAINT fk_label_id_records FOREIGN KEY (label_id) REFERENCES labels(id);
ALTER TABLE records ADD CONSTRAINT fk_user_id_records FOREIGN KEY (user_id) REFERENCES user(id);