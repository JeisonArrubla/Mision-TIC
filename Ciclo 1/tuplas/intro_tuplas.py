tupla = tuple()

tuplaSencilla = ("hola mundo",)
print(tuplaSencilla)

tupla_numeros = 10,20,30
print(tupla_numeros[0])
print(tupla_numeros)
print('------------DESEMPAQUETADO DE TUPLAS------------')
n1,n2,n3 = tupla_numeros
print(n1)
print(n2)
print(n3)

#No se puede hacer (una tupla es inmutable)
#tupla_numeros[0] = 50

#Función que retorna una tupla
def numeros():
    n1 = 10
    n2 = 20

    return n1,n2


print('------------DE LISTAS A TUPLAS------------')
lista_numeros = [10,20,30,40,50,60]
tupla_numeros = tuple(lista_numeros)
print(tupla_numeros)
