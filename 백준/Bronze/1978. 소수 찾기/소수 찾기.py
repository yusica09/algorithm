def is_prime(n):
    if (n <= 1):
        return False
    for i in range(2, int(n/2) + 1):
        if (n % i) == 0:
            return False
    return True


N = int(input())
numbers = list(map(int, input().split()))

prime_count = 0

for i in range(len(numbers)):
    if(is_prime(numbers[i])):
        prime_count += 1

print(prime_count)