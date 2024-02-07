x = 0
num_list = []
cnt = 0
while(x < 10):
    y = 0
    a = int(input())
    num = a % 42
    
    if num not in num_list:
        cnt += 1
        num_list.append(num)
    x += 1

print(cnt)