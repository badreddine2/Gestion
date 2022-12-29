import matplotlib.pyplot as plt

data = {'Janvier': 1393, 'Février': 1413, 'Mars': 1313, 'Avril': 1313, 'Mai': 1313, 'Juin': 1263, 'Juillet': 1263, 'Aout': 1313, 'Septembre': 1263, 'Octobre': 1283, 'Novembre': 1313, 'Décembre': 1263}

moyenne =0

for i in data :
    moyenne+=data[i]
print(moyenne/12)

names = list(data.keys())
values = list(data.values())

fig, ax = plt.subplots()
ax.bar(names, values)
plt.show()

