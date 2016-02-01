input = gets.chomp.split
n = input[0].to_i
m = input[1].to_i

arr = []
for i in 0..n-1
    arr[i] = Array.new(m)
    arr[i].fill('.')
end

i = 0
while i < n do
    arr[i].fill('#')
    i += 2
end

right = true
i = 1
while i < n do
    if right
        arr[i][m-1] = '#'
    else
        arr[i][0] = '#'
    end
    right = !right
    i += 2
end

arr.each do |row|
    puts row.join
end
