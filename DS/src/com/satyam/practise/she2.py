L = {"One", "Two", "Three", "Four", "Five"}

file = open("Length.txt",'w')

for i in L:
    tt = len(i)
    file.write('%s:%s\n' % (i, tt))