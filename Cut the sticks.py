def solver(n,arr):
    arr.sort()
    i = 0
    while(i<n):
        print(n-i)
        cmin = arr.count(arr[i])
        i+=cmin
n = int(input())
arr = list(map(int,input().split()))[:n]
solver(n,arr)