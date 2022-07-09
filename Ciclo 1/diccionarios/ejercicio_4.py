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










#4.1

supermercado = {
    'belen': {
        'aseo': 18000000,
        'frutas': 35000000,
        'gimnasio': 12000000,
        'licor': 45000000,
        'lacteos': 15000000
    },
    'poblado':{
        'aseo': 25000000,
        'frutas': 38000000,
        'gimnasio': 10000000,
        'licor': 40000000,
        'lacteos': 15000000
    },
    'chapinero': {
        'aseo': 20000000,
        'frutas': 25000000,
        'gimnasio': 22000000,
        'licor': 55000000,
        'lacteos': 15000000
    },
    'aeropuerto':{
        'aseo': 35000000,
        'frutas': 18000000,
        'gimnasio': 8000000,
        'licor': 40000000,
        'lacteos': 15000000
    }
}
#Diccionario vacío para almacenar el promedio de ventas de cada sede
promedio_ventas = dict()

for sede, ventas in supermercado.items():
    promedio = 0
    #Iterar el diccionario 'ventas'
    for valor in ventas.values():
        promedio += valor
    #Obtener el tamaño del diccionario ventas
    cant_categorias = len(ventas)
    #Calcular promedio
    promedio /= cant_categorias
    #Añadir el promedio al diccionario 'promedio_ventas'
    promedio_ventas[f'promedio_{sede}'] = promedio

print(promedio_ventas)





""" 
for sede, ventas in supermercado.items():
    aseo = ventas['aseo']
    frutas = ventas['frutas']
    promedio = (aseo+frutas)/2
    print(f'{sede} -> {promedio}')

 """
