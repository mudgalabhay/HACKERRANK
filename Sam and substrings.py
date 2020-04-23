#DP solution
num = input()
length=len(num)
total=0
X = [0]
for i in range(length):
    X.append((X[-1]*10+1)%(10**9 +7))
    
for i in range(length):
    toadd=(int(num[i]) *  ( (i+1) *  (X[length-i]%(10**9 +7) )  ))%(10**9 +7)
    total=(total+toadd)%(10**9 +7)
    
print(total)
