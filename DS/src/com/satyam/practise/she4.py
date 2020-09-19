file = open("Primes.txt",'w')
for num in range(600,800):
    if num > 1:
        for i in range(2, num):
            if (num % i) == 0:
                break
        else:
            file.write('%s\n'%(str(num)))
    else:
        print(num, "is not a prime number")