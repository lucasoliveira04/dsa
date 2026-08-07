palavra = str(input()).strip().lower()

if len(palavra) > 20:
    exit()

if len(palavra) >= 10:
    print("palavrao")
else:
    print("palavrinha")
