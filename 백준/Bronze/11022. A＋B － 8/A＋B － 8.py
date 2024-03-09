T = int(input())

for i in range(T):
    A, B = map(int, input().split())
    res = A + B
    print("Case #{}: {} + {} = {}".format(i+1, A, B, res))