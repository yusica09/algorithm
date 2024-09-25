import math

# 최소공배수(LCM)
def lcm(a, b):
    return abs(a * b) // math.gcd(a, b) # 최소공배수 (gcd)

X, Y = map(int, input().split())

# X와 Y의 최소공배수를 구해서 한 박자 내의 시간 간격을 결정
lcm_xy = lcm(X, Y)

result = []

for i in range(1, lcm_xy + 1):
    left_play = (i % (lcm_xy // X) == 0)  # 왼손이 연주할 시점인지
    right_play = (i % (lcm_xy // Y) == 0)  # 오른손이 연주할 시점인지
    
    if left_play and right_play:
        result.append('3')  
    elif left_play:
        result.append('1') 
    elif right_play:
        result.append('2') 

# 결과 출력
print(''.join(result))
