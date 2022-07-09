def CDT(usuario: str, capital: int, tiempo: int):
  valor_intereses = 0
  valor_total = 0
  porcentaje_intereses = 0.03
  valor_a_perder = 0
  porcentaje_a_perder = 0.02
  mensaje: str = '' 
  if (tiempo > 2):
    valor_intereses =  (capital * porcentaje_intereses * tiempo) / 12
    valor_total = valor_intereses + capital
    mensaje = f'Para el usuario {usuario} La cantidad de dinero a recibir, según el monto inicial {capital} para un tiempo de {tiempo} meses es: {valor_total}'
  else:
    valor_a_perder = capital * porcentaje_a_perder
    valor_total = capital - valor_a_perder
    mensaje = f'Para el usuario {usuario} La cantidad de dinero a recibir, según el monto inicial {capital} para un tiempo de {tiempo} meses es: {valor_total}'
  return mensaje

print(CDT('ER3366',650000,2))