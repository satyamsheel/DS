import random
math = []
science = []
english = []
it = []

for i in range(10):
    math.append(random.randint(0,100))
    science.append(random.randint(0, 100))
    english.append(random.randint(0, 100))
    it.append(random.randint(0, 100))

print("MATH")
print(max(math))
print(min(math))
print(sum(math)/len(math))

print("SCIENCE")
print(max(science))
print(min(science))
print(sum(science)/len(science))

print("IT")
print(max(it))
print(min(it))
print(sum(it)/len(it))

print("ENGLISH")
print(max(english))
print(min(english))
print(sum(english)/len(english))

