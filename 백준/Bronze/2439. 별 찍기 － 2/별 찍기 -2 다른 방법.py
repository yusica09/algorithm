import sys

rep = int(sys.stdin.readline())

for i in range(1, rep+1):
    print(" "*(rep-i) + "*"*(i))
