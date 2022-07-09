from functools import reduce


numeros = [1,2,3,4,5]

sumar = lambda acumulador, elemento : acumulador+elemento

respuesta = reduce(sumar, numeros)
print(respuesta)

respuesta = reduce( lambda acumulador, elemento : acumulador+elemento, numeros )
print(respuesta)

nombre = 'Juan'
separar = lambda ac, e: ac+'-'+e 
respuesta = reduce(separar, nombre)
print(respuesta)
