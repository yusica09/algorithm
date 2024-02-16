string = input()
position = [-1]*26
for i in range(len(string)):
    s = string[i]
    num = ord(s)-ord('a')
    if(position[num] == -1):
        position[num] = i

for j in range(len(position)):
    print(position[j],end=' ')