def main():
    global segments
    segments = [None] * 1000001
    segments[0] = 6
    segments[1] = 2
    segments[2] = 5
    segments[3] = 5
    segments[4] = 4
    segments[5] = 5
    segments[6] = 6
    segments[7] = 3
    segments[8] = 7
    segments[9] = 6

    for i in range(10, 1000001):
        segments[i] = get_segments(i)

    sum = 0
    (a,b) = [int(x) for x in input().split(' ')]
    for i in range(a,b+1):
        sum += segments[i]

    print(sum)

def get_segments(val):
    global segments
    count = 0
    while val != 0:
        if segments[val] != None:
            return count + segments[val]
        count += segments[(val % 10)]
        val //= 10
    return count

if __name__ == "__main__":
    main()
