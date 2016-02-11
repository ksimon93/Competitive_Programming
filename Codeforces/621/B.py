import math

f = math.factorial
n = int(input())
board = []
for i in range(0,1000):
    board.append([None] * 1000)

for i in range(0,n):
    r,c  =  [int(x) for x in input().split(' ')]
    board[r-1][c-1] = 1

pairs = 0
for temp in range (1, 999):
    count = 0
    r = 0
    c = temp
    while r < 1000 and c < 1000:
        if board[r][c] is not None:
            count += 1
        r += 1
        c += 1

    if (count >= 2):
        pairs += f(count) / (f(2) * f(count-2))

    count = 0
    r = 0
    c = temp
    while r < 1000 and c >= 0:
        if board[r][c] is not None:
            count += 1
        r += 1
        c -= 1

    if (count >= 2):
        pairs += f(count) / (f(2) * f(count-2))

    count = 0
    r = 999
    c = temp

    while r >= 0 and c < 1000:
        if board[r][c] is not None:
            count += 1
        r -= 1
        c += 1

    if (count >= 2):
        pairs += f(count) / (f(2) * f(count-2))

    count = 0
    r = 999
    c = temp

    while r >= 0 and c >= 0:
        if board[r][c] is not None:
            count += 1
        r -= 1
        c -= 1

    if (count >= 2):
        pairs += f(count) / (f(2) * f(count-2))


count = 0
r = 0
c = 0
while r < 1000 and c < 1000:
    if board[r][c] is not None:
        count += 1
    r += 1
    c += 1

if (count >= 2):
    pairs += f(count) / (f(2) * f(count-2))

count = 0
r = 0
c = 999
while r < 1000 and c >= 0:
    if board[r][c] is not None:
        count += 1
    r += 1
    c -= 1

if (count >= 2):
    pairs += f(count) / (f(2) * f(count-2))

print(int(pairs))
