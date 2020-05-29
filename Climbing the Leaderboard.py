n = int(input())
scores = list(map(int,input().split()))[:n]
m = int(input())
alice = list(map(int,input().split()))[:m]
leaderboard = sorted(set(scores), reverse = True)
#print(leaderboard)
l = len(leaderboard)

for a in alice:
    while (l > 0) and (a >= leaderboard[l-1]):
        l -= 1
    print(l+1)
