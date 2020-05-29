import math
#Naive Method
'''import math
def solver(a,b):
    count = 0
    for i in range(a,b+1):
        #if square root is integer
        if(math.sqrt(i)==round(math.sqrt(i))):
            count+=1
    return count
q = int(input())
for i in range(q):
    a,b = map(int,input().split())
    print(solver(a,b))'''
#O(logb)
def solver(a,b):
    return (math.floor(math.sqrt(b)) - math.ceil(math.sqrt(a)) + 1)
q = int(input())
for i in range(q):
    a,b = map(int,input().split())
    print(solver(a,b))