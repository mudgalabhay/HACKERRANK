from sys import maxsize
def maxSubseq(n,l):
    s = 0
    for i in range(n):
        if(l[i]>0):
            s+=l[i]
    return s
def maxSubarraysum(n,l):
    max_so_far = -maxsize - 1
    max_ending_here = 0
    for i in range(n):
        max_ending_here = max_ending_here + l[i]
        if(max_ending_here<0):
            max_ending_here = 0
        if (max_so_far < max_ending_here):
            max_so_far = max_ending_here
    
    return max_so_far
t = int(input())
for i in range(t):
    n = int(input())
    l = list(map(int,input().split()))[:n]
    flag = 0
    for i in range(n):
        if(l[i]>0):
            flag = 1
    if(flag):
        print(maxSubarraysum(n,l),maxSubseq(n,l))
    else:
        print(max(l),max(l))
