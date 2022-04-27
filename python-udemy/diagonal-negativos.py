ordemMatriz = int(input("Qual a ordem da matriz? "))

matriz = [[0 for x in range(ordemMatriz)] for x in range(ordemMatriz)]

for i in range(0, ordemMatriz):
    for j in range(0, ordemMatriz):
        matriz[i][j] = int(input(f"Elemento [{i},{j}]: "))

print("Diagonal principal:")
for i in range(0, ordemMatriz):
    for j in range(0, ordemMatriz):
        if i == j:
            print(f"{matriz[i][j]} ", end="")

count =0

print()
for i in range(0, ordemMatriz):
    for j in range(0, ordemMatriz):
        if matriz[i][j] < 0:
            count += 1

print(f"Quantida de negativos = {count}")