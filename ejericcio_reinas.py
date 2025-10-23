size = 8
tablero = [['.' for _ in range(size)] for _ in range(size)]

def es_valido(tablero, fila, col):
    # Verifica si la reina se puede colocar en tablero[fila][col]
    for i in range(size):
        # Misma columna
        if tablero[i][col] == 'Q':
            if i != fila:
                return False
    # Verificar diagonales
    for i in range(1, size):
        if fila-i >= 0 and col-i >= 0:
            if tablero[fila-i][col-i] == 'Q':
                return False
        if fila-i >= 0 and col+i < size:
            if tablero[fila-i][col+i] == 'Q':
                return False
        if fila+i < size and col-i >= 0:
            if tablero[fila+i][col-i] == 'Q':
                return False
        if fila+i < size and col+i < size:
            if tablero[fila+i][col+i] == 'Q':
                return False
    return True

def resolver(tablero, fila):
    if fila == size:
        return True
    if 'Q' in tablero[fila]:
        # Ya hay una reina aquí, pasar a la siguiente fila
        return resolver(tablero, fila+1)
    for col in range(size):
        if es_valido(tablero, fila, col):
            tablero[fila][col] = 'Q'
            if resolver(tablero, fila+1):
                return True
            tablero[fila][col] = '.'
    return False

# Entrada validada
while True:
    fila_inicio = int(input('Fila inicial (0-7): '))
    if 0 <= fila_inicio < size:
        break
    print("Fila fuera de rango. Intenta de nuevo.")
while True:
    col_inicio = int(input('Columna inicial (0-7): '))
    if 0 <= col_inicio < size:
        break
    print("Columna fuera de rango. Intenta de nuevo.")

# Colocar la reina inicial
tablero[fila_inicio][col_inicio] = 'Q'

# Resolver considerando esa reina
hay_solucion = resolver(tablero, 0)

# Mostrar resultado
if hay_solucion:
    print('\n  ' + ' '.join(str(c) for c in range(size)))
    for f in range(size):
        print(f, end=' ')
        for c in range(size):
            print(tablero[f][c], end=' ')
        print()
else:
    print("No hay solución desde ese punto.")
