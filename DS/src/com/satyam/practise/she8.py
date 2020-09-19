L = [11, 12, 13, 14]
sum = 0
for num in L:
    if num > 1:
        for i in range(2, num):
            if (num % i) == 0:
                break
        else:
            sum = sum + num

print(sum)
        