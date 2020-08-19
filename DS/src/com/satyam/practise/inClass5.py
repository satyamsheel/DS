from array import *
import random
arr=[]
for i in range (5):
    a = []
    for j in range(5):
        a.append(random.randint(0,50))
    arr.append(a)

for i in range(5):
    for j in range(5):
        k= arr[i][j]
        d = {k: arr.count(k)}

for x in d:
    print(d[x])