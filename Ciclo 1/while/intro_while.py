contador = 0

while contador < 10:
  print('contador ->', contador)
  contador += 1

print('______________________________')

contador = 0
while True: 
  print(contador)
  contador += 1
  if contador == 100:
    #break -> rompe el ciclo, se debe evitar en lo posible
    break