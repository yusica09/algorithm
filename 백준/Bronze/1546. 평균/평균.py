num = int(input())
numbers = list(map(int, input().split()))

max_num = 0
for i in numbers:
    if (i > max_num):
        max_num = i

for index in range(len(numbers)):
    numbers[index] = numbers[index] / max_num * 100

mean_value = sum(numbers) / len(numbers)
print(mean_value)