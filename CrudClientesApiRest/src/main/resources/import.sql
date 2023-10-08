/*Regiones*/
INSERT INTO regiones (id, nombre) VALUES (1, 'Sudamérica')
INSERT INTO regiones (id, nombre) VALUES (2, 'Centroamérica')
INSERT INTO regiones (id, nombre) VALUES (3, 'Norteamérica')
INSERT INTO regiones (id, nombre) VALUES (4, 'Europa')
INSERT INTO regiones (id, nombre) VALUES (5, 'Africa')
INSERT INTO regiones (id, nombre) VALUES (6, 'Asia')
INSERT INTO regiones (id, nombre) VALUES (7, 'Oceanía')
INSERT INTO regiones (id, nombre) VALUES (8, 'Antártida')

/*Clientes*/
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES (1, 'Franco', 'Beade', 'francobeade97@gmail.com', '2023-08-21');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES (1, 'Nayla', 'Quiroga', 'NaylaQuiroga@gmail.com', '2023-08-21');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES (2, 'Andres', 'Colman', 'andrescolman@gmail.com', '2023-08-21');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES (2, 'Facundo', 'Brugger', 'facundoBrugger@gmail.com', '2023-08-21');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES (2, 'Christian', 'Dichiera', 'christiandichiera@gmail.com', '2023-08-21');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES (3, 'Patricio', 'Beade', 'PatricioBeade@gmail.com', '2023-08-21');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES (4, 'Juan', 'Santillan', 'JuanSantillan@gmail.com', '2023-08-21');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES (1, 'Sol', 'Mena', 'SolMena@gmail.com', '2023-08-21');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES (4, 'Facundo', 'Rodriguez', 'facundoRodriguez@gmail.com', '2023-08-21');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES (5, 'Christian', 'Alfonso', 'christianalfonso@gmail.com', '2023-08-21');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES (4, 'Patricio', 'Felipe', 'PatricioFelipe@gmail.com', '2023-08-21');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES (6, 'Juan', 'Fernando', 'JuanFernando@gmail.com', '2023-08-21');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES (7, 'Soledad', 'Mena', 'SoledadMena@gmail.com', '2023-08-21');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES (1, 'Patricio', 'Brugger', 'PatricioBrugger@gmail.com', '2023-08-21');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES (5, 'Cristian', 'Escalada', 'cristianEscalada@gmail.com', '2023-08-21');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES (8, 'Agustin', 'Figueiras', 'AgustinFigueiras@gmail.com', '2023-08-21');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES (8, 'Juan', 'Rodriguez', 'JuanRodriguez@gmail.com', '2023-08-21');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES (5, 'Veronica', 'Salcedo', 'VeronicaSalcedo@gmail.com', '2023-08-21');

/*Usuarios y roles*/
INSERT INTO `usuarios` (username, password, enable, nombre, apellido, email) VALUES ('franco', '$2a$10$X4jOzWnM/lEYYMMX/KjEhezo59R3hgiT1.r17E5HlIz/FhQcHZqcy',1, 'Franco', 'Beade', 'francobeade97@gmail.com');
INSERT INTO `usuarios` (username, password, enable, nombre, apellido, email) VALUES ('admin', '$2a$10$tlZR.7tHJ/Bo3Nla7/XreuQQlnvMq1i/YP4uXykMqteiNPYuSBdzW',1, 'Nayla', 'Quiroga', 'naianaquiroga@gmail.com');

INSERT INTO `roles` (nombre) VALUES ('ROLE_USER');
INSERT INTO `roles` (nombre) VALUES ('ROLE_ADMIN');

INSERT INTO `usuarios_roles` (usuario_id, roles_id) VALUES (1, 1);
INSERT INTO `usuarios_roles` (usuario_id, roles_id) VALUES (2, 2);
INSERT INTO `usuarios_roles` (usuario_id, roles_id) VALUES (2, 1);

/*Productos*/
INSERT INTO productos (nombre, precio, create_at) VALUES ('Panasonic Pantalla LCD', 259990, NOW());
INSERT INTO productos (nombre, precio, create_at) VALUES ('Sony Camara digital DSC-W320B', 123490, NOW());
INSERT INTO productos (nombre, precio, create_at) VALUES ('Apple Iphone 14 Pro Max', 800500, NOW());
INSERT INTO productos (nombre, precio, create_at) VALUES ('Sony Notebook Z110', 124588, NOW());
INSERT INTO productos (nombre, precio, create_at) VALUES ('Samsung S23 Ultra', 780000, NOW());
INSERT INTO productos (nombre, precio, create_at) VALUES ('Sony PlayStation 5', 784054, NOW());
INSERT INTO productos (nombre, precio, create_at) VALUES ('Microsoft Xbox Serie S', 584054, NOW());
INSERT INTO productos (nombre, precio, create_at) VALUES ('Smart Tv Samsung 32"', 184054, NOW());

/*Facturas*/
INSERT INTO facturas (descripcion, observacion, cliente_id, create_at) VALUES('Factura equipos de entretenimiento', null, 1, NOW());
INSERT INTO facturas_items (cantidad, factura_id, producto_id) VALUES (1,1,1);
INSERT INTO facturas_items (cantidad, factura_id, producto_id) VALUES (2,1,4);
INSERT INTO facturas_items (cantidad, factura_id, producto_id) VALUES (1,1,5);
INSERT INTO facturas_items (cantidad, factura_id, producto_id) VALUES (1,1,7);

INSERT INTO facturas (descripcion, observacion, cliente_id, create_at) VALUES('Factura PS5', 'Hola soy una nota', 1, NOW());
INSERT INTO facturas_items (cantidad, factura_id, producto_id) VALUES (3,2,6);