import math

N, R = map(int, input().split())
rice = [tuple(map(int, input().split())) for _ in range(N)]

max_rice_count = 0
best_center = (0, 0)

for X in range(-100, 101):
    for Y in range(-100, 101):
        rice_count = 0
        for x_i, y_i in rice:
            distance = math.sqrt((X - x_i) ** 2 + (Y - y_i) ** 2)
            if distance <= R:
                rice_count += 1
        # 더 많은 밥알을 포함하는 중심좌표
        if rice_count > max_rice_count:
            max_rice_count = rice_count
            best_center = (X, Y)

print(best_center[0], best_center[1])