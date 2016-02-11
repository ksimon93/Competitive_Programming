(a, b) = [input(), input()]
while a[0] == '0' and len(a) > 1:
    a = a[1:]

while b[0] == '0' and len(b) > 1:
    b = b[1:]

(cmpA, cmpB) = (0,0)
if len(a) == len(b):
    for i in range(0, len(a)):
        if a[i] != b[i]:
            (cmpA, cmpB) = (a[i], b[i])
            break
else:
    (cmpA, cmpB) = (len(a), len(b))

if cmpA > cmpB:
    print('>')
elif cmpA < cmpB:
    print('<')
else:
    print('=')
