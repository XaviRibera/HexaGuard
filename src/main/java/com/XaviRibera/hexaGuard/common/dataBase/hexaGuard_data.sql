use hexaGuard;

INSERT INTO labels (name, color_code, description) VALUES
('personal', '#3366FF', 'Etiqueta personal'),
('trabajo', '#FF6600', 'Etiqueta de trabajo'),
('personal', '#3366FF', 'Etiqueta personal'),
('trabajo', '#FF6600', 'Etiqueta de trabajo'),
('hogar', '#00CC66', 'Etiqueta de hogar'),
('importante', '#FF0000', 'Etiqueta importante'),
('viaje', '#993399', 'Etiqueta de viaje'),
('personal', '#3366FF', 'Etiqueta personal'),
('trabajo', '#FF6600', 'Etiqueta de trabajo'),
('hogar', '#00CC66', 'Etiqueta de hogar');

INSERT INTO records (title, page_direction, user_name, password, description, label_id) VALUES
('Título 1', 'Dirección de página 1', 'john_doe', 'clave1', 'Descripción 1', '1'),
('Título 2', 'Dirección de página 2', 'john_doe', 'clave2', 'Descripción 2', '2'),
('Título 3', 'Dirección de página 3', 'john_doe', 'clave3', 'Descripción 3', NULL),
('Título 4', 'Dirección de página 4', 'jane_smith', 'clave4', 'Descripción 4', '3'),
('Título 5', 'Dirección de página 5', 'jane_smith', 'clave5', 'Descripción 5', '4'),
('Título 6', 'Dirección de página 6', 'jane_smith', 'clave6', 'Descripción 6', NULL),
('Título 7', 'Dirección de página 7', 'mark_johnson', 'clave7', 'Descripción 7', '5'),
('Título 8', 'Dirección de página 8', 'mark_johnson', 'clave8', 'Descripción 8', '6'),
('Título 9', 'Dirección de página 9', 'mark_johnson', 'clave9', 'Descripción 9', NULL),
('Título 10', 'Dirección de página 10', 'emily_wilson', 'clave10', 'Descripción 10', '7'),
('Título 11', 'Dirección de página 11', 'emily_wilson', 'clave11', 'Descripción 11', '8'),
('Título 12', 'Dirección de página 12', 'emily_wilson', 'clave12', 'Descripción 12', NULL),
('Título 13', 'Dirección de página 13', 'david_brown', 'clave13', 'Descripción 13', '9'),
('Título 14', 'Dirección de página 14', 'david_brown', 'clave14', 'Descripción 14', '10'),
('Título 15', 'Dirección de página 15', 'david_brown', 'clave15', 'Descripción 15', NULL);
