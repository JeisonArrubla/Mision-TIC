import pandas as pd

guion = lambda: print('---------------------------------------------------------------')

try:
    #Lectura archivo csv y retorno de dataframe
    movies = pd.read_csv('movies.csv')
    #Consultar info básica del dataframe#
    print( movies.info() )
    guion()
    print(movies.describe())
    title = movies['Title']
    print(title.tail())
    guion()
    print( title.sample(10) )
    guion()
    #Crear subDataframe
    subDataframe = movies.loc[:, ['Title','Genres','Duration','Facebook Likes - Director','Facebook likes - Movie']]
    #print(subDataframe)
    pelis_menor_100 = subDataframe[ subDataframe['Duration'] < 100 ]
    print(pelis_menor_100)

    subDataframe['Total likes'] = subDataframe['Facebook Likes - Director'] + subDataframe['Facebook likes - Movie']
    print(subDataframe.describe())

    guion()
    pelis_populares = subDataframe[ subDataframe['Total likes'] > 30000 ]
    print(pelis_populares)

except:
    print('Error al cargar los datos')
