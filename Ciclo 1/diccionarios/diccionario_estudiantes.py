estudiante_1 = {
  'nombre': 'Bladimir',
  'apellido': 'Diuche',
  'edad': 25,
  'promedio_notas': 4.2,
  'activo': True
}

x = estudiante_1['nombre']

print(x)

edad = estudiante_1['edad']
print(edad)

#Reasignar valor a llave
#Si la llave existe le reaigna el valor
estudiante_1['edad'] = 26
print(estudiante_1['edad'])

#Agregar llaves al elemento
#Si la llave no existe se agrega
estudiante_1['sexo'] = 'masculino'

#Obtener longitud/llaves del elemento

tamanio = len(estudiante_1)
print(tamanio)

print(estudiante_1)

# estudiante_1.pop() -> eliminar llave

# estudiante_1.clear() -> limpiar todo el diccionario/elemento

# estudiante_1.get() -> para obtener

#Elminar sexo
estudiante_1.pop('sexo')
print(estudiante_1)

# Ejercicio 1
# Calcular el promedio de notas del estudiante a partir del siguiente diccionar
estudiante = {
  'nombre': 'Ana Maria',
  'apellido': 'Lopez',
  'edad': 26,
  'notas': {
    'nota_1': 3.2,
    'nota_2': 3.0,
    'nota_3': 4.5,
    'nota_4': 4.2
  }
}
promedio_estudiante = 0
promedio_estudiante = (estudiante['notas']['nota_1']+estudiante['notas']['nota_2']+estudiante['notas']['nota_3']+estudiante['notas']['nota_4'])/len(estudiante['notas'])

print(promedio_estudiante)

# Ejercicio 2

supermercado = {
    'belen': {
        'aseo': 18000000,
        'frutas': 35000000
    },
    'poblado':{
        'aseo': 15000000,
        'frutas': 38000000
    }
}

'''
1) Calcular el promedio de ventas por cada sede del supermercado
2) Obtener el TOTAl de VENTAS del supermercado
'''
promedio_belen = (supermercado['belen']['aseo']+supermercado['belen']['frutas'])/len(supermercado['belen'])
promedio_poblado = (supermercado['poblado']['aseo']+supermercado['poblado']['frutas'])/len(supermercado['poblado'])

print(f"Promedio de ventas sede Belén: ${promedio_belen}\nPromedio de ventas sede Poblado: ${promedio_poblado}")

total_ventas = supermercado['belen']['aseo']+supermercado['belen']['frutas']+supermercado['poblado']['aseo']+supermercado['poblado']['frutas']

print(f'El total de ventas del supermercado es: ${total_ventas}')