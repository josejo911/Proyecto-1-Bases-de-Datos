--1
CREATE DATABASE proyecto
CREATE DATABASE proyecto_tst
CREATE DATABASE proyecto_delete
SHOW DATABASES

--2
ALTER DATABASE proyecto_tst RENAME TO proyecto_test
SHOW DATABASES

--3
DROP DATABASE proyecto_delete
SHOW DATABASES

--4
USE DATABASE proyecto
CREATE TABLE factura (id int, nombre char(20), nit char(10), total float, comprado_en date)
CREATE TABLE usuario (id int, nombre char(20), comision float, CONSTRAINT ch_com CHECK (comision <= 10.0))
CREATE TABLE sucursal (id int, direccion char(40), abierta_en date, CONSTRAINT pk_sucursal PRIMARY KEY (id))
CREATE TABLE pais (id int, pais char(20)) 
SHOW TABLES

--5
USE DATABASE proyecto
ALTER TABLE usuario RENAME TO empleado
SHOW TABLES

--6
USE DATABASE proyecto
ALTER TABLE sucursal ADD COLUMN nombre char(10)
ALTER TABLE factura ADD CONSTRAINT pk_factura PRIMARY KEY (id)
ALTER TABLE empleado ADD CONSTRAINT pk_empleado PRIMARY KEY (id)
ALTER TABLE empleado ADD COLUMN codigo int
ALTER TABLE empleado ADD CONSTRAINT ch_codigo CHECK (0 < codigo AND codigo < 1000)
SHOW TABLES

--7
USE DATABASE proyecto
ALTER TABLE empleado DROP CONSTRAINT ch_codigo
ALTER TABLE empleado DROP COLUMN codigo
SHOW TABLES

--8
USE DATABASE proyecto
DROP TABLE pais
SHOW TABLES

--9
USE DATABASE proyecto
CREATE TABLE empleado_sucursal (empleado_id int, sucursal_id int, asignado_en date, 
CONSTRAINT fk_empleado FOREIGN KEY (empleado_id) REFERENCES empleado (id),
CONSTRAINT fk_sucursal FOREIGN KEY (sucursal_id) REFERENCES sucursal (id),
CONSTRAINT pk_us PRIMARY KEY (empleado_id, sucursal_id))
SHOW TABLES
SHOW COLUMNS FROM empleado_sucursal

--10 (ERRORES)
use database proyecto
ALTER DATABASE proyecto_tst RENAME TO nueva --no existe la base de datos proyecto_tst
DROP DATABASE proyecto_ganado --no existe la base de datos proyecto_ganado
DROP DATABASE proyecto_delete --no existe la base de datos proyecto_delete
ALTER TABLE tabla_no_existe ADD COLUMN nombre char(10) --no existe la relación tabla_no_existe
ALTER TABLE pais ADD COLUMN nombre char(10) --no existe la relación pais
DROP TABLE tabla_no_existe --no existe la tabla tabla_no_existe
DROP TABLE pais --no existe la tabla pais

--11 (ERRORES)
use database proyecto
DROP TABLE sucursal --no se puede eliminar tabla sucursal porque otros objetos dependen de el (fk_sucursal en empleado_sucursal)
-- Verificación de DROP DATABASE proyecto_tst
CREATE TABLE usuario (id int, nombre char(20), comision xxx) --no existe el tipo xxx
CREATE TABLE pais (id int, pais char(20), CONSTRAINT pk_sucursal PRIMARY KEY (id_pais)) --no existe la columna id_pais en la llave
ALTER TABLE empleado ADD CONSTRAINT ch_codigo CHECK (0 < codigo AND codigo < 1000) --no existe la columna codigo

--12 (ERRORES)
use database proyecto
ALTER TABLE empleado_sucursal ADD CONSTRAINT fk_empleado FOREIGN KEY (empleado_id) REFERENCES empleado (id) --la restricción ya existe
ALTER TABLE empleado_sucursal ADD CONSTRAINT fk_empleado2 FOREIGN KEY (asignado_en) REFERENCES empleado (id) --la restricción no puede ser implementada por tipos incompatibles (date e int)
ALTER TABLE empleado_sucursal ADD CONSTRAINT fk_empleado3 FOREIGN KEY (empleado_id) REFERENCES factura (comision) --no existe la columna comisión referida
ALTER TABLE empleado_sucursal ADD CONSTRAINT fk_empleado4 FOREIGN KEY (empleado_id) REFERENCES empleado (comision) --no hay restriccion única que coincida con las columnas
ALTER TABLE empleado ADD CONSTRAINT pk_empleado2 PRIMARY KEY (id) --no se permiten múltiples llaves primarias para la tabla empleado

--13
INSERT INTO empleado VALUES (1,'Juan',5.0)
INSERT INTO empleado VALUES (2,'Pedro')
INSERT INTO empleado (id, nombre) VALUES (3, 'Julio')
INSERT INTO empleado (nombre, id) VALUES ('Jose',4)
INSERT INTO empleado (comision, id, nombre) VALUES (6.0,5,'Tomas')

