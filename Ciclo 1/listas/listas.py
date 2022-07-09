lista_vacia = []
lista_vacia = list()

mi_lista = [5, 3.1416, 'Hola mundo', True, False]

print(mi_lista)

print('----ACCEDER A UN VALOR----')
e1 = mi_lista[0]
print(e1)
e2 = mi_lista[1]
e3 = mi_lista[2]
e4 = mi_lista[3]
e5 = mi_lista[4]
print(e2)
print(e3)
print(e4)
print(e5)

print('------ACTUALIZAR UN VALOR------')
mi_lista[0] = 10
print(mi_lista)

print('-----------AGREGAR ELEMENTOS------------')
nombres = []
print(nombres)
# Agregar elementos a la lista
nombres.append('Juan')
nombres.append('Juliana')
nombres.append('María')
nombres.append('Andrés')
nombres.append('Ricardo')
print(nombres)

print('-------ELIMINAR ELEMENTOS-------')
# Eliminar el último elemento
nombres.pop() 
# Eliinar elementos por índice
nombres.pop(2)
print(nombres)