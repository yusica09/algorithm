cro_alphabet = ['c=','c-','dz=','d-','lj','nj','s=','z=']

string = input()
count = 0
i = 0

while i < len(string):
  if string[i:i+3] in cro_alphabet:
    count += 1
    i += 3
  elif string[i:i+2] in cro_alphabet:
    count += 1
    i += 2
  else:
    count += 1
    i += 1

print(count)