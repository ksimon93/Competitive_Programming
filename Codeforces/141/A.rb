expected = (gets.chomp + gets.chomp).chars.sort.join
actual = (gets.chomp).chars.sort.join
if expected == actual
    puts "YES"
else
    puts "NO"
end
