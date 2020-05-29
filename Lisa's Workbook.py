n,k =map(int,input().split())
arr = list(map(int,input().split()))[:n]
count = 0
page = 1
for i in range(n):
    for j in range(1,arr[i]+1):
        if(j==page):
            count+=1
        if(j==arr[i] or j%k==0):
            page+=1
print(count)