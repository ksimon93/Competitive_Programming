(n,m) = [int(x) for x in input().split(' ')]

out = 0
for i in range(0,n):
    street = [int(x) for x in input().split(' ')]
    street.sort()
    out = max(out, street[0])

print(out)
