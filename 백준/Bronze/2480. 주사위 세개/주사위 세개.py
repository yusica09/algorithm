a,b,c = map(int,input().split())
res = 0

if(a == b) :
    if(b == c) :
        # 셋다 같을때
        res = 10000 + a*1000
        print(res)
    else :
        # 둘만 같을 때
        res = 1000 + a*100
        print(res)
elif(a == c):
    # 둘만 같을 때
    res = 1000 + a*100
    print(res)
elif(b == c):
    # 둘만 같을 때
    res = 1000 + b*100
    print(res)
else :
    # 다 다를 때
    if(a>b):
        if(a>c):
            res = a*100
            print(res)
        elif(a<c):
            sum = c*100
            print(sum)
    elif(a<b):
        if(b>c):
            sum = b*100
            print(sum)
        elif(b<c):
            sum = c*100
            print(sum)