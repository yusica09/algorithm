A = input()
cnt = 0
k = len(A)
for i in range(k//2):
    if(A[i] != A[k-i-1]):
        cnt += 1
if(cnt == 0):
    print('1')
elif(cnt != 0):
    print('0')