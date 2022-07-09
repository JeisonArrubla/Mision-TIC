#def -> palabra reservada para crear funciones en Python

#Función sin parámetros y sin retorno
def saludar():
    mensaje = "Hola mundo dentro de una funcion"
    print(mensaje)

saludar()

'''
Estructura de una función:

def nombre_funcion( parámetros(opcionales)):
    mi código
    return (opcional)
'''



#Funciones sin parámetros y con retorno
def sumar():

  num_1 = 10
  num_2 = 20
  return num_1 + num_2

resultado = sumar()

resultado += 10

print(resultado)

#Funciones con parámetros y con retorno

def sumarConParametros(num_1: float, num_2: float):
  sum = num_1 + num_2
  return sum

resp = sumarConParametros(10, 50)

print(resp)


def saludarUsuario( nombre: str):
  return f"Hola {nombre}, nos alegra que nos visites"

print(saludarUsuario("Jeison"))


#Punto 1

def presentacion(nombre: str, ciudad: str):
  return f"Hola {nombre} nos alegra que nos visites desde {ciudad}"

print(presentacion("Jeison", "Medellín"))

#Punto 2

def promedio(nota1: float, nota2: float, nota3: float, nota4: float):
  # suma = nota1 + nota2 + nota3 + nota4
  # prom = suma / 4
  prom = (nota1 + nota2 + nota3 + nota4) / 4
  return prom

print(promedio(5,5,4,4))

#Punto 3

def intereses(capital: int, tasa: float, plazo: int):
  utilidad = (capital * tasa) * plazo
  return utilidad

print(f"La utilidad generada es ${intereses(1000000,0.02,10)}")