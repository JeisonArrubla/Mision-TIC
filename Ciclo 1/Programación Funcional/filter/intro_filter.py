numeros = [10,15,20,25,30,35,40,45,50,55]

pares = lambda n: n % 2 == 0
impares = lambda n: n % 2 != 0

respuesta = list(filter( pares, numeros))
print(respuesta)
respuesta = list(filter( impares, numeros))
print(respuesta)


# Ejercicio 1

nombres = ['Andres', 'Juan', 'Juliana', 'Iván', 'Hugo', 'Oliver', 'Jairo']

funcion = lambda name: name[0].lower() == 'j'
nombres_filtrados = list(filter(funcion, nombres))
print(nombres_filtrados)