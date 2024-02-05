maximum,cnt = map(int, input().split())
num_list = [0] * maximum

x=0
while(x < cnt):
    start,end,num = map(int, input().split())
    for i in range(start,end+1):
        num_list[i-1] = num
    x += 1
    
output = ' '.join(map(str, num_list))
print(output)