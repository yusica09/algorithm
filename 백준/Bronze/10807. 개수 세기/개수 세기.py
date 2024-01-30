A = int(input())
num_list = list(map(int, input().split()))
B = int(input())
count = 0

for i in range(A):
    if(num_list[i] == B):
        count += 1

print(count)