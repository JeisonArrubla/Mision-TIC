from functools import reduce


rutinaContable = [
    [1201, ("5464", 4, 25842.99), ("7854", 18, 23254.99), ("8521", 9, 48951.95)],
    [1202, ("8756", 3, 115362.58), ("1112", 18, 2354.99)],
    [1203, ("2547", 1, 125698.20), ("2635", 2, 135645.20),("1254", 1, 13645.20), ("9965", 5, 1645.20)],
    [1204, ("9635", 7, 11.99), ("7733", 11, 18.99), ("88112", 5, 390.95)]
]

[1000,200, 300]


def ordenes(rutinaContable):
    #Iteramos lista principal
    for lista in rutinaContable:
        #Eliminar id de la lista y almacenarlo en una variable 
        #para al final manipular una lista e tuplas
        id = lista.pop(0)
        lista_totales = list(map(lambda tupla: tupla[1]*tupla[2], lista ))
        #Obtener sumatoria total de lista_totales
        total = reduce( lambda ac,e: ac+e, lista_totales )
        print(f"La factura {id} tiene un total en pesos de {total}")


    #print('----------------- Inicio Registro diario --------------------------')
    #print('----------------- Fin Registro diario -----------------------------')

#ordenes(rutinaContable)
numero = 525000.33
print("{:,.2f}".format(numero))
