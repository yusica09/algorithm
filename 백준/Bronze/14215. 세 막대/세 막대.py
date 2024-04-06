def max_triangle(a, b, c):
    triangle = sorted([a, b, c])
    
    if triangle[2] >= triangle[0] + triangle[1]:
        return (triangle[0] + triangle[1]) * 2 - 1
    else:
        return sum(triangle)

a, b, c = map(int, input().split())

print(max_triangle(a, b, c))
