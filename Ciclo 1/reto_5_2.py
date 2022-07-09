import pandas as pd

def listaPeliculas(rutaFileCsv: str) -> str:
    df = pd.read_csv(rutaFileCsv)
    newdf = df.filter(items=["Country","Language","Gross Earnings"])
    
    table = pd.pivot_table(newdf, index=['Country','Language'])
    #print(table.head(10))
    return (table.head(10))

    #Aquí comienza nuestro código principal
rutaFileCsv = 'https://github.com/luisguillermomolero/MisionTIC2022_2/blob/master/Modulo1_Python_MisionTIC2022_Main/Semana_5/Reto/movies.csv?raw=true'
#listaPeliculas(ruta)

print(listaPeliculas(rutaFileCsv))