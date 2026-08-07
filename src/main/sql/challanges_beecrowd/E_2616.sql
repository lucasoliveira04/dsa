select id, name
    from customers c
        where not exists (select id_customers 
                    from locations l
                        where c.id = l.id_customers)
                    
