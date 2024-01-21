rep = int(input())

cnt = 1

for i in range(rep):
    a, b = map(int, input().split())
    print("Case #",end="")
    print(cnt,end="")
    print(":", a+b)
    cnt += 1