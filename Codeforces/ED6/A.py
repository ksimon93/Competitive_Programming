(x1,y1) = [int(x) for x in input().split(' ')]
(x2,y2) = [int(x) for x in input().split(' ')]

dx = abs(x1-x2)
dy = abs(y1-y2)

mn = min(dx, dy)
mx = max(dx, dy)
print(mn + (mx-mn))
