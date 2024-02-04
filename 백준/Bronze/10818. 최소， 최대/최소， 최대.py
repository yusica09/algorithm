A = int(input())
num_list = list(map(int, input().split()))

minimum = 1000000
maximum = -1000000

for i in num_list:
    if i < minimum:
        minimum = i
    if i > maximum:
        maximum = i
print(minimum,end=' ')
print(maximum)