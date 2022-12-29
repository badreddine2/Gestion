import sqlite3
import matplotlib.pyplot as plt
conn = sqlite3.connect("revenu.db")
c = conn.cursor()


#c.execute(''' SELECT Mois as m ,(Salaire-Epargne-Bouf-Mom-Fun-Dette-Loyer) as Reste FROM Revenu_2023 ''')

c.execute('''SELECT Mois as Mois ,(Bouf+Mom+Fun+Dette+Loyer)  as Depenses, Salaire-(Epargne+Bouf+Mom+Fun+Dette+Loyer) as Reste from Revenu_2023''')
dette = c.fetchall() ;
result = dette[0]
#print(dette[0][0])

Mois = {}
for i in range(len(dette)):
    Mois[dette[i][0]] = dette[i][1]
print(Mois)





graph = {'Salaire':2229,'Epagne':500,'Bouf': 200, 'Mom':160, 'Fun':53,'Dette' : 130, 'Loyer': 850}






conn.commit()

conn.close()