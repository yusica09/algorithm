x, y, w, h = map(int, input().split())

left_dist = x 
right_dist = w - x 
bottom_dist = y 
top_dist = h - y 

min_dist = min(left_dist, right_dist, bottom_dist, top_dist)
print(min_dist)
