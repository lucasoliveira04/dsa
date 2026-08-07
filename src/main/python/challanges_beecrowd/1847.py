a, b, c = map(int, input("").split())

feliz = False

if a > b and b <= c:
    feliz = True
elif a < b and b >= c:
    feliz = False
elif a < b and b <= c:
    if (c-b) >= (b-a):
        feliz = True
    else:
        feliz = False
elif a > b and b > c:
    if (b-c) < (a-b):
        feliz = True
    else:
        feliz = False
elif a == b:
    if c > b:
        feliz = True
    else:
        feliz = False

if feliz:
    print(":)")
else:
    print(":(")
