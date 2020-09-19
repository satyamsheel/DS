

print("ENTER SALARY")
x=int(input())
gross=0

if x <= 10000:
    gross=x+((0.20*x)+(0.80*x))
elif x <= 20000:
    gross = x + ((0.25 * x) + (0.90 * x))
elif x > 20000:
    gross = x + ((0.30 * x) + (0.95 * x))

print(gross)