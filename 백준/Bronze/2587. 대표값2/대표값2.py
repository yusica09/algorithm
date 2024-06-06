numbers = []
    
for _ in range(5):
    number = int(input())
    numbers.append(number)
    
numbers.sort()
    
a = sum(numbers) // 5
print(a)
    
m = numbers[2]
print(m)
