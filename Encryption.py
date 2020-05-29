import math
s = input()
s = s.replace(" ","")
l = math.sqrt(len(s))
row = math.floor(l)
col = math.ceil(l)
#print(s)
#print(row)
#print(col)
res = ""
for i in range(0,col):
    for j in range(i,len(s),col):
        res+=s[j]
    #print(res)
    res+=" "
print(res)