#Booleanos
p = True
q = False
#Indicando el tipo de dato
r: bool = False

if q and p:
    print("And -> Es verdad")
else:
    print('And -> Es Falso')

if q or p:
    print('Or -> Verdad')
else:
    print('Or -> Falso')

if not p:
    print('Cumple')
else:
    print('No cumple')


if not (p and q or r and p):
    print("p and q or r and p -> Es verdad")
else:
    print("p and q or r and p -> Es Falso")


num_1 = 100
num_2 = 200
num_3 = 150

if num_1 >= num_2:
    print("Es mayor o igual")
elif num_1 < num_3:
        print("num_1 es menor a num_3")
else:
    print("No cumple ninguna condición")

opcion = "s"

if opcion == "s":
    print("Opción es 's'")
else:
    print("Opción es diferente de 's'")

if opcion != "s":
    print("Opción es diferente a 's'")

'''
1) Desarrollar una función que reciba como parámetro el nombre y edad de una persona,
    retorne un String que indique si la persona es mayor de edad o menor de edad
    Ejemplo:
        'Pedro Perez es mayor de edad'
        ó 'Pedro Perez es menor de edad'
'''
# 1

def validarEdad(nombre: str, edad: int):
  if edad   < 18:
    return f"{nombre} es menor de edad"
  else: 
    return f"{nombre} es mayor de edad"

print(validarEdad("Jeison",26))

'''
2) Desarrollar una función que retorne un String con una serie de ejercicios al usuario, 
la función debe recibir como parámetro un String.
    facil:
        "10 flexiones de pecho
        10 sentadillas"
    medio:
        "50 flexiones de pecho
        10 burpes
        50 sentadillas"
    avanzado:
        "100 flexiones de pecho con palmada
        80 paracaidistas
        200 abdomilaes"
    NOTA:
        \n -> Salto de linea
        \t -> Tabular
'''
#2

def ejercicios(modo: str):
  mensaje = ''
  if modo == "facil":
    mensaje = "Fácil:\n\t10 flexiones de pecho\n\t10 sentadillas"
  elif modo == "medio":
    mensaje = "Medio:\n\t10 flexiones de pecho\n\t10 sentadillas\n\t10 burpes"
  elif modo == "avanzado":
    mensaje = "Avanzado:\n\t10 flexiones de pecho\n\t10 sentadillas\n\t10 burpes\n\t200 abdominales"
  else:
    mensaje = "El modo no existe"
  return mensaje

print(ejercicios("avanzado"))

#3

''''3) Desarrollar una función que retorne una cadena con el valor del interes y 
el total del dinero a retirar de un CDT.
    * Si el usuario retira el dinero menor o igual a dos meses se 
        aplica una penalidad del 2%(0.02)
        valor_penalidad = dinero_invertido * 0.02
    *Si el usuario retira el dinero mayor a dos meses recibirá un interés sobre su dinero
        valor_interes = (dinero * porcentaje_interes * tiempo) / 12
    
    NOTA:
        La función deberá recibir como parámetro: dinero, porcentaje_interes, tiempo
    
    Ejemplo de la cadena que debe retornar si no aplica penalidad:
        "*El valor del interés es de {valor_interes} 
         *El total del dinero a retirar es {total_dinero}"
    Si aplica penalidad:
        "*El valor de la penalidad es de {valor_penalidad}
        *El total del dinero a retirar es {total_dinero}"'''


def utilidadCDT(dinero: int, porcentajeInteres: float, tiempo: int):
  valorInteres = 0
  totalDinero = 0
  valor_penalidad = 0
  mensaje = ''
  if tiempo > 2:
    valorInteres = (dinero * porcentajeInteres * tiempo) / 12
    totalDinero = dinero + valorInteres
    mensaje = f"El valor de interés es de ${valorInteres}\nEl total del dinero a retirar es ${totalDinero}"
  else:
    valor_penalidad = dinero * 0.02
    totalDinero = dinero - valor_penalidad
    mensaje = f'El valor de la penalidad es de ${valor_penalidad}\nEl total del dinero a retirar es ${totalDinero}'
  return mensaje

print(utilidadCDT(1000000,0.10,2))