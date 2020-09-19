import time
import random
a =[]
for i in range(5000):
    a.append(random.randint(0,1000))

print("For 5K element")
time1 = time.time()
a.sort()
time2 = time.time()
print(time2-time1)

for i in range(10000):
    a.append(random.randint(0, 1000))

print("For 10K element")
time1 = time.time()
a.sort()
time2 = time.time()
print(time2 - time1)

for i in range(15000):
    a.append(random.randint(0, 1000))

print("For 15K element")
time1 = time.time()
a.sort()
time2 = time.time()
print(time2 - time1)

for i in range(20000):
    a.append(random.randint(0, 1000))

print("For 20K element")
time1 = time.time()
a.sort()
time2 = time.time()
print(time2 - time1)

for i in range(25000):
    a.append(random.randint(0, 1000))

print("For 25K element")
time1 = time.time()
a.sort()
time2 = time.time()
print(time2 - time1)