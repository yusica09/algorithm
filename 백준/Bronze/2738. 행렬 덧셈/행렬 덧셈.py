def get_matrix(N, M):
    matrix = []
    for _ in range(N):
        row = list(map(int, input().split()))
        matrix.append(row)
    return matrix

A,B = map(int, input().split())

first_M = get_matrix(A,B)
second_M = get_matrix(A,B)

for i in range(A):
  for j in range(B):
    first_M[i][j] = first_M[i][j] + second_M[i][j]

for i in range(A):
  for j in range(B):
    print(first_M[i][j],end=' ')
  print()