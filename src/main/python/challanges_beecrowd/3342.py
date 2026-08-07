n = int(input())

total = n * n
if total % 2 == 0:
    whites = blacks = total // 2
else:
    whites = total // 2 + 1
    blacks = total // 2

print(f"{whites} casas brancas e {blacks} casas pretas")
