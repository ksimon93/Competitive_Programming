n = gets.chomp.to_i
count = 0
sum = 0
total = 0
for i in 1..n
    sum += i
    total += sum

    if (total <= n)
        count += 1
    end
end

puts count



