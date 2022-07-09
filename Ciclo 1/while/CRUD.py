'''
usuarios = {
    'andres@gmail.com': {
        'nombre': 'andres',
        'apellido': 'quintero',
        'password': '1234567'
    }
}
1) Crear usuario
2) Consultar un usuario por su correo
3) Actualizar usuario
4) Consultar todos los usuarios
5) Eliminar usuario por correo
6) Eliminar todos los usuarios
7) Salir
'''
def crear_usuario(usuarios: dict):
  email = input('Email: ')
  nombre = input('Nombre: ')
  apellido = input('Apellido: ')
  password = input('Password: ')
  # Añadir los datos al diccionario
  usuarios[email] = {
    'nombre': nombre,
    'apellido': apellido,
    'password': password
  }
  print('Usuario creado con éxito\n')

def consultar_por_correo(usuarios: dict):
  email = input('Ingrese el email del usuario a consultar: ')
  # Evaluar si el usuario existe
  if email in usuarios:
    info = usuarios[email]
    # Mostrar la información del usuario
    nombre = info['nombre']
    apellido = info['apellido']
    print(f'----------------------------{email}----------------------------\n')
    print(f'Nombre: {nombre}')
    print(f'Apellido: {apellido}')
  else:
    print(f'El usuario con email {email} no existe en la base de datos')

def actualizar_un_usuario(usuarios: dict):
  opcion = 0
  nombre = ''
  apellido = ''
  password = ''
  mensaje_actualizar = '----------------ACTUALIZAR DATOS----------------\n'
  mensaje_actualizar += 'Indique el dato que desea actualizar:\n'
  mensaje_actualizar += '1) Nombre\n'
  mensaje_actualizar += '2) Apellido\n'
  mensaje_actualizar += '3) Password\n'
  mensaje_actualizar += '>>>'

  email = input('Ingrese el email del usuario que desea actualizar: ')
  if email in usuarios:
    opcion = int(input(mensaje_actualizar))
    if opcion == 1:
      nombre = input('Nuevo nombre: ')
      usuarios[email]['nombre'] = nombre
      print('El nombre se actualizó con éxito')
    elif opcion == 2:
      apellido = input('Nuevo apellido: ')
      usuarios[email]['apellido'] = apellido
      print('El apellido se actualizó con éxito')
    elif opcion == 3:
      password = input('Nueva contraseña: ')
      usuarios[email]['password'] = password
      print('El password se actualizó con éxito')
    else:
      print(f'La opción {opcion} no existe')
  else:
    print(f'El usuario con email {email} no existe en la base de datos')

def eliminar_usuario(usuarios: dict):
  confirmar = 0
  email = input('----------------ELIMINAR USUARIO----------------\nIngrese el email del usuario que desea eliminar: ')
  mensaje_confirmar = f'\n\n¿Está seguro que desea eliminar el usuario {email}?\n'
  mensaje_confirmar += '1) Sí\n'
  mensaje_confirmar += '2) No\n'
  mensaje_confirmar += '>>>'
  if email in usuarios:
    confirmar = int(input(mensaje_confirmar))
    if confirmar == 1:
      usuarios.pop(email)
      print(f'El usuario {email} se eliminó con éxito')
    elif confirmar == 2:
      print('Solicitud cancelada')
    else:
      print(f'La opción {confirmar} no es válida')
  else:
    print(f'El usuario con email {email} no existe en la base de datos')

def eliminar_todos_los_usuarios(usuarios: dict):
  eliminar_usuarios = 0
  mensaje_confirmar = '-------------ELIMINAR TODOS LOS USUARIOS-------------\n¿Está seguro que desea eliminar todos los usuarios?\n'
  mensaje_confirmar += '1) Sí\n'
  mensaje_confirmar += '2) No\n'
  mensaje_confirmar += '>>>'
  eliminar_usuarios = int(input(mensaje_confirmar))
  if eliminar_usuarios == 1:
    usuarios.clear()
    print('La información de todos los usuarios se eliminó con éxito')
  elif eliminar_usuarios == 2:
    print('Solicitud cancelada')
  else:
    print(f'La opción {eliminar_usuarios} no es válida')

def menu():
  # Diccionario que almacena a todos los usuarios
  usuarios: dict = {
    'andres@gmail.com': {
      'nombre': 'andres',
      'apellido': 'quintero',
      'password': '1234567'
    },
    'juliana@gmail.com': {
      'nombre': 'juliana',
      'apellido': 'moreno',
      'password': '654321'
    }
  }
  # Variable que representa la estructura del menú que se muestra en consola
  mensaje_menu = '------CRUD USUARIOS---------\n'
  mensaje_menu += '1) Crear usuario\n'
  mensaje_menu += '2) Consultar un usuario por su correo\n'
  mensaje_menu += '3) Actualizar un usuario\n'
  mensaje_menu += '4) Consultar todos los usuarios\n'
  mensaje_menu += '5) Eliminar usuario por correo\n'
  mensaje_menu += '6) Eliminar todos los usuarios\n'
  mensaje_menu += '7) Salir\n'
  mensaje_menu += '>>>'
  
  opcion = ''
  while opcion != 7:
    # Obtener la opción que ingrese el usuario
    opcion = int(input(mensaje_menu))
    # Evaluar la opción
    if  opcion == 1:
      crear_usuario(usuarios)
    elif opcion == 2:
      consultar_por_correo(usuarios)
    elif opcion == 3:
      actualizar_un_usuario(usuarios)
    elif opcion == 4:
      print(usuarios)
    elif opcion == 5:
      eliminar_usuario(usuarios)
    elif opcion == 6:
      eliminar_todos_los_usuarios(usuarios)
    elif opcion != 7:
      print(f'La opción {opcion} no es válida')

menu()