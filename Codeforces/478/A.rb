input = gets.split
sum = 0
input.each { |num| sum += num.to_i }
if sum != 0 and sum % 5 == 0
    puts sum / 5
else
    puts -1
end
