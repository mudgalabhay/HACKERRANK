def solver(n,arr):
    lsum = 0
    s = sum(arr)
    for i in range(n):
        s -=arr[i]
        if(lsum==s):
            return True
        lsum+=arr[i]
    return False
t = int(input())
for i in range(t):
    n = int(input())
    arr = list(map(int,input().split()))
    if(solver(n,arr)):
        print("YES")
    else:
        print("NO")