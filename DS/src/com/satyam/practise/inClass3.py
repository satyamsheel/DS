for i in range(1,33):
    if i<11:
        print('A',end='')
    elif i>= 11 and i<17:
        print('B',end='')
    elif i>=17 and i < 25:
        if i%2==0:
            print('D',end='')
        else:
            print('C',end='')
    elif i==25:
         print('E',end='')
    elif i>=26 and i<32:
        print('F',end='')
    else:
        print('G')