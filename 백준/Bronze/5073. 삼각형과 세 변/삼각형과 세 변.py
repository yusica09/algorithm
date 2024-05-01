def findTriagle(a,b,c):
  if max(a, b, c) < (a + b + c - max(a, b, c)):
    if a == b and b == c:
      print("Equilateral")
    elif a == b:
      print("Isosceles")
    elif b == c:
      print("Isosceles")
    elif a == c:
      print("Isosceles")
    else :
      print("Scalene")
  else :
    print("Invalid")

a, b, c = map(int, input().split())

while(a != 0 and b != 0 and c != 0):
    findTriagle(a,b,c)
    a, b, c = map(int, input().split())