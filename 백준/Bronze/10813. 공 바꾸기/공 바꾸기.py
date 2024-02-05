maximum,cnt = map(int, input().split())
num_list = []
for i in range(maximum):
    num_list.append(i+1)

x=0
while(x < cnt):
    a,b = map(int, input().split())
    num_list[a-1],num_list[b-1] = num_list[b-1],num_list[a-1]
    x += 1
    
output = ' '.join(map(str, num_list))
print(output)