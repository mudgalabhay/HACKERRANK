s = input()
i = 0
while(i<len(s)):
    if(s[i-1]==s[i]):
        s = s[:i - 1] + s[i + 1:]
        i=1
    else:
        i+=1
if(s==""):
    print("Empty String")
else:
    print(s)
