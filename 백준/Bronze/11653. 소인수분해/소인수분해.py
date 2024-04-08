N = int(input())

def fineFactor(n):
    factor = 2
    while (factor < (n//2)):
        while (n % factor) == 0:
            print(factor)
            n //= factor
        factor += 1
    if n > 1:
        print(n)

fineFactor(N)