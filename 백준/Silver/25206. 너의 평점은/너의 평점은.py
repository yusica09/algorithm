def rating(grade_str):
    if grade_str == 'A+':
        return 4.5
    elif grade_str == 'A0':
        return 4.0
    elif grade_str == 'B+':
        return 3.5
    elif grade_str == 'B0':
        return 3.0
    elif grade_str == 'C+':
        return 2.5
    elif grade_str == 'C0':
        return 2.0
    elif grade_str == 'D+':
        return 1.5
    elif grade_str == 'D0':
        return 1.0
    elif grade_str == 'F':
        return 0.0
    elif grade_str == 'P':
        return None

total_points = 0 
total_grades = 0

for _ in range(20):
    input_str = input()
    name, score, grade = input_str.split()

    score = float(score)
    grade_point = rating(grade)

    if grade_point is not None:
        total_points += score
        total_grades += score * grade_point
        
if total_points > 0:
    res = total_grades / total_points
    print("{:.4f}".format(res))
else:
    print(0)