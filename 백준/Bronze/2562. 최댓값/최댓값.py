x = 0
maximum = 0
cnt = 0
while(x < 9):
    num = int(input())
    if(maximum < num):
        maximum = num
        cnt = x
    x += 1
print(maximum)
print(cnt+1)