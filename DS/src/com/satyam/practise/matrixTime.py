import numpy as np
import time

start = time.time()
arr1= np.random.randint(20,50,size=(2000,2000))
arr2= np.random.randint(20,50,size=(2000,6000))
print(arr1*arr2)
end = time.time()
print(end-start)
