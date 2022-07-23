/*
 * Esto es un comentario de varias líneas	
 * */

--Comentario de una línea

--Crear mi primera BD
CREATE TABLE grupo_24(
	id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,
	jornada VARCHAR(10) NOT NULL,
	promedio_edad DOUBLE NOT NULL,
	universidad VARCHAR(50) NOT NULL
);


--Insertar datos
INSERT INTO grupo_24(jornada, promedio_edad, universidad)
VALUES("noche", 29.5, "UTP");

INSERT INTO grupo_24 (jornada, promedio_edad, universidad)
VALUES("tarde", 28.2, "UTP");

INSERT INTO grupo_24 (jornada, promedio_edad, universidad)
VALUES ("mañana", 20.5,"UTP");



--Consultar datos de la tabla 
SELECT * FROM grupo_24;

SELECT promedio_edad, jornada FROM grupo_24;

--Contar registros de una tabla:
SELECT COUNT(*) FROM grupo_24;




--Actualizar un registro

--Todos los registros:
 UPDATE grupo_24 SET universidad="UPB";

--Uno específico:
UPDATE grupo_24 SET universidad="UTP" WHERE id=1;

--Actualizar varios registros
UPDATE grupo_24 SET universidad="UDEA" WHERE id=2 or id=3;




--Eliminar un registro
DELETE FROM grupo_24 WHERE id=2;




--Eliminar una tabla
DROP TABLE grupo_24;