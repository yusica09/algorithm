N = int(input())

canvas = [[False] * 100 for _ in range(100)]

for _ in range(N):
    x, y = map(int, input().split())
    
    for i in range(x, x + 10):
        for j in range(y, y + 10):
            canvas[i][j] = True

res = 0
for i in range(100):
    for j in range(100):
        if canvas[i][j]:
            res += 1

print(res)
