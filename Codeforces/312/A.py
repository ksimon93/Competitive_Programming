def main():
    n = int(input())
    ans = []
    for _ in range(0,n):
        ans.append(solve(input()))

    for a in ans:
        print(a)

def solve(s):
    if len(s) >= 5:
        start = s[0:5]
        end = s[len(s)-5:len(s)]
        if start == 'miao.' and end == 'lala.':
            return "OMG>.< I don't know!"
        elif start == 'miao.':
            return "Rainbow's"
        elif end == 'lala.':
            return "Freda's"
    return "OMG>.< I don't know!"


if __name__ == '__main__':
    main()

