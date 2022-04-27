print("Dados da primeira pessoa:")
nome1 = input("Nome: ")
idade1 = int(input("Idade: "))

print("Dados da segunda pessoa:", end="")
nome2 = input("Nome: ")
idade2 = int(input("Idade: "))

media = (idade1 + idade2) / 2

print("A idade media entre {} e {} é de {:.1f} anos".format(nome1, nome2, media))