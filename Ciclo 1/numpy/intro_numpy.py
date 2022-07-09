import numpy as np
from numpy import random as r

guion = lambda : print('-------------------------------------------------')

#Crear una matriz
matriz = np.array( [ [10, 20], [30, 40] ] )
print(matriz)

guion()
flotante = np.array( [ [10, 20], [30, 40.2] ] )
print(flotante)

guion()
string = np.array( [ [10, 20], [30, '40'] ] )
print(string)

guion()
matriz = np.array( [ [10, 20], [30, 40.2], ['50', '60'] ] )
print(matriz)



nombres = ['Juan', 'María', 'Juliana', 'Sebastián']

ganadores = r.choice( nombres, size=r.choice([1,2], size=[1]), p=[0.1, 0.2, 0.5, 0.2], replace=False )
print(ganadores)

guion()
print('Operaciones')
guion()

numeros_1 = np.array([ [10,20,30,40], [50,60,70,80] ]) 
numeros_2 = np.array([ [12,15,20,90], [70,60,50,40] ]) 

#Sumar
suma = np.add( numeros_1, numeros_2 )
suma = numeros_1 + numeros_2
print(suma)

#Restas
guion()
resta = np.subtract( numeros_1, numeros_2 )
resta = numeros_1 - numeros_2
print(resta)

#Multiplicación elemento a elemento
multiplicacion = numeros_1 * numeros_2
print(multiplicacion)

#Dividir
dividir = numeros_1 / numeros_2
print(dividir)

matriz_1 = np.array( [ [2,5,4], [1, 2, 10] ] )
matriz_2 = np.array( [ [10,2], [8,4], [1,5] ] )

guion()
#Multiplicación de matrices
mult = np.dot(matriz_1, matriz_2)
print(mult)

#Reordenar la lista

r.shuffle( nombres )
print(nombres)
