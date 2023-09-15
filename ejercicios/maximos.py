#Muestra el número mínimo y el máximo de la cadena
import heapq
numeros = [55, 26, 23, 85, 58, 47]
print("El número máximo de la cadena es: ") 
print(heapq.nlargest(1, numeros))
print("El número mínimo de la cadena es: ")
print(heapq.nsmallest(1, numeros))
