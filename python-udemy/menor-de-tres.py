n1 = int(input("Primeiro valor: "))
n2 = int(input("Segundo valor: "))
n3 = int(input("Terceiro valor: "))

menor = 0

if n1 < n2 and n1 < n3:
    menor = n1
elif n2 < n3:
    menor = n2
else:
    menor = n3

print(f"Menor = {menor}")