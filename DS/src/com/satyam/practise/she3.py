import random
import string


file=open("String.txt", 'w')
for i in range(100):
    N = random.randint(10,15)
    res = ''.join(random.choices(string.ascii_uppercase +
                             string.digits, k = N))
    file.write('%s\n'%(str(res)))
