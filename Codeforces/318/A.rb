input = gets.split
n = input[0].to_i
k = input[1].to_i
half = (n/2.0).ceil

val = 0
if k > half
    val = 2
    k -= half
else
    val = 1
end

val += 2*(k-1)

print val
