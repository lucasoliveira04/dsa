quantity_ask = int(input())
respostas = []

for i in range(quantity_ask):
    respostas.append(input())

for i, resposta in enumerate(respostas):
    print(f"resposta {i + 1}: {resposta}")
