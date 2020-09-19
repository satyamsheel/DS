D = {1:'ONE', 2:'TWO', 3:"THREE", 4:"FOUR",5:"FIVE"}

with open("DATA.txt",'w') as f:
    for key, value in D.items():
        f.write('%s:%s\n'%(key,value))