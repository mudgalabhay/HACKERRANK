n = int(input())
arr = list(map(int,input().split()))[:n]
arr.sort()
mindiff = abs(arr[1]-arr[0])
res = [arr[0],arr[1]]
for i in range(1,n-1):
    if(arr[i+1]-arr[i]<mindiff):
        res = []
        res.append(arr[i])
        res.append(arr[i+1])
        mindiff = abs(arr[i+1]-arr[i])
    elif(arr[i+1]-arr[i]==mindiff):
        res.append(arr[i])
        res.append(arr[i+1])
print(*res)