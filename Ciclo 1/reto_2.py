# Crear diccionario con la información del cliente
informacion = {
  'id_cliente': 2,
  'nombre': 'Johana Fernandez',
  'edad': 20,
  'primer_ingreso': True
}
# Función
def cliente(informacion: dict):
  # Nuevo diccionario con los datos del cliente
  clientes = {
    'nombre': informacion['nombre'],
    'edad': informacion['edad'],
    'atraccion': '',
    'apto': bool,
    'primer_ingreso': informacion['primer_ingreso'],
    'total_boleta': 0
  }
  total_boleta = 0
  edad = clientes['edad']
  primer_ingreso = clientes['primer_ingreso']
  atraccion = ''
  apto = True
  # Validar atracción
  if edad >= 7 and edad <15:
    atraccion = 'Sillas voladoras'
  elif edad >= 15 and edad <= 18:
    atraccion = 'Carros chocones'
  elif edad > 18: 
     atraccion = 'X-Treme'
  else:
    apto = False
    atraccion = 'N/A'
    total_boleta = 'N/A'
  # Validar costo de la boleta
  if apto == True:
    if atraccion == 'X-Treme':
      total_boleta = 20000
      if primer_ingreso == True:
        total_boleta = 20000 - (20000 * 0.05)
    elif atraccion == 'Carros chocones':
      total_boleta = 5000
      if primer_ingreso == True:
        total_boleta = 5000 - (5000 * 0.07)
    elif atraccion == 'Sillas voladoras':
      total_boleta = 10000
      if primer_ingreso == True:
        total_boleta = 10000 - (10000 * 0.05)
  # Agregar total_boleta y apto al diccionario
  clientes['atraccion'] = atraccion
  clientes['apto'] = apto
  clientes['total_boleta'] = total_boleta
  return clientes

print(cliente(informacion))