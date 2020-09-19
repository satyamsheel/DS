import random

a = []

odd = 0
even =0
prime = 0
for i in range(100):
    a.append(random.randint(100,900))
print(a)

print("EVEN NUMBERS")
for i in range(100):
    if a[i]%2==0:
        print(a[i] , end=' ')

print()
print("ODD NUMBERS")
for i in range(100):
    if a[i] % 2 == 1:
        print(a[i], end = ' ')


