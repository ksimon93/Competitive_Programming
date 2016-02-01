input = gets.chomp.split
n = input[0].to_i
m = input[1].to_i
a = input[2].to_i
b = input[3].to_i

ncost = n*a
mcost = 0
while n > m
    mcost += b
    n -= m
end

mcost += [n*a,b].min

puts [ncost, mcost].min
