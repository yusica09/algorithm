numbers = []

for _ in range(9):
    row = list(map(int, input().split()))
    numbers.append(row)

max_num = -1
x = 0
y = 0
for i in range(9):
    for j in range(9):
        if numbers[i][j] > max_num:
            max_num = numbers[i][j]
            x = i + 1
            y = j + 1

print(max_num)
print(x, y)
