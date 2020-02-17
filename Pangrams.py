def solver(s):
    alpha = "abcdefghijklmnopqrstuvwxyz"
    for i in alpha:
        if(i not in s):
            return False
    return True
s = input().lower()
if(solver(s)):
    print("pangram")
else:
    print("not pangram")
        
