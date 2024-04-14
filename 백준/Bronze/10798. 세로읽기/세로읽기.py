matrix = []
for _ in range(5):
    row = input()
    matrix.append(row)
    
max_length = max(len(row) for row in matrix)
      
for j in range(max_length):
  for i in range(5):
      if j < len(matrix[i]):
          print(matrix[i][j],end='')