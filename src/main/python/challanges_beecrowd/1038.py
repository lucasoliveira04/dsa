produtos = [{
    1: 4.0,
    2: 4.5,
    3: 5,
    4: 2,
    5: 1.5
}]

id, qtd = map(int, input().split())

qtd = float(qtd)

for dic in produtos:
    if id in dic:
        valor = dic[id]
        qtd *= valor

print(f'Total: R$ {qtd:.2f}')
