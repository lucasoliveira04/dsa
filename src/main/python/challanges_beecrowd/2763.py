cpf = str(input()).strip()

parts_cpf = cpf.split('.')
first_part = parts_cpf[0]
second_part = parts_cpf[1]
third_part = parts_cpf[2].split('-')[0]
last_part = parts_cpf[2].split('-')[1]

print(f"{first_part}\n{second_part}\n{third_part}\n{last_part}")