--14 (ERRORES)
INSERT INTO empleado (nombre, id, comision) VALUES ('Luis',6) --INSERT tiene más columnas de destino que expresiones
INSERT INTO empleado VALUES (1, 'Roberto', 5.0) --llave duplicada viola la restriccion de unicidad
INSERT INTO empleado VALUES (6, 'Ruben', 10.1) --el nuevo registro para empleado viola la restriccion check
INSERT INTO empleado VALUES (6, 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 7.0) --el valor es demasiado largo para el tipo char(20)

--15 CAST
INSERT INTO empleado VALUES ('6','Ruben', 9.0) --cast
INSERT INTO empleado VALUES (7, 10001, 8.0) --cast
INSERT INTO empleado VALUES (8.0, 'Jesus', 6.5) --cast
INSERT INTO empleado VALUES (9, 'Esteban', 5) --cast
INSERT INTO empleado VALUES (10.8, 'Jorge', 6.4) --cast

--16
use database proyecto
INSERT INTO sucursal VALUES (1, 'z.15', '2014-01-01', 'VH')
INSERT INTO sucursal VALUES (2, 'z.10', '2013-10-01', 'GEMINIS')
INSERT INTO sucursal (direccion, id, nombre) VALUES ('z.11',3,'MAJADAS')
INSERT INTO sucursal (id, nombre, direccion, abierta_en) VALUES (4,'SAN CRIS','z.7 mixco','2012-08-07')

--17
INSERT INTO sucursal (id, direccion, abierta_en, nombre) VALUES (5, 'z.7 mixco', '08-07-2012' ,'SAN CRIS') --fecha
INSERT INTO sucursal (id, direccion, abierta_en, nombre) VALUES (6, 'z.7 mixco', '45-46-2012' ,'SAN CRIS') --valor de hora/fecha fuera de rango
INSERT INTO sucursal (id, direccion, fecha, nombre) VALUES (6, 'z.7 mixco', '2012-08-07' ,'SAN CRIS') --no existe la columna fecha en la relacion sucursal
INSERT INTO sucursal (id, nombre, direccion, abierta_en) VALUES (6,'SAN CRIS','z.7 mixco',2012-08-07) --la columna abierta_en es de tipo date pero la expresion es int

--18
UPDATE empleado SET comision = 11.0 --el nuevo registro para la relacion empleado viola la restriccion check
UPDATE empleado SET comision = 5.0
UPDATE empleado SET nombre = 'Sofia' WHERE nombre = '10001'
UPDATE empleado SET nombre = 'Juana' WHERE id = 1
UPDATE empleado SET apellido = 'Suarez' -- no existe la columna apellido en la relación empleado
UPDATE empleado SET nombre = 'Sin nombre' WHERE nombre_id = 1 -- no existe la columna nombre id
UPDATE empleado SET nombre = 'Maria', comision = 10.0 WHERE id = 6
UPDATE empleado SET nombre = 'ABCDEFGHIJKLMNOPQRSTUVWXYZ' --el valor es demasiado largo para el tipo char(20)
UPDATE sucursal SET abierta_en = '2014-05-21' WHERE id = 3
UPDATE empleado SET comision = NULL WHERE id = 1

--19
DELETE FROM sucursal WHERE nombre = 'SAN CRIS'
DELETE FROM sucursal2 WHERE nombre = 'SAN CRIS' -- no existe la relacion sucursal2
DELETE FROM sucursal WHERE nombre2 = 'SAN CRIS' -- no existe la columna nombre2

--20
SELECT id,nombre FROM sucursal --3
SELECT id,nombre FROM empleado --10
SELECT * FROM sucursal, empleado --producto cartesiano 3X10 = 30
SELECT * FROM empleado WHERE comision > 5.0 --Maria 6
SELECT * FROM empleado WHERE comision is NULL --Juana 1
UPDATE empleado SET nombre = 'Tomas' WHERE id = 6
SELECT * FROM empleado WHERE comision < 10 AND nombre = 'Tomas' --Tomas 5
SELECT * FROM empleado WHERE comision = 5 OR nombre = 'Tomas' ORDER BY nombre --9
SELECT id,nombre FROM empleado ORDER BY nombre DESC
SELECT id,nombre FROM sucursal ORDER BY id ASC
SELECT nombre,comision FROM empleado ORDER BY comision --null al final
SELECT id,comision FROM empleado ORDER BY comision DESC --null al principio

--21
INSERT INTO empleado_sucursal VALUES (1,1, '2014-01-01')
INSERT INTO empleado_sucursal VALUES (1,1, '2014-01-01') --viola PK
INSERT INTO empleado_sucursal VALUES (100,1,'2014-01-01') --viola FK
INSERT INTO empleado_sucursal VALUES (1,100,'2014-01-01') --viola FK
UPDATE empleado_sucursal SET sucursal_id = 100 WHERE empleado_id = 1 --viola FK
UPDATE empleado_sucursal SET empleado_id = 100 WHERE sucursal_id = 1 --viola FK
DELETE FROM sucursal WHERE id = 1 -- viola FK
UPDATE empleado SET id=100 WHERE id=1 --viola FK

--22
--INSERT MASIVO
--UPDATE MASIVO
--DELETE MASIVO
