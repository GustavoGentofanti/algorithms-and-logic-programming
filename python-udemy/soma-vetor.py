qntNumeros = int(input("Quantos numeros voce vai digitar? "))

vet = [0 for x in range(qntNumeros)]

for i in range(0, qntNumeros):
    vet[i] = int(input("Digite um numero: "))

count = 0

print()
print("Numeros negativos:")
for i in range(0, qntNumeros):
    if vet[i] < 0:
        print(f"{vet[i]}")