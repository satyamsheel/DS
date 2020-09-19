def compound( principle,  rate, time):
    Amount = principle * (pow((1 + rate / 100), time))
    CI = Amount - principle
    print("COMPOUND INTEREST")
    print(CI)

