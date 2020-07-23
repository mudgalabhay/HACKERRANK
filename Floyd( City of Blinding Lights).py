import math

#n-no. of nodes,m-no. of edges
n,m = map(int,input().split())
#init dist matrix
dist = [[math.inf]*n for i in range(n)]

for i in range(m):
    x,y,w = map(int,input().split())
    dist[x-1][y-1] = w

#init diagonal elements as 0
for i in range(n):
    dist[i][i] = 0

for k in range(n):
    for i in range(n):
        for j in range(n):
            dist[i][j] = min(dist[i][j],dist[i][k]+dist[k][j])
print(dist)
q = int(input())
for i in range(q):
    a,b = map(int,input().split())
    if(dist[a-1][b-1]!=math.inf):
        print(dist[a-1][b-1])
    else:
        print("-1")
