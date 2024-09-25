N = int(input())

matrix = [[0 for j in range(20)] for i in range(10)]

for _ in range(N):
  k = input()
  t = ord(k[0]) - ord('A')
  matrix[t][int(k[1:])-1] = 1

def print_matrix(matrix):
  for i in range(10):
    for j in range(20):
      if matrix[i][j] == 1:
        print('o', end='')
      else :
        print('.', end='')
    print()

print_matrix(matrix)