n = str(input("")).split()
a = int(n[0])
b = int(n[1])

if b <= 0:
    q =- (a // abs(b))
    r = a - (q * b)
else:
    q = a // b
    r = a % b
print(q, r)
