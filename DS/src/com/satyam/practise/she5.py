import time
time1 = time.time()

for i in range(0,1000000):
    a=1

time2 = time.time()
print("Time Taken is")
print(time2-time1)