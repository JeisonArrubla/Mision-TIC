import pandas as pd
# ruta file csv
rutaFileCsv = 'https://github.com/luisguillermomolero/MisionTIC2022_2/blob/master/Modulo1_Python_MisionTIC2022_Main/Semana_5/Reto/movies.csv'


def listaPeliculas(rutaFileCsv: str) -> str:
    respuesta = ''
    #Validar que la ruta del archivo termine en csv
    lista_cadenas = rutaFileCsv.split('.')
    if lista_cadenas[ len(lista_cadenas) -1 ].lower() == 'csv':
        try:
            #Cargar los datos
            movies = pd.read_csv(rutaFileCsv)
            #Contruir subDataframe
            subDataframe = movies.loc[ : ,  ['Country','Language','Gross Earnings']]
            #Construir tabla dinámica
            tabla = pd.pivot_table(subDataframe, index=['Country','Language'])
            respuesta = tabla.head(10)
        except:
            respuesta = 'Error al leer el archivo de datos.'
    else:
        respuesta = 'Extensión inválida.'
    
    return respuesta

print(listaPeliculas(rutaFileCsv))
