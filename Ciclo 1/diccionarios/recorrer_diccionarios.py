notas = {
  'nota_1': 3.2,
  'nota_2': 3.0,
  'nota_3': 4.5,
  'nota_4': 4.2
}

#Recorrer diccionario

for x in notas:
  print(x)

print('___________________________________________________')

for x in notas.values(): #Si no ponemos.values() imprime el nombre de las llaves
  print(x)

print('___________________________________________________')

for x in notas:
  print('clave -> ', x)
  valor = notas[x]
  print('valor -> ', valor)

print('___________________________________________________')

for n in notas.values():
  print(n)
  
  # ejercicio 3
  
  estudiantes = {
    '1234': {
        'nombre': 'Bladimir',
        'apellido': 'Diuche',
        'edad': 25,
        'notas': {
            'nota_1': 3.2,
            'nota_2': 3.0,
            'nota_3': 4.5,
            'nota_4': 4.2
        }
    },
    '4321': {
        'nombre': 'Adriana',
        'apellido': 'Quintero',
        'edad': 28,
        'notas': {
            'nota_1': 3.1,
            'nota_2': 4.8,
            'nota_3': 4.2,
            'nota_4': 4.0
        }
    }
}


#Iterar diccionario padre, es decir, 'estudiantes'
for cedula, info in estudiantes.items():
    #Obtener las notas del estudiante
    notas = info['notas']
    promedio_notas = 0
    #Iterar el diccionario 'notas'
    #Ciclo anidado
    for n in notas.values():
        promedio_notas += n
    print(promedio_notas)
""" 
diccionario = {
    'fullname': {'firstname': 'Jeison', 'lastname': 'Diuche'}
}

firstname = diccionario['fullname']['firstname']

fullname = diccionario['fullname']
firstname = fullname['firstname']
 """
#tamanio = len(estudiantes)
#print("tamaño-> ", tamanio)

'''
1) Encapsule el ejercicio anterior dentro de una función que 
    reciba como parámetro el diccionario estudiantes
2) De la función desarrollada RETORNE un diccionario
    el cual relacione el promedio de notas de cada estudiante con
    la cédula, ejemplo:
    {
        '1234': 3.7
    }
    Donde '1234' es la cédula y 3.7 es el promedio de la nota
'''
""" 
persona = {
    '1144558810': {'firstname': 'Jeison', 'lastname': 'Diuche'}
}

for cedula, info in persona.items():
    firstname = info['firstname']

firstname = persona['fullname']['firstname']

fullname = persona['fullname']
firstname = fullname['firstname']
"""