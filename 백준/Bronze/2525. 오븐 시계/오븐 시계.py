h, m = map(int,input().split())
time = int(input())

if(time + m <= 60) :
    if(time + m != 60) :
        print(h, time+m)
    else:
        if(h != 23):
            print(h+1,'0')
        elif(h == 23):
            print('0','0')
elif(time + m > 60):
    a = (m + time)//60
    if(h + a <= 23):
        print(h+a, (m+time) - (a*60))
    else:
        print(h+a-24, (m+time) - (a*60))