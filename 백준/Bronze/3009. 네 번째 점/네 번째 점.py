a,b = map(int, input().split())
c,d = map(int, input().split())
e,f = map(int, input().split())

x = 0
y = 0

if(a != c and a != e):
  x = a
elif(c != a and c != e):
  x = c
else:
  x = e

if(b != d and b != f):
  y = b
elif(d != b and d != f):
  y = d 
else:
  y = f

print(x, y)