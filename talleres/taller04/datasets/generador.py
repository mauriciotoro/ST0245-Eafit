import os
for size in range(1000000,20000000,1000000):
    filename = "array-of-size-"+str(size)+".csv"
    theFile = open(filename,"w")
    for i in range(0,size):
        if i == size-1:
            theFile.write(str(i))
        else:
            theFile.write(str(i)+",")
    theFile.close()
    os.system("zip "+filename.replace("csv","zip")+" "+filename)
    os.system("rm "+filename)
    
