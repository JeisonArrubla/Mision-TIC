import json 

persona = {}
#Referencias el fichero
with open('persona.json') as archivo:
    #Cargar los datos del archivo json
    persona = json.load(archivo)
    print(persona)

#Referenciar el fichero
with open('personas.json','w') as archivo:
    #Escribir/crear el fichero
    json.dump(persona, archivo)
