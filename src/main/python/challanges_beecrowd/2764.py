date = str(input()).strip()

day, month, year = date[:2], date[3:5], date[6:]

formats = [
    f"{month}/{day}/{year}",
    f"{year}/{month}/{day}",
    f"{day}-{month}-{year}"
]

for fmt in formats:
    print(fmt)
