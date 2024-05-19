import sys
input = sys.stdin.read

def findPrime(m, n):
    prime = [True] * (n + 1)
    p = 2
    
    while p * p <= n:
        if prime[p] == True:
            for i in range(p * p, n + 1, p):
                prime[i] = False
        p += 1
        
    for p in range(max(m, 2), n + 1):
        if prime[p]:
            print(p)
            
m, n = map(int, input().strip().split())
findPrime(m, n)
