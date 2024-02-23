A, B = map(int, input().split())

A_ = (A//100) + (A//10)%10*10 + (A%10)*100
B_ = (B//100) + (B//10)%10*10 + (B%10)*100

if(A_ > B_):
    print(A_)
else:
    print(B_)