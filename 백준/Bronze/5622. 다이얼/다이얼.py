def phone_number(a):
    if a in 'ABC':
        return 2
    elif a in 'DEF':
        return 3
    elif a in 'GHI':
        return 4
    elif a in 'JKL':
        return 5
    elif a in 'MNO':
        return 6
    elif a in 'PQRS':
        return 7
    elif a in 'TUV':
        return 8
    elif a in 'WXYZ':
        return 9
    else:
        return 0

string = input()
result = 0

for char in string:
    result += phone_number(char)

print(result + len(string))