T = int(input())
T_list = []
for _ in range(T):
    text = input()
    T_list.append(text[0]+text[-1])
    
for i in range(len(T_list)):
    print(T_list[i])