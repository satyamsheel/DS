import random
L = []
for i in range(100):
    L.append(random.randint(100,900))
count = 0
for num in L:
    if num > 1:
        for i in range(2, num):
            if (num % i) == 0:
                break
        else:
            count = count + 1
            print(num)

print("Number of primes is"+count)
