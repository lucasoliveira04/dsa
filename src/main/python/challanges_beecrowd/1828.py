wins = {
    "tesoura": ["papel", "lagarto"],
    "papel": ["pedra", "Spock"],
    "pedra": ["lagarto", "tesoura"],
    "lagarto": ["Spock", "papel"],
    "Spock": ["tesoura", "pedra"]
}

n = int(input())

for _ in range(1, n + 1):
    sheldon, amy = input().split()
    if sheldon == amy:
        result = "De novo!"
    elif amy in wins[sheldon]:
        result = "Bazinga!"
    else:
        result = "Raj trapaceou!"
    
    print(f"Caso #{_}: {result}")
