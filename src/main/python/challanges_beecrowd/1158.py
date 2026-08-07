N = int(input())

for i in range(N):
  X, Y = map(int, input().split())

  if X % 2 == 0:
    X += 1

  soma = 0
  cont = 0
  while cont < Y:
    soma += X
    X += 2
    cont += 1

  print(soma)
