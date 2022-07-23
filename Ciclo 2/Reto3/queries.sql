/*
 * 1.
 * Obtener el listado de los identificadores (id) de los materiales de construcción 
importados, incluyendo: sus nombres y precios (ordenados por nombre). Utilice los 
siguientes alias: ID_MATERIALCONSTRUCCION como ID, 
NOMBRE_MATERIAL como NOMBRE y PRECIO_UNIDAD como PRECIO. 
*/

SELECT 
	ID_MaterialConstruccion AS ID, 
	Nombre_Material AS NOMBRE, 
	Precio_Unidad AS PRECIO 
FROM 
	MaterialConstruccion mc 
WHERE 
	Importado = 'Si'
ORDER BY 
	Nombre_Material ASC;

/*
 * 2.
 * Se necesita conocer el listado de los proyectos, incluyendo la siguiente información: 
id del proyecto, constructora, ciudad, clasificación, estrato y nombre completo del 
líder de los proyectos que fueron financiados por el banco “Conavi”. Ordenados 
desde el proyecto más reciente hasta el más antiguo, por nombre de la ciudad (de 
forma ascendente) y por constructora. Para construir el listado mencionado, se debe 
realizar un JOIN entre las tablas Proyecto y Tipo, Proyecto Líder. Utilice los 
siguientes alias: ID_PROYECTO como ID y la unión del nombre + apellido del 
líder como LIDER, el resto, queda en su forma natural. 
*/

--Para concatenar en SQLite debemos usar || ya que no reconoce CONCAT 

SELECT 
	p.ID_Proyecto AS ID,
	p.Constructora ,
	p.Ciudad ,
	p.Clasificacion ,
	t.Estrato ,
	l.Nombre||' '||l.Primer_Apellido||' '||l.Segundo_Apellido AS LIDER
FROM 
	Proyecto p 
INNER JOIN 
	Lider l ON l.ID_Lider = p.ID_Lider 
INNER JOIN 
	Tipo t ON t.ID_Tipo = p.ID_Tipo 
WHERE 
	p.Banco_Vinculado = 'Conavi'
ORDER BY 
	p.Fecha_Inicio DESC,
	p.Ciudad,
	p.Constructora;

/*
 * 3.
 * Se desea conocer por cada ciudad y clasificación: el total de proyectos, la fecha del 
proyecto más antiguo y la fecha del proyecto más reciente (ordenados por ciudad y 
clasificación). No se deben incluir los proyectos tipo “Casa Campestre” ni 
“Condominio”.
*/

SELECT Ciudad , 
	Clasificacion , 
	COUNT(*) TOTAL, 
	MIN(Fecha_Inicio) VIEJO, 
	MAX(Fecha_Inicio) RECIENTE
FROM 
	Proyecto p 
WHERE 
	Clasificacion NOT IN ('Casa Campestre', 'Condominio') --NOT IN oculta los valores indicados
GROUP BY 
	Ciudad  , 
	Clasificacion --Agrupa las filas (las reduce)
ORDER BY 
	Ciudad  , 
	Clasificacion;

/*
 * 4.
 * Se debe presentar el total adeudado en cada proyecto (por las compras no pagadas a 
los proveedores). Se debe agrupar los datos por el ID_proyecto y el valor total de la 
deuda, siempre y cuando esta última sea superior a $50.000. Ordene los datos de
mayor a menor deuda.
*/

SELECT 
	p.ID_Proyecto ,
	SUM(c.Cantidad * mc.Precio_Unidad) AS VALOR
FROM 
	Proyecto p 
INNER JOIN 
	Compra c ON p.ID_Proyecto = c.ID_Proyecto 
INNER JOIN 
	MaterialConstruccion mc ON mc.ID_MaterialConstruccion = c.ID_MaterialConstruccion 
WHERE 
	c.Pagado = 'No'
GROUP BY 
	p.ID_Proyecto
HAVING --La función HAVING se utiliza para incluir condiciones con alguna función SQL del tipo SUM, MAX, ..
	SUM(c.Cantidad * mc.Precio_Unidad) > 50000 
ORDER BY
	VALOR DESC; 

/*
 * 5.
 * Seleccione los 10 líderes que han realizado más compras en sus proyectos. Se debe 
presentar el nombre completo del líder y el valor total de las compras realizadas. 
Para limitar el número de registros, usar al final de la consulta la instrucción LIMIT 
<numero>.
*/

SELECT 
	l.Nombre || ' ' || l.Primer_Apellido || ' ' || l.Segundo_Apellido AS LIDER,
	SUM(mc.Precio_Unidad * c.Cantidad) AS VALOR
FROM 
	Lider l 
INNER JOIN
	Proyecto p ON p.ID_Lider = l.ID_Lider 
INNER JOIN 
	Compra c ON c.ID_Proyecto = p.ID_Proyecto 
INNER JOIN
	MaterialConstruccion mc ON mc.ID_MaterialConstruccion = c.ID_MaterialConstruccion 
GROUP BY 
	l.Nombre || ' ' || l.Primer_Apellido || ' ' || l.Segundo_Apellido
ORDER BY 
	VALOR DESC
LIMIT 10;