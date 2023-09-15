# Calcular el perímetro del cuadrado
def calcular_perimetro(lado):
    # Calcular el perímetro del cuadrado
    perimetro = 4 * lado
    return perimetro

lado = float(input("Ingrese el valor de la longitud del cuadrado: "))

perimetro_cuadrado = calcular_perimetro(lado)

# Mostrar el resultado
print("El perímetro del cuadrado es:", perimetro_cuadrado)
