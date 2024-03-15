def find_divisor(N, K):
    num_list = []
    for i in range(1, N + 1):
        if N % i == 0:
            num_list.append(i)
            
    if K <= len(num_list):
        return num_list[K - 1]
    else: 
        return 0

N, K = map(int, input().split())
print(find_divisor(N, K))
