def checkGroupWord(w):
    word = []
    for i in range(len(w)):
        if w[i] not in word:
            word.append(w[i])
        else:
            if w[i-1] != w[i]:
                return False
    return True

count = 0
N = int(input())
for _ in range(N):
    a = input()
    if checkGroupWord(a):
        count += 1

print(count)
