N = int(input())

i = 0
S = 0

while S < N :
  i += 1
  S += i
    
S -= i
N -= S

if(i % 2 == 0) :
  q = i - N + 1
  p = N
elif(i % 2 == 1) :
  q = N
  p = i - N + 1

print(f'{p}/{q}')