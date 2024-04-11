N = int(input())
x_list = []
y_list = []

for _ in range(N):
  X, Y = map(int,input().split())
  x_list.append(X)
  y_list.append(Y)

a = max(x_list) - min(x_list)
b = max(y_list) - min(y_list)
print(a*b)