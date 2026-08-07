import pandas as pd

def dropMissingData(students: pd.DataFrame) -> pd.DataFrame:
    query = students.dropna(subset='name')[['student_id', 'name', 'age']]
    return query
