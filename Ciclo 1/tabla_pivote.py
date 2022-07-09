import pandas as pd
import numpy as np

movies = pd.read_csv('https://raw.githubusercontent.com/luisguillermomolero/MisionTIC2022_2/master/Modulo1_Python_MisionTIC2022_Main/Semana_5/Reto/movies.csv')

#print(movies.info())

subDataFrame = movies.loc[:, ['Director','Gross Earnings','Facebook likes - Movie','User Votes']]
#print(subDataFrame)
#Por defecto aplica la media
#tabla_dinamica = pd.pivot_table(subDataFrame, index=['Director'])
tabla_dinamica = pd.pivot_table(subDataFrame, index=['Director'], aggfunc=[np.size, np.sum])
print(tabla_dinamica.head(10))
