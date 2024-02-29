N = int(input())
M = 2 * N - 1

for i in range(1, N):
    k = 2 * i - 1
    for j in range((M - k) // 2):
        print(' ', end="")
    for j in range(k):
        print('*', end='')
    print()

for i in range(N, 0, -1):
    k = 2 * i - 1
    for j in range((M - k) // 2):
        print(' ', end="")
    for j in range(k):
        print('*', end='')
    print() 