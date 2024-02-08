N, M = map(int,input().split())
num_list = [0] * N
for i in range(N):
    num_list[i] = i+1

for i in range(M):
    i,j = map(int,input().split())
    temp = num_list[i-1:j]
    temp.reverse()
    num_list[i-1:j] = temp

for value in num_list:
    print(value,end=' ')