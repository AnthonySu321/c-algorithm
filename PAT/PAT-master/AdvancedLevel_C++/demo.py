filename='XDATCAR'

with open(filename,'r') as file:
    line = file.readline()
    counts=1
    while line:
        if counts>=50:
            break
        line =file.readline()
        counts+=1