import sys
def minabsdiff(n,arr):
    arr.sort()
    diff = sys.maxsize
    for i in range(n-1):
        if(arr[i+1]-arr[i]<diff):
            diff = arr[i+1]-arr[i]
    return diff
n = int(input())
arr = list(map(int,input().split()))[:n]
print(minabsdiff(n,arr))
