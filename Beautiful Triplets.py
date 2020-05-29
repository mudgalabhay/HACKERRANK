n,d = map(int,input().split())
arr = list(map(int,input().split()))[:n]
count = 0
for i in range(n):
    if((arr[i]+d in arr) and (arr[i]+2*d) in arr):
        count+=1
print(count)