def A():
    start = convert(list(input()))
    end = convert(list(input()))
    moves = []
    count = 0
    
    while(start != end):
        move = '' 
        if (start[0] < end[0]):
            move += 'R'
            start[0] += 1
        elif (start[0] > end[0]):
            move += 'L'
            start[0] -= 1

        if (start[1] < end[1]):
            move += 'U'
            start[1] += 1
        elif (start[1] > end[1]):
            move += 'D'
            start[1] -= 1
        count += 1
        moves.append(move)

    print(count)
    for move in moves:
        print(move)

def convert(input):
    for i in range(0,2):
        temp = ord(input[i])
        if (temp > ord('8')):
            temp -= ord('a')-1
        else:
            temp -= ord('1')-1
        input[i] = temp
    return input
    

if __name__ == '__main__':
    A()
