
D = {1:'One', 2:'Two', 3:'Three', 4: 'Four', 5:'Five'}
D[6] = 'Six'
print(D)

del D[2]
print(D)

print(D.get(6))
print(len(D))

sum=""
for i in D:
    sum+=D[i]
print(sum)
