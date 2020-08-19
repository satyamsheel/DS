import numpy as np
import random as ra
import time


row = ra.randint(10,50)
col = ra.randint(10,50)
print("Array 1")
arr1= np.random.randint(20,50,size=(row,col))
print(arr1)
print("Array 2")
arr2= np.random.randint(20,50,size=(row,col))
print(arr2)
print("SUM")
start = time.time()
print(arr1+arr2)
end =time.time()
print("Time taken for addition")
print(end-start)

start = time.time()
print("DIFF")
print(arr1-arr2)
end =time.time()
print("Time taken for subtraction" + end-start)

start = time.time()
print("MULTIPLICATION")
print(arr1*arr2)
end =time.time()
print("Time taken for multiplication" + end-start)

start = time.time()
print("INVERSE ARRAY1")
print(np.linalg.inv(arr1))
end =time.time()
print("Time taken for inversing array 1" + end-start)

start = time.time()
print("INVERSE ARRAY2")
print(np.linalg.inv(arr2))
end =time.time()
print("Time taken for inversing array 2" + end-start)

start = time.time()
print("Vector")
print(np.dot(arr1,arr2))
end =time.time()
print("Time taken for vectorization" + end-start)