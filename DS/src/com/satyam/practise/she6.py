D = {'Tiwari':486, 'Abhishek':401, 'Saurav':350, 'Rohit':500, 'Palak':200}
print(D)

temp = min(D.values())
res = [key for key in D if D[key] == temp]
print("Minimum Marks")
print(str(res))

temp = max(D.values())
res = [key for key in D if D[key] == temp]
print("Maximum Marks")
print(str(res))

sum = 0
for i in D.values():
    sum =sum+ i

print(sum / len(D))