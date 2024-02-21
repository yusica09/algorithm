T = int(input())

for _ in range(T):
    cnt, word = input().split()
    for x in word:
        print(x*int(cnt), end='')
    print()