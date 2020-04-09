def count(l,m,n):
    table = [[0 for i in range(m)]for j in range(n+1)]

    for i in range(m):
        table[0][i] = 1
    
    for i in range(1,n+1):
        for j in range(m):
            if(i-l[j]>=0):
                x = table[i-l[j]][j]
            else:
                x = 0
            if(j>=1):
                y = table[i][j-1]
            else:
                y = 0
            table[i][j] = x+y
    return table[n][m-1]
n,m = map(int,input().split())
l = list(map(int,input().split()))[:m]
print(count(l,m,n))
