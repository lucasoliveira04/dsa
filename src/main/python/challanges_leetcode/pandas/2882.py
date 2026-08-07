import pandas as pd

def dropDuplicateEmails(customers: pd.DataFrame) -> pd.DataFrame:
    query = customers.drop_duplicates(subset='email', keep='first')[['customer_id', 'name', 'email']]
    return query
