# Se crea el diccionario con los datos del cliente, en este caso es solo para hacer test. NO SE ENVÍA EN EL EJERCICIO
informacion = {
  'id_cliente': 2,
  'nombre': 'Johana Fernandez',
  'edad': 20,
  'primer_ingreso': True
}


# Función que solicita el reto, no se debe cambiar el nombre de la función ni de sus parámetros
def cliente(informacion: dict):
  # Aquí estamos creando el nuevo diccionario donde recibimos los valores definidos por el usuario
  nuevo_diccionario = {
    'nombre': informacion['nombre'],
    'edad': informacion['edad'],
    'atraccion': '',  # Creamos las nuevas llaves que tendrá el nuevo diccionario con valores indefinidos
    'apto': bool,
    'primer_ingreso': informacion['primer_ingreso'],
    'total_boleta': 0
  }

  # Variables con las que se evaluarán las condiciones
  # edad y primer_ingreso son tomadas del nuevo diccionario, las demás son varibales con valores indefinidos por el momento
  edad = nuevo_diccionario['edad']
  atraccion: str = ''
  es_apto: bool = True
  primer_ingreso = nuevo_diccionario['primer_ingreso']
  total_boleta = 0



# Condicionales

  # Aquí estamos validando según para qué atracción es apto. En este caso, la edad mínima es de 7 años, si es menor de 7 años no es apto para ninguna atracción
  if edad >= 7 and edad <15:
    atraccion = 'Sillas voladoras'
  elif edad >= 15 and edad <= 18:
    atraccion = 'Carros chocones'
  elif edad > 18: 
     atraccion = 'X-Treme'
  # else para los casos en los cuales tiene menos de 7 años, no se cumplen ninguna de las condiciones anteriores
  else:
    es_apto = False
    atraccion = 'N/A'
    total_boleta = 'N/A'


# Aquí estamos validando según la atracción cuál es el costo de la boleta, luego por cada atracción se valida si es primer ingreso para aplicar el descuento

  descuento = 0      # Creamos una nueva variable que almacenará el valor del descuento

  if es_apto == True:
    if atraccion == 'X-Treme':
      total_boleta = 20000
      if primer_ingreso == True:
        descuento = (20000 * 5) / 100
        total_boleta = total_boleta - descuento
    elif atraccion == 'Carros chocones':
      total_boleta = 5000
      if primer_ingreso == True:
        descuento = (5000 * 7) / 100
        total_boleta = total_boleta - descuento
    elif atraccion == 'Sillas voladoras':
      total_boleta = 10000
      if primer_ingreso == True:
        descuento = (10000 * 5) / 100
        total_boleta = total_boleta - descuento
  nuevo_diccionario['atraccion'] = atraccion
  nuevo_diccionario['apto'] = es_apto
  nuevo_diccionario['total_boleta'] = total_boleta
  return nuevo_diccionario


# Se llama la función indicando el diccionario que contiene los datos (informacion)
print(cliente(informacion))