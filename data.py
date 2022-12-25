import sqlite3

conn = sqlite3.connect("revenu.db")
c = conn.cursor()

c.execute(''' SELECT sum(Dette)   FROM Revenu WHERE Dette>=0 ''')
c.execute(''' SELECT sum(Epargne)   FROM Revenu ''')



result = c.fetchone();
print(result[0])


conn.commit()

conn.close()