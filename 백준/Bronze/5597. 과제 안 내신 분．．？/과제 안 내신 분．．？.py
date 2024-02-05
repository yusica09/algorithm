student_list = [0] * 30
x = 0
while(x < 28):
    i = int(input())
    student_list[i-1] = 1
    x += 1

for idx, value in enumerate(student_list):
    if value == 0:
        print(idx + 1)