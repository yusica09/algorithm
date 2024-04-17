def find_divisors(n):
    div = []
    for i in range(1, n // 2 + 1):
        if n % i == 0:
            div.append(i)
    return div

def isPerfect(n):
    div = find_divisors(n)
    if sum(div) == n:
        return f"{n} = " + " + ".join(map(str, div))
    else:
        return f"{n} is NOT perfect."

while True:
    n = int(input())
    if n == -1:
        break
    print(isPerfect(n))
