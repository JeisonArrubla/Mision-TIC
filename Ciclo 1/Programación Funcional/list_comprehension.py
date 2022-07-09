guion = lambda: print('-----------------------------------------------')

numeros = [10,20,30,40,50,60,70,80,90]

numeros_al_cuadrado = [n**2 for n in numeros]
print(numeros_al_cuadrado)

lista = []
for n in numeros:
    lista.append( n**2 )
    
nombres = ['Andrés', 'Juliana', 'Claudia', 'Oliver','Bladimir']

iniciales = [n[0] for n in nombres]

# print(iniciales)
nombres_mayuscula = [n.upper() for n in nombres]

# print(nombres_mayuscula)

guion()

formula = lambda n: (n+10)*2

lista = [formula(n) for n in numeros]
# print(lista)


lista_tuplas = [tuple(n) for n in nombres]
# print(lista_tuplas)

guion()

numeros = [10,20,30,40,50,60,70,80,90,15,25,35,45,55,65,65,75,85,95]

numeros_pares = [n for n in numeros if n%2 == 0]
# print(numeros_pares)

numeros_impares = [n for n in numeros if n%2 != 0]
# print(numeros_impares)

guion()

pares_e_impares = [n if n%2 == 0 else 'impar' for n in numeros]
# print(pares_e_impares)

nombres = ['Andrés', 'Juliana', 'Claudia', 'Oliver', 'Bladimir', 'Juan', 'Jorge', 'Julieta']

nombres_j = [n for n in nombres if n[0].lower() == 'j']
# print(nombres_j)

'''
Imprimir los nombrs que inician en j en minúscula y los demás en mayúscula
'''

nombres_j_upper = [n.lower() if n[0].lower() == 'j' else n.upper() for n in nombres]
print(nombres_j_upper)
