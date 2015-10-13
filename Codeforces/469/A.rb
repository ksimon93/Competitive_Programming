require 'set'
n = gets.chomp.to_i
line = gets.chomp.split
set = Set.new

p = line[0].to_i
for i in 1..p
    set.add(line[i].to_i)
end


line = gets.chomp.split
p = line[0].to_i
for i in 1..p
    set.add(line[i].to_i)
end

if set == (1..n).to_a.to_set
    puts "I become the guy."
else
    puts "Oh, my keyboard!"
end

