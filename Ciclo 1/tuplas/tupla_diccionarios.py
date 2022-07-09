diccionario_1 = {
    'nombre': 'Juan'
}

diccionario_2 = {
    'nombre': 'María'
}

tupla = (diccionario_1, diccionario_2)
print(tupla)

dic_1, dict_2 = tupla
dic_1['apellido'] = 'Quintana'
dict_2['apellido'] = 'Tolosa'
print(tupla)

print('------------TUPLA DE LISTAS------------')
tupla_listas = ([], [])
print(tupla_listas)
l1,l2 = tupla_listas
l1.append(10)
l1.append(20)
l2.append(30)
l1 = [50,60,70,80]
print(tupla_listas)

l1,l2 = tupla_listas
tupla_listas = l1,l2,[]
print(tupla_listas)
