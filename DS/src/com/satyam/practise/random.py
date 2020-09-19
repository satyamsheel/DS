import random

#writing in existing file
f = open("myfile.txt", "w")
for i in range(1000):
    f.write(random.randint(10,10000))