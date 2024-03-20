def is_prime(n):
    if (n <= 1):
        return False
    for i in range(2, int(n/2) + 1):
        if (n % i) == 0:
            return False
    return True


N = int(input())
M = int(input())

prime_sum = 0
first_prime = 0

for i in range(N,(M+1)):
    if(is_prime(i)):
      if(first_prime == 0):
        first_prime = i
        prime_sum += i
      else:
        prime_sum += i
      

if (first_prime == 0):
  print("-1")
else :
  print(prime_sum)
  print(first_prime)