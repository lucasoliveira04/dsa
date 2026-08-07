import pandas as pd

def createBonusColumn(employees: pd.DataFrame) -> pd.DataFrame:
    salary_double = employees['salary'] * 2
    employees['bonus'] = salary_double
    query_final = employees[['name', 'salary', 'bonus']]
    return query_final
