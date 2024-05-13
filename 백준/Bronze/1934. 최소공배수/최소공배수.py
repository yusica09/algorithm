import sys
import math

T = int(sys.stdin.readline().strip())

for _ in range(T):
    A, B = map(int, sys.stdin.readline().strip().split())
    lcm = A * B // math.gcd(A, B)
    print(lcm)
