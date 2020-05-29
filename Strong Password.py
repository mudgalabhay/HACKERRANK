special_characters = "!@#$%^&*()-+"
n = int(input())
s = input()[:n]
count = 0
if(any(i.isdigit() for i in s)==False):
    count+=1
if(any(i.isupper() for i in s)==False):
    count+=1
if(any(i.islower() for i in s)==False):
    count+=1
if(any(i in '!@#$%^&*()-+' for i in s)==False):
    count+=1
print(max(count,6-n))

