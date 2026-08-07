portions = [int(input()) for _ in range(5)]

grams_per_portion = [300, 1500, 600, 1000, 150]

total = sum(p * g for p, g in zip(portions, grams_per_portion))

total += 225

print(total)
