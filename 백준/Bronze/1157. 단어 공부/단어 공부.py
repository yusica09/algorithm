A = input()
B = A.upper()

eng_list = [0]*(ord('Z')-ord('A') + 1)
for i in range(len(B)):
    k = ord(B[i]) - ord('A')
    eng_list[k] += 1

maximum = 0

for j in range(len(eng_list)):
    if(eng_list[maximum] < eng_list[j]):
        maximum = j

max_count = eng_list.count(eng_list[maximum])

if(max_count > 1):
    print('?')
elif(max_count == 1):
    print(chr(maximum + ord('A')))