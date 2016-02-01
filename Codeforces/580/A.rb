n = gets.chomp.to_i
str_arr = gets.chomp.split
int_arr = str_arr.map(&:to_i)

prev = -1
max = 1
streak = 0
int_arr.each do |val|
    if val >= prev
        streak += 1
    else
        streak = 1
    end

    prev = val
    max = [max, streak].max
end

puts max

