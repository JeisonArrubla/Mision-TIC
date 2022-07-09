nombres = ['andrés', 'julián', 'Iván', 'maría', 'Mónica']

inicial_mayuscula = lambda name: name.replace(name[0], name[0].upper())
lista_respuesta = list(map( inicial_mayuscula, nombres ))
print(lista_respuesta)