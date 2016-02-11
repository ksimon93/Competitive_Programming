n = int(input())
lst = [int(x) for x in input().split(' ')]
lst.sort()
ans = sum(lst)
if ans % 2 == 1:
    for i in lst:
        if (ans - i) % 2 == 0:
            ans -= i
            break
print(ans)

