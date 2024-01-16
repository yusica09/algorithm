num = int(input())
rep = int(input())

total = 0

for i in range(rep):
    price, i = map(int, input().split())
    total += price * i

if(num == total):
    print('Yes')
elif(num != total):
    print('No')